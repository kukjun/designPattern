package part2.chapter06.api;

import part2.chapter06.offer.Command;
import part2.chapter06.offer.TV;

public class TVOnCommand implements Command {
  private TV tv;

  public TVOnCommand(TV tv) {
    this.tv = tv;
  }

  @Override
  public void execute() {
    System.out.println("TV - On");
  }

  @Override
  public void undo() {

  }

}
