package part2.chapter01.quack;

import part2.chapter01.QuackBehavior;

public class Squeak implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("삑");
  }

}
