package part2.chapter03.list3;

public abstract class Beverage {
  public String description = "제목 없음";
  public String size;

  public String getDescription() {
    return description;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public String getSize() {
    return this.size;
  }

  public abstract double cost();
}
