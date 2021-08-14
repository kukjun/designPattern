package part2.chapter04.list4.factory;

import part2.chapter04.list4.Pizza;
import part2.chapter04.list4.pizza.CheesePizza;
import part2.chapter04.list4.pizza.ClamPizza;
import part2.chapter04.list4.pizza.PepperoniPizza;
import part2.chapter04.list4.pizza.VeggiePizza;

public class ChicagoPizzaFactory {

  public Pizza createPizza(String type) {
    Pizza pizza = null;

    if(type.equals("cheese")) {
      pizza = new CheesePizza();
    }
    /**
     * else if(type.equals("greek")) { pizza = new GreekPizza(); } -> 메뉴 변경이 일어남 변화되는 부분
     */
    else if(type.equals("pepperoni")) {
      pizza = new PepperoniPizza();
    }
    else if(type.equals("clam")) {
      pizza = new ClamPizza();
    }
    else if(type.equals("veggie")) {
      pizza = new VeggiePizza();
    }
    return pizza;
  }

}
