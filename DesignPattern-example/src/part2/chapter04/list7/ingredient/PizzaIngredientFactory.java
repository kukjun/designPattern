package part2.chapter04.list7.ingredient;

import part2.chapter04.list7.ingredient.*;

public interface PizzaIngredientFactory {

  public Dough createDough();

  public Sauce createSauce();

  public Cheese createCheese();

  public Veggies[] createVeggies();

  public Pepperoni createPepperoni();

  public Clams createClam();

}
