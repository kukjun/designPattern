package part2.chapter08.list3;

public class Duck implements Comparable{
  String name;
  int weight;

  public Duck(String name, int weight) {
    this.name = name;
    this.weight = weight;
  }

  @Override
  public String toString() {
    return name + ", 체중" + weight;
  }

  @Override
  public int compareTo(Object o) {

    Duck otherDuck = (Duck)o;

    if (this.weight < otherDuck.weight) {
      return -1;
    } else if (this.weight == otherDuck.weight) {
      return 0;
    } else { // this.weight > otherDuck.weight
      return 1;
    }
  }

}
