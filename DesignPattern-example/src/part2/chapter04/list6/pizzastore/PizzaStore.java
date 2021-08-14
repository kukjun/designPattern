package part2.chapter04.list6.pizzastore;

import part2.chapter04.list6.pizza.Pizza;

public abstract class PizzaStore {
  public Pizza orderPizza(String type) {
    Pizza pizza = null;

    pizza = createPizza(type);

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

    return pizza;
  }

  protected abstract Pizza createPizza(String type);

}
