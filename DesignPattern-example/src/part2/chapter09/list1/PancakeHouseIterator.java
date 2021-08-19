package part2.chapter09.list1;

import java.util.ArrayList;

public class PancakeHouseIterator implements Iterator {

  ArrayList items;
  int index = 0;

  public PancakeHouseIterator(ArrayList items) {
    this.items = items;
  }

  @Override
  public boolean hasNext() {
    if (index >= items.size() || items.get(index) == null) {
      return false;
    } else {
      return true;
    }
  }

  @Override
  public Object next() {
    MenuItem menuItem = (MenuItem) items.get(index);
    index++;
    return menuItem;
  }

}
