package part2.chapter04.list6.pizzastore;

import part2.chapter04.list6.pizza.ChicagoStyleCheesePizza;
import part2.chapter04.list6.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

  @Override
  protected Pizza createPizza(String type) {
    Pizza pizza = null;

    if(type.equals("cheese")) {
      pizza = new ChicagoStyleCheesePizza();
    } else {
      System.out.println("Error");
    }

    return pizza;
  }

}
