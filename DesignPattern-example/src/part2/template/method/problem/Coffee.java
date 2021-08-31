package part2.template.method.problem;

public class Coffee {

  void prepareRecipe() {
    boilWater();
    brewCoffeeGrinde();
    pourInCup();
    addSugarAndMilk();
  }

  public void boilWater() {
    System.out.println("물 끓이는 중");
  }

  public void brewCoffeeGrinde() {
    System.out.println("필터를 통해서 커피를 우려내는 중");
  }

  public void pourInCup() {
    System.out.println("컵에 따르는 중");
  }

  public void addSugarAndMilk() {
    System.out.println("설탕과 우유를 추가하는 중");
  }

}
