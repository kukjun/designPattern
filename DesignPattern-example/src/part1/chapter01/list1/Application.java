package part1.chapter01.list1;


public class Application {

  public static class Menu {
    public String name;
    public Menu(String name) {
      this.name = name;
    }
    public void setOnClickListener(Application application)
    {
      System.out.println(name + "Menu On");
    }
  }

  public static class Button {
    public String name;
    public Button(String name) {
      this.name = name;
    }
    public void setOnClickListener(Application application)
    {
      System.out.println(name + "Button On");
    }
  }

  private Menu menu1 = new Menu("menu1");
  private Menu menu2 = new Menu("menu2");
  private Button button1 = new Button("button1");

  private String currentMenu = null;

  public Application() {
    menu1.setOnClickListener(this);
    menu2.setOnClickListener(this);
    button1.setOnClickListener(this);
  }

  public void clicked(String event) {
    if (event.equals(menu1.name)) {
      menu1.setOnClickListener(this);
    } else if (event.equals(menu2.name)) {
      menu2.setOnClickListener(this);
    } else if (event.equals(button1.name)) {
      button1.setOnClickListener(this);
    }
  }

}