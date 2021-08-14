package part2.chapter04.list7;

import part2.chapter04.list1.pizza.VeggiePizza;
import part2.chapter04.list7.ingredient.NYPizzaIngredientFactory;
import part2.chapter04.list7.ingredient.PizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore {

  @Override
  protected Pizza createPizza(String item) {
    Pizza pizza = null;
    PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

    if(item.equals("cheese")) {
      pizza = new CheesePizza(ingredientFactory);
      pizza.setName("New York Style Cheese Pizza");
    }
    return pizza;
  }

}
