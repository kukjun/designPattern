
package part2.chapter11.list1;

import java.util.Random;

public class HasQuarterState implements State {

  GumballMachine gumballMachine;
  Random randomWinner = new Random(System.currentTimeMillis());

  public HasQuarterState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("동전은 한개만 넣어주세요");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("동전은 반환됩니다.");
    gumballMachine.setState(gumballMachine.getNoQuarterState());
  }

  @Override
  public void turnCrank() {
    System.out.println("손잡이를 돌리셨습니다.");
    int winner = randomWinner.nextInt(10);
    if ((winner == 0) && (gumballMachine.getCount() > 1)) {
      gumballMachine.setState(gumballMachine.getWinnerState());
    } else {
      gumballMachine.setState(gumballMachine.getSoldState());
    }
  }

  @Override
  public void dispense() {
    System.out.println("알맹이가 나갈 수 없습니다.");
  }

  @Override
  public void refill() {
    System.out.println("아직 매진되지 않았습니다.");
  }

}
