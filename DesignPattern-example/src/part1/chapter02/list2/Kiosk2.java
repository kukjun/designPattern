package part1.chapter02.list2;

public class Kiosk2 {

  public static void main(String[] args) {
    Member member = new Member();
    long day30 = 1000L * 60 * 60 * 24 * 30; // 30일
    if ((
        member.isMale() && member.getExpiryDate() != null &&
            member.getExpiryDate().getDate() < System.currentTimeMillis()
    )
        || (
        !member.isMale() && member.getExpiryDate() != null &&
            member.getExpiryDate().getDate() < System.currentTimeMillis() - day30
    ))
    {
      // 만료 처리
    }
  }

}
