package part2.chapter04.list5;

public class ChicagoPizzaStore extends PizzaStore {

  @Override
  protected Pizza createPizza(String type) {
    Pizza pizza = null;

    if(type.equals("cheese")) {
      pizza = new ChicagoStyleCheesePizza();
    } else {
      System.out.println("Error");
    }

    return pizza;
  }

}
