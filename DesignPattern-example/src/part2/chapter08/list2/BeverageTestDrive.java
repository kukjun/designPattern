package part2.chapter08.list2;

public class BeverageTestDrive {

  public static void main(String[] args) {
    TeaWithHook teaWithHook = new TeaWithHook();
    CoffeeWithHook coffeeWithHook = new CoffeeWithHook();

    System.out.println("\n차 준비중...");
    teaWithHook.prepareRecipe();

    System.out.println("\n커피 준비중...");
    coffeeWithHook.prepareRecipe();


  }

}
