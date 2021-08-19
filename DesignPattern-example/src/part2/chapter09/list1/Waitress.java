package part2.chapter09.list1;

public class Waitress {

  PancakeHouseMenu pancakeHouseMenu;
  DinnerMenu dinnerMenu;

  public Waitress(PancakeHouseMenu pancakeHouseMenu, DinnerMenu dinnerMenu) {
    this.pancakeHouseMenu = pancakeHouseMenu;
    this.dinnerMenu = dinnerMenu;
  }

  public void printMenu() {
    Iterator pancakeIterator = pancakeHouseMenu.createIterator();
    Iterator dinnerIterator = dinnerMenu.createIterator();
    System.out.println("메뉴\n---\n아침 메뉴");
    printMenu(pancakeIterator);
    System.out.println("메뉴\n---\n점심 메뉴");
    printMenu(dinnerIterator);
  }

  public void printMenu(Iterator iterator) {
    while (iterator.hasNext()) {
      MenuItem menuItem = (MenuItem) iterator.next();
      System.out.print("menuItem.getName() = " + menuItem.getName() + " - ");
      System.out.print("menuItem.getPrice() = " + menuItem.getPrice() + " - ");
      System.out.println("menuItem.getDescription() = " + menuItem.getDescription());
    }
  }

}