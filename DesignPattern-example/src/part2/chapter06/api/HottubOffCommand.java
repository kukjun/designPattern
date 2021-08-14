package part2.chapter06.api;

import part2.chapter06.offer.Command;
import part2.chapter06.offer.Hottub;

public class HottubOffCommand implements Command {
  Hottub hottub;

  @Override
  public void execute() {
    hottub.bubblesOff();
    hottub.jetsOff();
    hottub.off();
  }

  @Override
  public void undo() {
    hottub.on();
    hottub.jetsOn();
    hottub.bubblesOn();
  }

  public HottubOffCommand(Hottub hottub) {
    this.hottub = hottub;
  }

}
