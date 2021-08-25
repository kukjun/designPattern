package part2.chapter12.list1;

public class QuackCounter implements Quackable {
  Quackable duck;
  static int numberOfQuacks;

  public QuackCounter(Quackable duck) {
    this.duck = duck;
  }

  @Override
  public void quack() {
    duck.quack();
    numberOfQuacks++;
  }


  public static int getQuack() {
    return numberOfQuacks;
  }

}
