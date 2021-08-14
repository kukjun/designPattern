package part2.chapter06.api;

import part2.chapter06.offer.Command;
import part2.chapter06.offer.TV;

public class TVOffCommand implements Command {
  TV tv;

  public TVOffCommand(TV tv) {
    this.tv = tv;
  }

  @Override
  public void execute() {
    tv.off();
  }

  @Override
  public void undo() {
    tv.on();
  }

}
