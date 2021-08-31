package part2.chapter09.list3;

import java.util.Iterator;

public class NullIterator implements Iterator {

  @Override
  public Object next() {
    return null;
  }

  @Override
  public boolean hasNext() {
    return false;
  }

  @Override
  public void remove() {
    throw new UnsupportedOperationException();
  }

}
