package part2.chapter04.list7;

public abstract class PizzaStore {
  public Pizza orderPizza(String item) {
    Pizza pizza = null;

    pizza = createPizza(item);

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

    return pizza;
  }

  protected abstract Pizza createPizza(String item);
}
