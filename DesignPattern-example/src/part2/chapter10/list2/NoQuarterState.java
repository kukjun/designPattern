package part2.chapter10.list2;

public class NoQuarterState implements State {
  GumballMachine gumballMachine;

  public NoQuarterState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("동적을 넣으셨습니다.");
    gumballMachine.setState(gumballMachine.getHasQuarterState());
  }

  @Override
  public void ejectQuarter() {
    System.out.println("동전을 넣어주세요");
  }

  @Override
  public void turnCrank() {
    System.out.println("동전은 넣어주세요");
  }

  @Override
  public void dispense() {
    System.out.println("동전을 넣어주세요.");
  }

  @Override
  public void refill() {
    System.out.println("아직 매진되지 않았습니다.");
  }

}
