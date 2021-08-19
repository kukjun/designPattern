package part2.chapter09.list2;



import java.util.Iterator;

public class Waitress {
  Menu pancakeHouseMenu;
  Menu dinnerMenu;
  Menu cafeMenu;

  public Waitress(Menu pancakeHouseMenu, Menu dinnerMenu, Menu cafeMenu) {
    this.pancakeHouseMenu = pancakeHouseMenu;
    this.dinnerMenu = dinnerMenu;
    this.cafeMenu = cafeMenu;
  }

  public void printMenu() {
    Iterator pancakeIterator = pancakeHouseMenu.createIterator();
    Iterator dinnerIterator = dinnerMenu.createIterator();
    Iterator cafeIterator = cafeMenu.createIterator();
    System.out.println("메뉴\n--- \n아침 식사");
    printMenu(pancakeIterator);
    System.out.println("\n점심 식사");
    printMenu(dinnerIterator);
    System.out.println("\n카페");
    printMenu(cafeIterator);
  }

  private void printMenu(Iterator iterator) {
    while (iterator.hasNext()) {
      MenuItem menuItem = (MenuItem) iterator.next();
      System.out.print("menuItem.getName() = " + menuItem.getName() + " - ");
      System.out.print("menuItem.getPrice() = " + menuItem.getPrice() + " - ");
      System.out.println("menuItem.getDescription() = " + menuItem.getDescription());
    }
  }

}
