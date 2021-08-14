package part2.chapter01.fly;

import part2.chapter01.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("날고 있어요");
  }

}
