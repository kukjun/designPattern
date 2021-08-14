package part2.chapter01;

public abstract class Duck {

  public FlyBehavior flyBehavior;
  public QuackBehavior quackBehavior;
  public Duck() {
  }

  public abstract void display();

  public void performFly() {
    flyBehavior.fly();
  }

  public void performQuack() {
    quackBehavior.quack();
  }

  public void swim() {
    System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 물에 뜨죠");
  }

  public void setFlyBehavior(FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  public void setQuackBehavior(QuackBehavior quackBehavior) {
    this.quackBehavior = quackBehavior;
  }

}
