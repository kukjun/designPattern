package part1.chapter02.list4.problem;

public class Wallet {
  private int money;
  public int getTotalMoney() {
    return money;
  }
  public void subtractMoney(int debit) {
    money -= debit;
  }
}
