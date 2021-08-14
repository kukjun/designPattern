package part2.chapter06.offer;

import part2.chapter06.offer.Command;

public class NoCommand implements Command {

  @Override
  public void execute() {
    System.out.println("명령이 비어있습니다.");
  }

  @Override
  public void undo() {
    execute();
  }

}
