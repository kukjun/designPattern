package part2.chapter06.api;

import part2.chapter06.offer.CeilingFan;
import part2.chapter06.offer.Command;

public class CeilingFanLowCommand implements Command {
  CeilingFan ceilingFan;
  int prevSpeed;

  public CeilingFanLowCommand(CeilingFan ceilingFan) {
    this.ceilingFan = ceilingFan;
  }

  @Override
  public void execute() {
    prevSpeed = ceilingFan.getSpeed();
    ceilingFan.high();
  }


  @Override
  public void undo() {
    CeilingFanMediumCommand.undoCeilingFan(prevSpeed, ceilingFan);
  }

}
