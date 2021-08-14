package part2.chapter04.list2.pizza;

import part2.chapter04.list2.Pizza;

public class VeggiePizza implements Pizza {

  @Override
  public void prepare() {
    System.out.println("preparing VeggiePizza");
  }

  @Override
  public void bake() {
    System.out.println("baking VeggiePizza");
  }

  @Override
  public void cut() {
    System.out.println("cutting VeggiePizza");
  }

  @Override
  public void box() {
    System.out.println("boxing VeggiePizza");
  }

}
