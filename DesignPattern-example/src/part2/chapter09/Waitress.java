package part2.chapter09;

public class Waitress {

  PancakeHouseMenu pancakeHouseMenu;
  DinerMenu dinerMenu;

  public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
    this.pancakeHouseMenu = pancakeHouseMenu;
    this.dinerMenu = dinerMenu;
  }

  public void printMenu() {
    Iterator pancakeIterator = pancakeHouseMenu.createIterator();
    Iterator dinerIterator = dinerMenu.createIterator();
    System.out.println("메뉴\n---\n아침 메뉴");
    printMenu(pancakeIterator);
    System.out.println("메뉴\n---\n점심 메뉴");
    printMenu(dinerIterator);
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
