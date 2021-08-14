package part2.chapter04.list6;

import part2.chapter04.list6.pizza.Pizza;
import part2.chapter04.list6.pizzastore.CaliforniaPizzaStore;
import part2.chapter04.list6.pizzastore.ChicagoPizzaStore;
import part2.chapter04.list6.pizzastore.NYPizzaStore;
import part2.chapter04.list6.pizzastore.PizzaStore;

public class PizzaTestDrive {

  public static void main(String[] args) {
    PizzaStore nyStore = new NYPizzaStore();
    PizzaStore chicagoStore = new ChicagoPizzaStore();
    PizzaStore californiaStore = new CaliforniaPizzaStore();

    Pizza pizza = nyStore.orderPizza("cheese");
    System.out.println("Ethan ordered a" + pizza.getName() + "\n");

    pizza = chicagoStore.orderPizza("cheese");
    System.out.println("Joel ordered a " + pizza.getName() + "\n");

    pizza = californiaStore.orderPizza("cheese");
    System.out.println("Kukjun ordered a " + pizza.getName() + "\n");
  }

}
