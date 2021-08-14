package part1.chapter02.list4.problem;

public class Paperboy {
  public void deliveryFee(Customer customer) {
    int payment = 10000;
    Wallet wallet = customer.getWallet();
    if(wallet.getTotalMoney() >= payment) {
      wallet.subtractMoney(payment);
    } else {
      // 다음에 요금 받으러 오는 처리
    }
  }

}
