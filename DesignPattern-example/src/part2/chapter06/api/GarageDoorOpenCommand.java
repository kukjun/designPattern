package part2.chapter06.api;

import part2.chapter06.offer.GarageDoor;
import part2.chapter06.offer.Command;

public class GarageDoorOpenCommand implements Command {
  private GarageDoor garageDoor;

  public GarageDoorOpenCommand(GarageDoor garageDoor) {
    this.garageDoor = garageDoor;
  }

  @Override
  public void execute() {
    garageDoor.up();
    garageDoor.lightOn();
  }

  @Override
  public void undo() {
    garageDoor.down();
    garageDoor.lightOff();
  }

}
