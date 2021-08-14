package part2.chapter03.list1;

public class StarBuzz {

  public static void main(String[] args) {
    Beverage darkRoast = new DarkRoast();

    darkRoast.setMilk(true);

    System.out.println(darkRoast.cost());
  }

}
