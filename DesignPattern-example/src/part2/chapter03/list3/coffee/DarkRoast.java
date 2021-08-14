package part2.chapter03.list3.coffee;

import part2.chapter03.list3.Beverage;

public class DarkRoast extends Beverage {

  public DarkRoast(String size) {
    super();
    this.description = "다크 로스트 커피 " + size;
    this.size = size;
  }

  public double cost() {
    switch (size) {
      case "tall":
        return .99;
      case "grande":
        return 1.29;
      case "venti":
        return 1.50;
      default:
        return 0;
    }
  }

}
