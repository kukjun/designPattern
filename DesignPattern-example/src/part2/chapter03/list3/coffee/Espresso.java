package part2.chapter03.list3.coffee;

import part2.chapter03.list3.Beverage;

public class Espresso extends Beverage {
  
  public Espresso(String size) {
    super();
    this.size = size;
    description = "에스프레소 " + size;
  }
  
  @Override
  public double cost() {
    switch (size) {
      case "tall":
        return 1.99;
      case "grande":
        return 2.50;
      case "venti":
        return 2.99;
      default:
        return 0;
    }
  }

}
