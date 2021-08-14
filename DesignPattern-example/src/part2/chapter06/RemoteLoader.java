package part2.chapter06;

import part2.chapter06.api.*;
import part2.chapter06.offer.*;

public class RemoteLoader {

  public static void main(String[] args) {
    RemoteControl remoteControl = new RemoteControl();

    Light livingRoomLight = new Light("Living Room");
    Light kitchenLight = new Light("Kitchen");
    CeilingFan ceilingFan = new CeilingFan("Living Room");
    GarageDoor garageDoor = new GarageDoor("");
    Stereo stereo = new Stereo("Living Room");

    LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
    LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
    LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
    LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

    CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
    CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

    GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
    GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);

    StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
    StereoOffCommand stereoOffWithCD = new StereoOffCommand(stereo);

    remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
    remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
    remoteControl.setCommand(2, ceilingFanHigh, ceilingFanOff);
    remoteControl.setCommand(3, stereoOnWithCD, stereoOffWithCD);
    remoteControl.setCommand(4, garageDoorOpenCommand, garageDoorCloseCommand);


    // MacroCommand test
    Light light = new Light("Living Room");
    TV tv = new TV("Living");
    Stereo stereo1 = new Stereo("Living Room");
    Hottub hottub = new Hottub();

    LightOnCommand lightOn = new LightOnCommand(light);
    StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo1);
    TVOnCommand tvOnCommand = new TVOnCommand(tv);
    HottubOnCommand hottubOnCommand = new HottubOnCommand(hottub);
    LightOffCommand lightOff = new LightOffCommand(light);
    StereoOffCommand stereoOff = new StereoOffCommand(stereo1);
    TVOffCommand tvOffCommand = new TVOffCommand(tv);
    HottubOffCommand hottubOffCommand = new HottubOffCommand(hottub);



    Command[] onCommands = new Command[4];
    onCommands[0] = lightOn;
    onCommands[1] = stereoOn;
    onCommands[2] = tvOnCommand;
    onCommands[3] = hottubOnCommand;
    Command[] offCommands = new Command[4];
    offCommands[0] = lightOff;
    offCommands[1] = stereoOff;
    offCommands[2] = tvOffCommand;
    offCommands[3] = hottubOffCommand;

    MacroCommand macroCommandOn = new MacroCommand(onCommands);
    MacroCommand macroCommandOff = new MacroCommand(offCommands);
    remoteControl.setCommand(5, macroCommandOn, macroCommandOff);


    for(int i =0; i< remoteControl.getCommandLength(); i++) {
      remoteControl.onButtonWasPushed(i);
      remoteControl.offButtonWasPushed(i);
      System.out.println();
    }
  }

}
