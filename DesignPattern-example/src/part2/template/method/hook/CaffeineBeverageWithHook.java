package part2.template.method.hook;

public abstract class CaffeineBeverageWithHook {

  final void prepareRecipe() {
    boilWater();
    brew();
    pourInCup();

    // 특정 조건에 대해서만 addCondiments 메서드 호출
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

  // hook. 서브클래스에서 필요에 따라 오버라이딩 해서 사용할 수 있다.
  boolean customerWantsCondiments() {
    return true;
  }
}