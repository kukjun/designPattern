package part2.chapter04.list1;

// 필요로 하는 패키지가 늘어남
import part2.chapter04.list1.pizza.*;

public class PizzaStore {
  public Pizza orderPizza(String type) {
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

    // 메뉴 변경, 확장을 하는데에 PizzaStore 코드 변경이 일어남 OCP 위반

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }

}
