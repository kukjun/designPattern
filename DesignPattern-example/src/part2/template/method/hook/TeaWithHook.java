package part2.template.method.hook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeaWithHook extends CaffeineBeverageWithHook{

  @Override
  void brew() {
    System.out.println("차를 우려냅니다.");
  }

  @Override
  void addCondiments() {
    System.out.println("레몬즙을 추가합니다.");
  }


  // hook 서브클래스 오버라이딩
  @Override
  public boolean customerWantsCondiments() {
    String answer = getUserInput();

    if(answer.toLowerCase().startsWith("y")) {
      return true;
    }
    else {
      return false;
    }
  }

  private String getUserInput() {
    String answer = null;

    System.out.println("커피에 우유와 설탕을 넣어 드릴까요? (y/n) ");

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    try  {
      answer = in.readLine();
    } catch (IOException ioe) {
      System.out.println("IO 오류");
    }
    if (answer == null) {
      return "no";
    }
    return answer;
  }
}
