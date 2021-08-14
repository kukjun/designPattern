package part2.chapter04.list6.pizza;

import java.util.ArrayList;

public abstract class Pizza {

  String name;
  String dough;
  String sauce;
  ArrayList topping = new ArrayList();

  public void prepare() {
    System.out.println("Preparing " + name);
    System.out.println("Tossing dough...");
    System.out.println("Adding sauce...");
    System.out.println("Adding topping: ");
    for (Object o : topping) {
      System.out.println("  " + o);
    }
  }

  public void bake() {
    System.out.println("Bake for 25 minutes at 350");
  }

  public void cut() {
    System.out.println("Cutting the pizza into diagonal slices");
  }

  public void box() {
    System.out.println("Please pizza in official PizzaStore box");
  }

  public String getName() {
    return name;
  }

}
