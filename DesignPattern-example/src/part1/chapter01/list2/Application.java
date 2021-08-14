package part1.chapter01.list2;

public class Application {

  public static class Menu {
    public String name;
    public Menu(String name) {
      this.name = name;
    }
    public void setOnClickListener(part1.chapter01.list2.Application application)
    {
      System.out.println(name + "Menu On");
    }
  }

  public static class Button {
    public String name;
    public Button(String name) {
      this.name = name;
    }
    public void setOnClickListener(part1.chapter01.list2.Application application)
    {
      System.out.println(name + "Button On");
    }
  }


  private part1.chapter01.list2.Application.Menu menu1 = new part1.chapter01.list2.Application.Menu("menu1");
  private part1.chapter01.list2.Application.Menu menu2 = new part1.chapter01.list2.Application.Menu("menu2");
  private part1.chapter01.list2.Application.Button button1 = new part1.chapter01.list2.Application.Button("button1");

  private ScreenUI currentMenu = null;

  public Application() {
    menu1.setOnClickListener(this);
    menu2.setOnClickListener(this);
    button1.setOnClickListener(this);
  }


}
