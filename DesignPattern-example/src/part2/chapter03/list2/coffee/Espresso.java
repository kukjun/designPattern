package part2.chapter03.list2.coffee;

import part2.chapter03.list2.Beverage;

public class Espresso extends Beverage {
  
  public Espresso() {
    description = "에스프레소";
  }
  
  @Override
  public double cost() {
    return 1.99;
  }

}
