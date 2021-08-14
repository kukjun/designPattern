package part1.chapter02.list3;

import java.sql.Date;

public class Member {

  private static final long DAY30 = 1000L * 60 * 60 * 24 * 30;

  private Date expiryDate;
  private boolean male;

  public boolean isExpired() {
    if(male) {
      return expiryDate != null
          && expiryDate.getDate() < System.currentTimeMillis();
    }
    return expiryDate != null
        && expiryDate.getDate() < System.currentTimeMillis() - DAY30;
  }

}
