package part2.chapter06.api;

import part2.chapter06.offer.Command;
import part2.chapter06.offer.Hottub;

public class HottubOnCommand implements Command {
  Hottub hottub;

  public HottubOnCommand(Hottub hottub) {
    this.hottub = hottub;
  }

  @Override
  public void execute() {
    hottub.on();
    hottub.bubblesOn();
    hottub.jetsOn();
  }

  @Override
  public void undo() {
    hottub.jetsOff();
    hottub.bubblesOff();
    hottub.off();
  }

}
