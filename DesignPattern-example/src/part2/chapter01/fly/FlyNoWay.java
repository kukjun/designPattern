package part2.chapter01.fly;

import part2.chapter01.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("저는 못날아요");
  }

}
