package part2.chapter12.list1;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {

  ArrayList quackers = new ArrayList();

  public void add(Quackable quacker) {
    quackers.add(quacker);
  }

  @Override
  public void quack() {
    Iterator iterator = quackers.iterator();
    while (iterator.hasNext()) {
      Quackable quacker = (Quackable) iterator.next();
      quacker.quack();
    }
  }

  @Override
  public void registerObserver(Observer observer) {
    Iterator iterator = quackers.iterator();
    while (iterator.hasNext()) {
      Quackable quacker = (Quackable) iterator.next();
      quacker.registerObserver(observer);
    }
  }

  @Override
  public void notifyObservers() {

  }

}