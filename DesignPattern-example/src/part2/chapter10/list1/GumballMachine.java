package part2.chapter10.list1;

public class GumballMachine {
  final static int SOLD_OUT = 0;
  final static int NO_QUARTER = 1;
  final static int HAS_QUARTER = 2;
  final static int SOLD = 3;

  int state = SOLD_OUT;
  int count = 0;

  public GumballMachine(int count) {
    this.count = count;
    if(count > 0) {
      state = NO_QUARTER;
    }
  }
  

  public void insertQuarter() {
    if (state == HAS_QUARTER) {
      System.out.println("동전은 하나만 넣어주세요");
    } else if (state == NO_QUARTER) {
      state = HAS_QUARTER;
      System.out.println("동전을 넣으셨습니다.");
    } else if (state == SOLD_OUT) {
      System.out.println("매진되었습니다. 다음 기회에 이용해주세요");
    } else if (state == SOLD) {
      System.out.println("잠시만 기다려 주세요, 알맹이가 나가고 있습니다.");
    }
  }

  public void ejectQuarter() {
    if (state == HAS_QUARTER) {
      System.out.println("동전이 반환됩니다.");
      state = NO_QUARTER;
    } else if (state == NO_QUARTER) {
      System.out.println("동전을 넣어주세요");
    } else if (state == SOLD) {
      System.out.println("이미 알맹이를 뽑으셨습니다.");
    } else if (state == SOLD_OUT) {
      System.out.println("동전을 넣지 않으셨습니다. 동전이 반환되지 않습니다.");
    }
  }

  public void turnCrank() {
    if (state == SOLD) {
      System.out.println("손잡이는 한번만 돌려주세요");
    } else if (state == NO_QUARTER) {
      System.out.println("동전을 넣어주세요");
    } else if (state == SOLD_OUT) {
      System.out.println("매진되었습니다.");
    } else if (state == HAS_QUARTER) {
      System.out.println("손잡이를 돌리셨습니다.");
      state = SOLD;
      dispense();
    }
  }

  public void dispense() {
    if(state == SOLD) {
      System.out.println("알맹이가 나가고 있습니다.");
      count = count - 1;
      if(count == 0) {
        System.out.println("더 이상 알맹이가 없습니다.");
        state = SOLD_OUT;
      } else {
        state = NO_QUARTER;
      }
    } else if (state == NO_QUARTER) {
      System.out.println("동전을 넣어주세요.");
    } else if (state == SOLD_OUT) {
      System.out.println("매진입니다.");
    } else if (state == HAS_QUARTER) {
      System.out.println("알맹이가 나갈 수 없습니다.");
    }
  }

  public void refill() {
    if (state == SOLD_OUT) {
      System.out.println("알맹이를 채웁니다.");
      count = 10;
    } else {
      System.out.println("아직 매진되지 않았습니다. 알맹이를 채우지 않습니다.");
    }
  }

  @Override
  public String toString() {
    String stateString;
    if(state == SOLD) {
      stateString = "알맹이를 내보내기 전 상태";
    } else if (state == SOLD_OUT) {
      stateString = "매진 상태";
    } else if (state == NO_QUARTER) {
      stateString = "동전 투입 대기중";
    } else {
      stateString = "동전 투입된 상태";
    }

    return "\n주식회사 왕뽑기\n자바로 돌아가는 2021년형 뽑기 기계\nstate = " + stateString + ", count = " + count + "\n";
  }

}
