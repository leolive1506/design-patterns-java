# Padrões de projeto
1) Padrões criacionais: abstract factory, builder, factory method, prototype, singleton
2) Padrões comportamentais: chain of responsibility, iterator, observer, strategy, template method
3) Estruturais: adapter, bridge, composite, decorator, facede, flyweight, proxy
# Referencias
- [Gangs of Four (GoF) Design Patterns](https://www.digitalocean.com/community/tutorials/gangs-of-four-gof-design-patterns)

## Singleton
Permite a criação de uma única instância de uma classe e fornecer um modo de recuperá-la
- Padrão criacional
- Singleton tem uma instancia dele mesmo, para armazenar a instancia dele de maneira estática e retorne sempre a mesma instancia dele mesmo
  - ![image](https://gist.github.com/assets/89431704/98544837-dc15-4919-88ae-258b72138ddd)
```java
/**
 * @see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
 */
public class SingletonLazyHolder {
    private static class InstanceHolder {
        public static final SingletonLazyHolder singletonLazyHolder = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance() {
        return InstanceHolder.singletonLazyHolder;
    }
}
```
```java
public class SingletonLazy {
    private static SingletonLazy singletonLazy;

    // para não permitir que ninguem instancie
    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstance() {
        if (singletonLazy == null) {
            singletonLazy = new SingletonLazy();
        }

        return singletonLazy;
    }
}
```
```java
public class SingletonEager {
    private static final SingletonEager singletonEager = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {
        return singletonEager;
    }
}

```

## Strategy
Visa simpliciar a variação de algoritmos para resolução um mesmo problema
- ![image](https://gist.github.com/assets/89431704/21c3a64a-c3cd-42ed-9d54-5428b850d7c7)
- Ex: simular comportamento de um robo
  - como se robo fosse context
  - e pudesse ter estrategias de movimentação (interface)
- vai haver um objeto principal (context) que irá ter uma strategy(interface) que irá disponibilizar os metodos para esse objetos
  - multiplos objetos podem implementar essa interface e trazer diferentes comportamentos a um objeto
```java
public static void main(String[] args) {
  Comportamento normal = new ComportamentoNormal();
  Comportamento defensivo = new ComportamentoDefensivo();
  Comportamento agressivo = new ComportamentoAgressivo();

  Robo robo = new Robo();
  robo.setStrategy(normal);
  robo.mover();
  robo.mover();
  robo.setStrategy(defensivo);
  robo.mover();
  robo.setStrategy(agressivo);
  robo.mover();
}
```
## Facede
Prover interface que reduza a complexidade nas integracoes com subsistemas
- criar interface de uso mais simples, abstraindo complexidade de integração com sistema x, y
- uma api pode ser conderada uma facede, já que abstrai e expoe essa interface de forma simplificada
- Ex: tenho registro do cliente e buscar informações pelo cep (cidade e estado) e salvar em meu banco de dados
```java
public class Facede {
    public void clientCepInfo(Client client) {
        var cep = client.getCep();
        var city = CepApi.getCidade(cep);
        var state = CepApi..getEstado(cep);

        CrmService.saveClient(client, city, state);
    }
}

```
