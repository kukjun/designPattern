package part2.chapter03.list1;

public class DarkRoast extends Beverage{

  public DarkRoast() {
    description = "최고의 다크 로스트 커피";
  }

  public double cost() {
    return 3000 + super.cost();
  }

}
