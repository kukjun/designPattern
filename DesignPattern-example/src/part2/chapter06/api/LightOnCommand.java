package part2.chapter06.api;

import part2.chapter06.offer.Light;
import part2.chapter06.offer.Command;

public class LightOnCommand implements Command {
  public Light light;

  public LightOnCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.on();
  }

  @Override
  public void undo() {
    light.off();
  }

}
