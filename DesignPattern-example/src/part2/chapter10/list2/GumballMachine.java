
package part2.chapter10.list2;

public class GumballMachine {
  State soldOutState;
  State noQuarterState;
  State hasQuarterState;
  State soldState;
  State winnerState;

  State state = soldOutState;
  int count = 0;

  public void setCount(int count) {
    this.count = count;
  }

  public GumballMachine(int numberGumballs) {
    soldOutState = new SoldOutState(this);
    noQuarterState = new NoQuarterState(this);
    hasQuarterState = new HasQuarterState(this);
    soldState = new SoldState(this);
    winnerState = new WinnerState(this);

    this.count = numberGumballs;
    if (numberGumballs > 0) {
      state = noQuarterState;
    }
  }

  public void insertQuarter() {
    state.insertQuarter();
  }

  public void ejectQuarter() {
    state.ejectQuarter();
  }

  public void turnCrank() {
    state.turnCrank();
    state.dispense();
  }

  void setState(State state) {
    this.state = state;
  }

  void releaseBall() {
    System.out.println("A gumball comes rolling out the slot..");
    if (count != 0) {
      count = count -1;
    }
  }

  public State getSoldOutState() {
    return soldOutState;
  }

  public State getNoQuarterState() {
    return noQuarterState;
  }

  public State getHasQuarterState() {
    return hasQuarterState;
  }

  public State getSoldState() {
    return soldState;
  }

  public State getState() {
    return state;
  }

  public int getCount() {
    return count;
  }

  public State getWinnerState() {
    return winnerState;
  }

  @Override
  public String toString() {
    String stateString;
    if(state == soldState) {
      stateString = "알맹이를 내보내기 전 상태";
    } else if (state == soldOutState) {
      stateString = "매진 상태";
    } else if (state == noQuarterState) {
      stateString = "동전 투입 대기중";
    } else {
      stateString = "동전 투입된 상태";
    }

    return "\n주식회사 왕뽑기\n자바로 돌아가는 2021년형 뽑기 기계\nstate = " + stateString + ", count = " + count + "\n";
  }

}

