package part2.chapter03.list2.coffee;

import part2.chapter03.list2.Beverage;

public class Decaf extends Beverage {
  public Decaf() {
    this.description = "๋ ์นดํ์ธ";
  }

  public double cost() {
    return 1.05;
  }
}
