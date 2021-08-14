package part2.chapter04.list6.pizzastore;

import part2.chapter04.list6.pizza.NYStyleCheesePizza;
import part2.chapter04.list6.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

  @Override
  protected Pizza createPizza(String type) {
    Pizza pizza = null;

    if(type.equals("cheese")) {
      pizza = new NYStyleCheesePizza();
    } else {
      System.out.println("Error");
    }

    return pizza;
  }

}
