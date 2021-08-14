package part2.chapter04.list3;

import part2.chapter04.list3.factory.SimplePizzaFactory;

public class PizzaStore {

  public Pizza orderPizza(String type) {
    SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
    Pizza pizza = simplePizzaFactory.createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }

}
