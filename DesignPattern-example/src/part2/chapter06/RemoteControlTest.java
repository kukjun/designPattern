package part2.chapter06;

import part2.chapter06.api.GarageDoorOpenCommand;
import part2.chapter06.api.LightOnCommand;
import part2.chapter06.offer.GarageDoor;
import part2.chapter06.offer.Light;

public class RemoteControlTest {
  public static void main(String[] args) {
    // 리모콘 객체 생성
    SimpleRemoteControl remote = new SimpleRemoteControl();

    // Light 객체 생성
    Light light = new Light("Living room");
    GarageDoor garageDoor = new GarageDoor("");

    // Command 인터페이스 구현한 객체에 Light 객체를 넣음
    LightOnCommand lightOn = new LightOnCommand(light);
    GarageDoorOpenCommand GarageOpen = new GarageDoorOpenCommand(garageDoor);


    // 리모콘 객체에서 Command 변수에 LightOnCommand 참조
    remote.setCommand(lightOn);
    remote.buttonWasPressed();

    // 리모콘 객체에서 Command 변수에 GarageOpenCommand 참조
    remote.setCommand(GarageOpen);
    remote.buttonWasPressed();

  }

}
