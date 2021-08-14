package part2.chapter04.list7.ingredient;

import part2.chapter04.list7.ingredient.cheese.Mozzarella;
import part2.chapter04.list7.ingredient.clams.FrozenClam;
import part2.chapter04.list7.ingredient.dough.ThickCrustDough;
import part2.chapter04.list7.ingredient.pepperoni.SlicedPepperoni;
import part2.chapter04.list7.ingredient.sauce.PlumTomatoSauce;
import part2.chapter04.list7.ingredient.veggies.BlackOlives;
import part2.chapter04.list7.ingredient.veggies.EggPlant;
import part2.chapter04.list7.ingredient.veggies.Spinach;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

  @Override
  public Dough createDough() {
    return new ThickCrustDough();
  }

  @Override
  public Sauce createSauce() {
    return new PlumTomatoSauce();
  }

  @Override
  public Cheese createCheese() {
    return new Mozzarella();
  }

  @Override
  public Veggies[] createVeggies() {
    Veggies veggies[] = { new Spinach(), new BlackOlives(), new EggPlant()};
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
