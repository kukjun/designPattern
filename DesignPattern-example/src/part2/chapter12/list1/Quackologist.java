package part2.chapter12.list1;

public class Quackologist implements Observer {

  @Override
  public void update(QuackObservable duck) {
    System.out.println("Quackologist: " + duck + " just quacked.");
  }

}
