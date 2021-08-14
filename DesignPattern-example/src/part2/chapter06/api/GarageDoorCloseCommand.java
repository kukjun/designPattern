package part2.chapter06.api;

import part2.chapter06.offer.Command;
import part2.chapter06.offer.GarageDoor;

public class GarageDoorCloseCommand implements Command {
  private GarageDoor garageDoor;

  public GarageDoorCloseCommand(GarageDoor garageDoor) {
    this.garageDoor = garageDoor;
  }

  @Override
  public void execute() {
    garageDoor.down();
    garageDoor.lightOff();
  }

  @Override
  public void undo() {
    garageDoor.up();
    garageDoor.lightOn();
  }

}
