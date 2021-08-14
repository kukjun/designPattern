package part1.chapter02.list4.solution;


public class Paperboy {
  public void deliveryFee(Customer customer) {
    int payment = 10000;
    try {
      int paidAmount = customer.getPayment(payment);
    } catch (NotEnoughMoneyException ex) {
      // 다음에 요금 받으러 오는 처리
    }
  }
}
