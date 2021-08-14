package part2.chapter06.api;

import part2.chapter06.offer.Command;
import part2.chapter06.offer.Stereo;

public class StereoOffCommand implements Command {
  private Stereo stereo;

  public StereoOffCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  @Override
  public void execute() {
    stereo.off();
  }

  @Override
  public void undo() {
    stereo.on();
    stereo.setCD();
    stereo.setVolume(14);
  }

}
