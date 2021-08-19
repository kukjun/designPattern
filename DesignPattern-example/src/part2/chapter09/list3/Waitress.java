package part2.chapter09.list3;

import java.util.Iterator;

public class Waitress {
  MenuComponent allMenu;

  public Waitress(MenuComponent allMenu) {
    this.allMenu = allMenu;
  }

  public void printMenu() {
    allMenu.print();
  }

  public void printVegetarianMenu() {
    Iterator iterator = allMenu.createIterator();
    System.out.println("\n VEGETARIAN MENU\n----");
    while (iterator.hasNext()) {
      MenuComponent menuComponent = (MenuComponent) iterator.next();
      try {
        if (menuComponent.isVegetarian()) {
          menuComponent.print();
        }
      } catch (UnsupportedOperationException e) {
      }
    }
  }

}
