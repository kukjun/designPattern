package part2.chapter03.list2;

public abstract class Beverage {
  public String description = "제목 없음";

  public String getDescription() {
    return description;
  }

  public abstract double cost();
}
