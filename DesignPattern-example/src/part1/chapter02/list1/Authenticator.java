package part1.chapter02.list1;

public class Authenticator {

  public static class Member {
    private String id;
    private String password;

    public Member(String id, String password) {

    }

    public boolean equalPassword(String password) {

      return true;
    }
  }


  public boolean authenticate(String id, String password) {
    Member m = findMemberById(id);
    if(m == null) return false;

    return m.equalPassword(password); // password 가 m의 암호와 동일하면 true
  }

  public Member findMemberById(String id) {
    return new Member("id", "password");
  }

}
