package part2.chapter08.list5;

import java.applet.Applet;
import java.awt.*;

public class MyApplet extends Applet {
  String message;

  public void init() {
    message = "안녕하세요. 제가 왔어요...";
    repaint();
  }

  public void start() {
    message = "시작 중...";
    repaint();
  }

  public void stop() {
    message = "저를 떠나려 하시는군요...";
    repaint();
  }

  public void destroy() {
    // 애플릿이 제거됨
  }

  public void paint(Graphics graphics) {
    graphics.drawString(message, 5, 15);
  }

}
