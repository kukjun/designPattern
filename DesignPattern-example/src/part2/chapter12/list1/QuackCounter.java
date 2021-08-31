package part2.chapter12.list1;

public class QuackCounter implements Quackable {
  Observable observable;
  Quackable duck;
  static int numberOfQuacks;

  public QuackCounter(Quackable duck) {
    this.duck = duck;
    observable = new Observable(duck);
  }

  @Override
  public void quack() {
    duck.quack();
    numberOfQuacks++;
    notifyObservers();
  }


  public static int getQuack() {
    return numberOfQuacks;
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
