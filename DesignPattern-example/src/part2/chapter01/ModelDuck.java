package part2.chapter01;

import part2.chapter01.fly.FlyNoWay;
import part2.chapter01.quack.Quack;

public class ModelDuck extends Duck {
  public ModelDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new Quack();
  }

  @Override
  public void display() {
    System.out.println("저는 모형 오리입니다.");
  }

}
