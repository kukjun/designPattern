package part2.chapter07.list1;

public class DuckAdapter implements Turkey{
  public Duck duck;

  public DuckAdapter(Duck duck) {
    this.duck = duck;
  }

  @Override
  public void gobble() {
    duck.quack();
  }

  @Override
  public void fly() {
    duck.fly();
  }

}
