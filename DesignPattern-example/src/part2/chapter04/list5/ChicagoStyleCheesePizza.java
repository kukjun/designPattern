package part2.chapter04.list5;

public class ChicagoStyleCheesePizza extends Pizza{

  public ChicagoStyleCheesePizza() {
    name = "Chicago Style Deep Dish Cheese Pizza";
    dough = "Extra Think Crust Dough";
    sauce = "Plum Tomato Sauce";

    topping.add("Shredded Mozzarella Cheese");
  }

  @Override
  void cut(){
    System.out.println("Cutting the pizza into square slices");
  }

}
