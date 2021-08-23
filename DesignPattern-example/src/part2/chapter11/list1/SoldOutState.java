package part2.chapter11.list1;

public class SoldOutState implements State {
  GumballMachine gumballMachine;

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

  @Override
  public void refill() {
    System.out.println("판매 상품을 채우겠습니다!");
    gumballMachine.setCount(10);
    gumballMachine.setState(gumballMachine.getNoQuarterState());
  }

}
