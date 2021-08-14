package part2.chapter03.list2.add;

import part2.chapter03.list2.Beverage;
import part2.chapter03.list2.CondimentDecorator;

public class SteamMilk extends CondimentDecorator {
  Beverage beverage;

  public SteamMilk(Beverage beverage) {
    this.beverage = beverage;
  }

  public String getDescription() {
    return beverage.getDescription() + ", 스팀밀크";
  }

  public double cost() {
    return .10 + beverage.cost();
  }

}
