package part2.chapter04.list4.pizza;

import part2.chapter04.list4.Pizza;

public class PepperoniPizza implements Pizza {

  @Override
  public void prepare() {
    System.out.println("preparing PepperoniPizza");
  }

  @Override
  public void bake() {
    System.out.println("baking PepperoniPizza");
  }

  @Override
  public void cut() {
    System.out.println("cutting PepperoniPizza");
  }

  @Override
  public void box() {
    System.out.println("boxing PepperoniPizza");
  }

}
