package part2.chapter11.list1;

public class GumballMonitor {
  GumballMachine machine;

  public GumballMonitor(GumballMachine machine) {
    this.machine = machine;
  }

  public void report() {
    System.out.println("뽑기 현재 위치: " + machine.getLocation());
    System.out.println("현재 재고: " + machine.getCount() + " 개");
    System.out.println("현재 상태: " + machine.getState());
  }

}
