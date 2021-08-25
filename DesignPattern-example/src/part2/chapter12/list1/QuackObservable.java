package part2.chapter12.list1;

import java.util.Observer;

public interface QuackObservable {

  public void registerObserver(Observer observer);
  public void notifyObservers();

}
