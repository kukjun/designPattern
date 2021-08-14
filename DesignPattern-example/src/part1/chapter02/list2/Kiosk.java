package part1.chapter02.list2;

public class Kiosk {

  public static void main(String[] args) {
    Member member = new Member();
    if(member.getExpiryDate() != null && member.getExpiryDate().getDate() < System.currentTimeMillis()) {
      //만료 처리
    }
  }

}
