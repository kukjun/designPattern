package part2.chapter12.list1;

public class GooseAdapter implements Quackable {
  Goose goose;
  Observable observable;

  public GooseAdapter(Goose goose) {
    this.goose = goose;
    observable = new Observable(this);
  }

  public void quack() {
    goose.honk();
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
