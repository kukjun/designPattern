package part1.chapter02.list1;

public class AuthenticationHandler {

  public void handleRequest(String inputId, String inputPassword) {
    Authenticator auth = new Authenticator();
    if(auth.authenticate(inputId, inputPassword)) {
      // 아이디/암호 일치할 때의 처리
    } else {
      // 아이디/암호 일치하지 않을 떄의 처리
    }
  }

}
