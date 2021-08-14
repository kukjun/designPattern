package part2.chapter03.list2.add;

import part2.chapter03.list2.Beverage;
import part2.chapter03.list2.CondimentDecorator;

public class Soy extends CondimentDecorator {
  Beverage beverage;

  public Soy(Beverage beverage) {
    this.beverage = beverage;
  }

  public String getDescription() {
    return beverage.getDescription() + ", 두유";
  }

  public double cost() {
    return .15 + beverage.cost();
  }

}
