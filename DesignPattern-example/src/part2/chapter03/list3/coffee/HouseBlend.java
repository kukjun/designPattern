package part2.chapter03.list3.coffee;

import part2.chapter03.list3.Beverage;

public class HouseBlend extends Beverage {

  public HouseBlend(String size) {
    super();
    this.size = size;
    description = "하우스 블랜드 커피 " + size;
  }

  @Override
  public double cost() {
    switch (size) {
      case "tall":
        return .89;
      case "grande":
        return 1.19;
      case "venti":
        return 1.39;
      default:
        return 0;
    }
  }

}
