package part2.chapter01;

import part2.chapter01.fly.FlyRocketPowered;

public class MiniDuckSimulator {

  public static void main(String[] args) {
    Duck mallard = new MallardDuck();
    mallard.performFly();
    mallard.performQuack();
    mallard.display();
    System.out.println();

    Duck model = new ModelDuck();
    model.performFly();
    model.performQuack();
    model.display();
    model.setFlyBehavior(new FlyRocketPowered());
    model.performFly();
  }

}
