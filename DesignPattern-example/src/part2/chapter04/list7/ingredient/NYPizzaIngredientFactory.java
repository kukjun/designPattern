package part2.chapter04.list7.ingredient;

import part2.chapter04.list7.ingredient.cheese.ReggianoCheese;
import part2.chapter04.list7.ingredient.clams.FrozenClam;
import part2.chapter04.list7.ingredient.dough.ThinCrustDough;
import part2.chapter04.list7.ingredient.pepperoni.SlicedPepperoni;
import part2.chapter04.list7.ingredient.sauce.MarinaraSauce;
import part2.chapter04.list7.ingredient.veggies.Garlic;
import part2.chapter04.list7.ingredient.veggies.Mushroom;
import part2.chapter04.list7.ingredient.veggies.Onion;
import part2.chapter04.list7.ingredient.veggies.RedPeppers;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

  @Override
  public Dough createDough() {
    return new ThinCrustDough();
  }

  @Override
  public Sauce createSauce() {
    return new MarinaraSauce();
  }

  @Override
  public Cheese createCheese() {
    return new ReggianoCheese();
  }

  @Override
  public Veggies[] createVeggies() {
    Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPeppers()};
    return veggies;
  }

  @Override
  public Pepperoni createPepperoni() {
    return new SlicedPepperoni();
  }

  @Override
  public Clams createClam() {
    return new FrozenClam();
  }

}
