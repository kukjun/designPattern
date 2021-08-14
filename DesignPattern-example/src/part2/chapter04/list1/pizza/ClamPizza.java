package part2.chapter04.list1.pizza;

import part2.chapter04.list1.Pizza;

public class ClamPizza implements Pizza {

  @Override
  public void prepare() {
    System.out.println("preparing ClamPizza");
  }

  @Override
  public void bake() {
    System.out.println("baking ClamPizza");
  }

  @Override
  public void cut() {
    System.out.println("cutting ClamPizza");
  }

  @Override
  public void box() {
    System.out.println("boxing ClamPizza");
  }

}
