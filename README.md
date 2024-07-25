# Pizzaria Builder 🍕

## Desenvolvedores
- [Giovana Trevizan Barbosa](https://github.com/giovanatrevizanbarbosa)
- [Natan Salvador Ligabô](https://github.com/natansalvadorligabo)

## Visão Geral
Este projeto é um exercício da matéria de DEOO (Desenvolvimento Orientado a Objetos). O Builder é um padrão de projeto criacional extremamente útil, pois permite que você produza diferentes tipos e representações de um objeto usando o mesmo código de construção.

### Exemplo de Implementação
Neste projeto, implementamos o padrão Builder para criar diferentes tipos de pizzas, sem a necessidade de criar um construtor monstruoso.

## Resposta à Discussão Proposta
Quando uma instância do Builder é criada, os atributos são adicionados na memória temporária. Para concretizar a criação da Pizza, é necessário chamar o método `build()`

 ```java
public static class Builder {
  // ...

  public Pizza build() {
    return new Pizza(
      this.cheese,
      this.toppings,
      this.crust,
      this.size
    );
  }
}
```

O `Pizza.Builder` é uma classe interna estática que não possui acesso direto às instâncias da classe externa Pizza. Portanto, para cada nova construção de Pizza, é necessário criar uma nova instância do Builder, adicionar os atributos na memória temporária e usar o método build() para concretizar a criação da Pizza.
