package part2.chapter04.list6.pizzastore;

import part2.chapter04.list6.pizza.CaliforniaStyleCheesePizza;
import part2.chapter04.list6.pizza.Pizza;

public class CaliforniaPizzaStore extends PizzaStore{

  @Override
  protected Pizza createPizza(String type) {
    Pizza pizza = null;

    if(type.equals("cheese")) {
      pizza = new CaliforniaStyleCheesePizza();
    } else {
      System.out.println("Error");
    }

    return pizza;
  }

}
