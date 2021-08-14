package part2.chapter07.list3;

public class HomeTheaterFacade {

  Amplifier amp;
  Tuner tuner;
  CdPlayer cd;
  Projector projector;
  TheaterLights lights;
  Screen screen;
  PopcornPopper popper;

  public HomeTheaterFacade(Amplifier amp, Tuner tuner, CdPlayer cd, Projector projector, TheaterLights lights, Screen screen, PopcornPopper popper) {
    this.amp = amp;
    this.tuner = tuner;
    this.cd = cd;
    this.projector = projector;
    this.lights = lights;
    this.screen = screen;
    this.popper = popper;
  }

  public void watchMovie(String movie) {
    System.out.println("Get ready to watch a movie...");
    popper.on();
    popper.pop();
    lights.dim(10);
    screen.down();
    projector.on();
    projector.wideScreenMode();
    amp.on();
    amp.setTuner(tuner);
    amp.setStereoSound();
    amp.setVolume(5);
    //DVD 없음
  }

  public void endMovie() {
    System.out.println("Shutting movie theater down ...");
    popper.off();
    lights.on();
    screen.up();
    projector.off();
    amp.off();
    //DVD 없음

  }

}
