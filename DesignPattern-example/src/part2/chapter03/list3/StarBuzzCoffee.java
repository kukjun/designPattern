package part2.chapter03.list3;

import part2.chapter03.list3.add.Mocha;
import part2.chapter03.list3.add.Soy;
import part2.chapter03.list3.add.Whip;
import part2.chapter03.list3.coffee.DarkRoast;
import part2.chapter03.list3.coffee.Espresso;
import part2.chapter03.list3.coffee.HouseBlend;


public class StarBuzzCoffee {

  public static void main(String[] args) {
    Beverage beverage = new Espresso("venti");
    System.out.println(beverage.getDescription() + " $" + beverage.cost());

    Beverage beverage1 = new DarkRoast("tall");
    beverage1 = new Mocha(beverage1);
    beverage1 = new Mocha(beverage1);
    beverage1 = new Whip(beverage1);
    System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

    Beverage beverage2 = new HouseBlend("grande");
    beverage2 = new Soy(beverage2);
    beverage2 = new Mocha(beverage2);
    beverage2 = new Whip(beverage2);
    System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
  }

}