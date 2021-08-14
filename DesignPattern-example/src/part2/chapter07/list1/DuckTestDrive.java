package part2.chapter07.list1;

public class DuckTestDrive {

  public static void main(String[] args) {
    MallardDuck duck = new MallardDuck();
    WildTurkey wildTurkey = new WildTurkey();
    Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
    Turkey duckAdapter = new DuckAdapter(duck);

    System.out.println("The Turkey says");
    wildTurkey.gobble();
    wildTurkey.fly();

    System.out.println("The Duck says");
    duck.quack();
    duck.fly();

    System.out.println("The turkeyAdapter says");
    turkeyAdapter.quack();
    turkeyAdapter.fly();

    System.out.println("The duckAdapter says");
    duckAdapter.gobble();
    duckAdapter.fly();
  }

}
