package part2.chapter04.list5;

public class NYPizzaStore extends PizzaStore{

  @Override
  protected Pizza createPizza(String type) {
    Pizza pizza = null;

    if(type.equals("cheese")) {
      pizza = new NYStyleCheesePizza();
    } else {
      System.out.println("Error");
    }

    return pizza;
  }

}
