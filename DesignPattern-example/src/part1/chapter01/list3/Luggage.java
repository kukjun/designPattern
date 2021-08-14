package part1.chapter01.list3;

public class Luggage {
  public int size;

  public Luggage() {
    this.size = (int)(Math.random()*3+1);
  }
  public int size() {
    return this.size;
  }

}
