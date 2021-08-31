package part2.chapter11.list3;


public class SoldOutState implements State {
  transient GumballMachine gumballMachine;

  public SoldOutState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("매진 상태입니다.");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("매진 상태입니다.");
  }

  @Override
  public void turnCrank() {
    System.out.println("매진 상태입니다.");
  }

  @Override
  public void dispense() {
    System.out.println("매진 상태입니다.");
  }

}
