package part2.chapter04.list3;

public class PizzaTest {

  public static void main(String[] args) {
    PizzaStore pizzaStore = new PizzaStore();
    pizzaStore.orderPizza("cheese");
    System.out.println();
    pizzaStore.orderPizza("veggie");
  }

}
