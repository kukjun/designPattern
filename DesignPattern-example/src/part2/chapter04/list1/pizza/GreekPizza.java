package part2.chapter04.list1.pizza;

import part2.chapter04.list1.Pizza;

public class GreekPizza implements Pizza {

  @Override
  public void prepare() {
    System.out.println("preparing GreekPizza");
  }

  @Override
  public void bake() {
    System.out.println("baking GreekPizza");
  }

  @Override
  public void cut() {
    System.out.println("cutting GreekPizza");
  }

  @Override
  public void box() {
    System.out.println("boxing GreekPizza");
  }

}
