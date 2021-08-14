package part2.chapter06.api;

import part2.chapter06.offer.CeilingFan;
import part2.chapter06.offer.Command;

public class CeilingFanMediumCommand implements Command {

  CeilingFan ceilingFan;
  int prevSpeed;

  public CeilingFanMediumCommand(CeilingFan ceilingFan) {
    this.ceilingFan = ceilingFan;
  }

  @Override
  public void execute() {
    prevSpeed = ceilingFan.getSpeed();
    ceilingFan.medium();
  }

  @Override
  public void undo() {
    undoCeilingFan(prevSpeed, ceilingFan);
  }

  static void undoCeilingFan(int prevSpeed, CeilingFan ceilingFan) {
    if (prevSpeed == CeilingFan.HIGH) {
      ceilingFan.high();
    } else if (prevSpeed == CeilingFan.MEDIUM) {
      ceilingFan.medium();
    } else if (prevSpeed == CeilingFan.LOW) {
      ceilingFan.low();
    } else if (prevSpeed == CeilingFan.OFF) {
      ceilingFan.off();
    }
  }

}
