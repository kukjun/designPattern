package part2.chapter01;

import part2.chapter01.fly.FlyWithWings;
import part2.chapter01.quack.Quack;

public class MallardDuck extends Duck {
  public MallardDuck() {
    super();
    this.flyBehavior = new FlyWithWings();
    this.quackBehavior = new Quack();
  }

  @Override
  public void display() {
    System.out.println("평범한 오리입니다.");
  }



}
