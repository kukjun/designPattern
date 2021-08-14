package part2.chapter04.list7;

public class PizzaTestDrive {

  public static void main(String[] args) {
    PizzaStore pizzaStore = new NYPizzaStore();
    Pizza pizza = pizzaStore.orderPizza("cheese");
    System.out.println("\n\n" + pizza);
  }

}
