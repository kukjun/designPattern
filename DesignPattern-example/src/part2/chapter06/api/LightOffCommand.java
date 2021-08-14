package part2.chapter06.api;

import part2.chapter06.offer.Command;
import part2.chapter06.offer.Light;

public class LightOffCommand implements Command {
  private Light light;

  public LightOffCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.off();
  }

  @Override
  public void undo() {
    light.on();
  }

}
