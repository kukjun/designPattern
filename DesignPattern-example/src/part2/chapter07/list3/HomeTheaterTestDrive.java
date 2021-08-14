package part2.chapter07.list3;

public class HomeTheaterTestDrive {

  public static void main(String[] args) {
    // instantiate components here
    Amplifier amplifier = new Amplifier("amp");
    PopcornPopper popper = new PopcornPopper("popper");
    Screen screen = new Screen("screen");
    StreamingPlayer player = new StreamingPlayer("player", amplifier);
    TheaterLights lights = new TheaterLights("TheaterLights");
    Projector projector = new Projector("proejector", player);
    Tuner tuner = new Tuner("tuner", amplifier);
    CdPlayer cdPlayer = new CdPlayer("cdPlayer", amplifier);

    HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amplifier, tuner, cdPlayer, projector, lights, screen, popper);

    homeTheaterFacade.watchMovie("Raider of the Lost Ark");
    homeTheaterFacade.endMovie();

  }

}
