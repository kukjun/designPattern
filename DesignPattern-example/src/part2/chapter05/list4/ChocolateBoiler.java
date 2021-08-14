package part2.chapter05.list4;

public class ChocolateBoiler {
  private static ChocolateBoiler chocolateBoiler = new ChocolateBoiler();

  private boolean empty;
  private boolean boiled;

  public boolean isEmpty() {
    return empty;
  }

  public boolean isBoiled() {
    return boiled;
  }

  private ChocolateBoiler() {
    empty = true;
    boiled = false;
  }

  public void fill() {
    if(isEmpty() ){
      empty = false;
      boiled = false;
      // 보일러에 우유/초코를 혼합한 재료를 채워넣음
    }
  }

  public static synchronized ChocolateBoiler getInstance() {
    return chocolateBoiler;
  }
// 기타코드
}
