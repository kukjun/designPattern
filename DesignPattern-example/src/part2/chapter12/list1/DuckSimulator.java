package part2.chapter12.list1;

public class DuckSimulator {

  public static void main(String[] args) {
    DuckSimulator simulator = new DuckSimulator();
    AbstractDuckFactory duckFactory = new CountingDuckFactory();

    simulator.simulate(duckFactory);
  }

  void simulate(AbstractDuckFactory duckFactory) {
//    Quackable mallardDuck = new MallardDuck();
//    Quackable redHeadDuck = new RedheadDuck();
//    Quackable duckCall = new DuckCall();
//    Quackable rubberDuck = new RedheadDuck();
//    Quackable gooseDuck = new GooseAdapter(new Goose());

//    Quackable mallardDuck = new QuackCounter(new MallardDuck());
//    Quackable redHeadDuck = new QuackCounter(new RedheadDuck());
//    Quackable duckCall = new QuackCounter(new DuckCall());
//    Quackable rubberDuck = new QuackCounter(new RedheadDuck());
//    Quackable gooseDuck = new QuackCounter(new GooseAdapter(new Goose()));

    Quackable mallardDuck = duckFactory.createMallardDuck();
    Quackable redHeadDuck = duckFactory.createRedheadDuck();
    Quackable duckCall = duckFactory.createDuckCall();
    Quackable rubberDuck = duckFactory.createRubberDuck();
    Quackable gooseDuck = new GooseAdapter(new Goose());

    Flock flockOfDucks = new Flock();

    flockOfDucks.add(mallardDuck);
    flockOfDucks.add(redHeadDuck);
    flockOfDucks.add(duckCall);
    flockOfDucks.add(rubberDuck);
    flockOfDucks.add(gooseDuck);

    Flock flockOfMallards = new Flock();

    Quackable mallardOne = duckFactory.createMallardDuck();
    Quackable mallardTwo = duckFactory.createMallardDuck();
    Quackable mallardThree = duckFactory.createMallardDuck();
    Quackable mallardFour = duckFactory.createMallardDuck();

    flockOfMallards.add(mallardOne);
    flockOfMallards.add(mallardTwo);
    flockOfMallards.add(mallardThree);
    flockOfMallards.add(mallardFour);

    flockOfDucks.add(flockOfMallards);

    System.out.println("\nDuck Simulator: Whole Flock Simulation");
    simulate(flockOfDucks);
    System.out.println("The ducks quacked " + QuackCounter.getQuack() + "times");

    System.out.println("\nDuck Simulator: Mallard Flock Simulation");
    simulate(flockOfMallards);
    System.out.println("The ducks quacked " + QuackCounter.getQuack() + "times");

    System.out.println("\nDuck Simulator: With Observer");
    Quackologist quackologist = new Quackologist();
    flockOfDucks.registerObserver(quackologist);
    simulate(flockOfDucks);
    System.out.println("The ducks quacked " + QuackCounter.getQuack() + "times");

  }

  void simulate(Quackable duck) {
    duck.quack();
  }

}
