package part1.chapter02.list4.solution;

import part1.chapter02.list4.problem.Wallet;

public class Customer {
  private Wallet wallet;

  public int getPayment(int payment) throws NotEnoughMoneyException {
    if(wallet == null) throw new NotEnoughMoneyException();
    if(wallet.getTotalMoney()>=payment) {
      wallet.subtractMoney(payment);
      return payment;
    }
    throw new NotEnoughMoneyException();
  }
}
