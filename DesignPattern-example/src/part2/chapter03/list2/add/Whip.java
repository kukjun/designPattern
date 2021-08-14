package part2.chapter03.list2.add;

import part2.chapter03.list2.Beverage;
import part2.chapter03.list2.CondimentDecorator;

public class Whip extends CondimentDecorator {
  Beverage beverage;

  public Whip(Beverage beverage) {
    this.beverage = beverage;
  }

  public String getDescription() {
    return beverage.getDescription() + ", 휘핑크림";
  }

  public double cost() {
    return .10 + beverage.cost();
  }

}
