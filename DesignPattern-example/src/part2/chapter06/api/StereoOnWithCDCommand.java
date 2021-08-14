package part2.chapter06.api;

import part2.chapter06.offer.Command;
import part2.chapter06.offer.Stereo;

public class StereoOnWithCDCommand implements Command {
  Stereo stereo;

  public StereoOnWithCDCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  @Override
  public void execute() {
    stereo.on();
    stereo.setCD();
    stereo.setVolume(11);
  }

  @Override
  public void undo() {
    stereo.off();
  }

}
