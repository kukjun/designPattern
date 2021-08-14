package part2.chapter03.list3.coffee;

import part2.chapter03.list3.Beverage;

public class Decaf extends Beverage {
  public Decaf(String size) {
    super();
    this.size = size;
    this.description = "디 카페인 " + size;
  }

  public double cost() {
    switch (size) {
      case "tall":
        return 1.05;
      case "grande":
        return 1.35;
      case "venti":
        return 1.60;
      default:
        return 0;
    }
  }
}
