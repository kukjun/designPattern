package part2.chapter12.list1;

public class RubberDuck implements Quackable {
  Observable observable;

  public RubberDuck() {
    this.observable = new Observable(this);
  }

  @Override
  public void quack() {
    System.out.println("Squack");
  }

  @Override
  public void registerObserver(Observer observer) {
    observable.registerObserver(observer);
  }

  @Override
  public void notifyObservers() {
    observable.notifyObservers();
  }

}
