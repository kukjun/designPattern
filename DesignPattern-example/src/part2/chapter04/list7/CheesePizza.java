package part2.chapter04.list7;

import part2.chapter04.list7.ingredient.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
  PizzaIngredientFactory ingredientFactory;

  public CheesePizza(PizzaIngredientFactory ingredientFactory) {
    this.ingredientFactory = ingredientFactory;
  }


  @Override
  void prepare() {
    System.out.println("Preparing " + name);
    dough = ingredientFactory.createDough();
    sauce = ingredientFactory.createSauce();
    cheese = ingredientFactory.createCheese();
    clams = ingredientFactory.createClam();
    pepperoni = ingredientFactory.createPepperoni();
    veggies = ingredientFactory.createVeggies();
  }

}
