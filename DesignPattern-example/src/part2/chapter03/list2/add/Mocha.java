package part2.chapter03.list2.add;

import part2.chapter03.list2.Beverage;
import part2.chapter03.list2.CondimentDecorator;

public class Mocha extends CondimentDecorator {
  Beverage beverage;

  public Mocha(Beverage beverage) {
    this.beverage = beverage;
  }

  public String getDescription() {
    return beverage.getDescription() + ", 모카";
  }

  public double cost() {
    return .20 + beverage.cost();
  }

}
