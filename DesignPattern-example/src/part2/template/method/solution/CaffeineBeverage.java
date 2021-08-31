package part2.template.method.solution;

public abstract class CaffeineBeverage {

  public final void prepareRecipe() {
    boilWater();
    brew();
    pourInCup();
    addCondiments();
  }
  public void boilWater() {
    System.out.println("물을 끓이는 중입니다.");
  }

  public abstract void brew();

  public void pourInCup() {
    System.out.println("컵에 옮겨 담는 중입니다.");
  }

  public abstract void addCondiments();

}
