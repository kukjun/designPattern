package part2.chapter03.list3.add;

import part2.chapter03.list3.Beverage;
import part2.chapter03.list3.CondimentDecorator;

public class Mocha extends CondimentDecorator {

  public Beverage beverage;

  public Mocha(Beverage beverage) {
    this.beverage = beverage;
    this.description = beverage.getDescription() + "모카";
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", 모카";
  }

  @Override
  public String getSize() {
    return beverage.getSize();
  }

  public double cost() {
    switch (getSize()) {
      case "tall":
        return .15 + beverage.cost();
      case "grande":
        return .20 + beverage.cost();
      case "venti":
        return .25 + beverage.cost();
      default:
        return 0;
    }
  }

}
