package part2.chapter03.list3.add;

import part2.chapter03.list3.Beverage;
import part2.chapter03.list3.CondimentDecorator;

public class Whip extends CondimentDecorator {
  public Beverage beverage;

  public Whip(Beverage beverage) {
    this.beverage = beverage;
  }

  public String getDescription() {
    return beverage.getDescription() + ", 휘핑크림";
  }

  @Override
  public String getSize() {
    return beverage.getSize();
  }

  public double cost() {
    switch (getSize()) {
      case "tall":
        return .07 + beverage.cost();
      case "grande":
        return .10 + beverage.cost();
      case "venti":
        return .15 + beverage.cost();
      default:
        return 0;
    }
  }

}
