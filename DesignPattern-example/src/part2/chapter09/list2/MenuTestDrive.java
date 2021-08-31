package part2.chapter09.list2;

public class MenuTestDrive {

  public static void main(String[] args) {
    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    DinnerMenu dinnerMenu = new DinnerMenu();
    CafeMenu cafeMenu = new CafeMenu();

    Waitress waitress = new Waitress(pancakeHouseMenu, dinnerMenu, cafeMenu);

    waitress.printMenu();
  }

}
