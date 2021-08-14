package part2.chapter03.list2.coffee;

import part2.chapter03.list2.Beverage;

public class HouseBlend extends Beverage {

  public HouseBlend() {
    description = "하우스 블랜드 커피";
  }

  @Override
  public double cost() {
    return .89;
  }

}
