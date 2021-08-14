package part2.chapter08.list2;

public abstract class CaffeineBeverageWithHook {

  final void prepareRecipe() {
    boilWater();
    brew();
    pourInCup();
    if(customerWantsCondiments())
    addCondiments();

  }

  void boilWater() {
    System.out.println("물을 끓이는 중입니다.");
  }

  abstract void brew();

  void pourInCup() {
    System.out.println("컵에 옮겨 담는 중입니다.");
  }

  abstract void addCondiments();

  boolean customerWantsCondiments() {
    return true;
  }
}
