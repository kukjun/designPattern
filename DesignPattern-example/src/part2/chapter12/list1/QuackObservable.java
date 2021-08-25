package part2.chapter12.list1;

public interface QuackObservable {

  public void registerObserver(Observer observer);
  public void notifyObservers();

}
