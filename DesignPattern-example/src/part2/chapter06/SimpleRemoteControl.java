package part2.chapter06;

import part2.chapter06.offer.Command;

public class SimpleRemoteControl {
  Command slot;

  public SimpleRemoteControl() {

  }

  public void setCommand(Command command) {
    slot = command;
  }

  public void buttonWasPressed() {
    slot.execute();
  }

}
