package part2.chapter04.list4;

import part2.chapter04.list4.store.ChicagoPizzaStore;
import part2.chapter04.list4.store.PizzaStore;

public class PizzaApp {

  public static void main(String[] args) {
    PizzaStore pizzaStore = new ChicagoPizzaStore();
    pizzaStore.orderPizza("cheese");
    System.out.println();
    pizzaStore.orderPizza("veggie");
  }

}
