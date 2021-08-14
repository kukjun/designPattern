package part2.chapter04.list1.pizza;

import part2.chapter04.list1.Pizza;

public class CheesePizza implements Pizza {

  @Override
  public void prepare() {
    System.out.println("preparing CheesePizza");
  }

  @Override
  public void bake() {
    System.out.println("baking CheesePizza");
  }

  @Override
  public void cut() {
    System.out.println("cutting CheesePizza");
  }

  @Override
  public void box() {
    System.out.println("boxing CheesePizza");
  }

}
