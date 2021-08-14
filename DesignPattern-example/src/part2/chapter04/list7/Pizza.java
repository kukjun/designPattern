package part2.chapter04.list7;

import part2.chapter04.list7.ingredient.*;

import java.util.Arrays;

public abstract class Pizza {
  String name;
  Dough dough;
  Sauce sauce;
  Veggies veggies[];
  Cheese cheese;
  Pepperoni pepperoni;
  Clams clams;

  abstract void prepare();

  void bake() {
    System.out.println("Bake for 25 minutes at 350");
  }

  void cut() {
    System.out.println("Cutting the pizza info diagonal slices");
  }

  void box() {
    System.out.println("Place pizza in official PizzaStore Box");
  }

  void setName(String name) {
    this.name = name;
  }

  String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Pizza{" +
        "name='" + name + '\'' +
        ", dough=" + dough +
        ", sauce=" + sauce +
        ", veggies=" + Arrays.toString(veggies) +
        ", cheese=" + cheese +
        ", pepperoni=" + pepperoni +
        ", clams=" + clams +
        '}';
  }

}
