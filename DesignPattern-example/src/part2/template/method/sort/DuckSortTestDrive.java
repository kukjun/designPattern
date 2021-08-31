package part2.template.method.sort;

import java.util.Arrays;

public class DuckSortTestDrive {

  public static void main(String[] args) {
    Duck[] ducks = {
        new Duck("Daffy", 8),
        new Duck("Deway", 2),
        new Duck("Howard", 7),
        new Duck("Louie", 2),
        new Duck("Donald", 10),
        new Duck("Huey", 2)
    };

    System.out.println("정렬 전: ");
    display(ducks);
    System.out.println();

    Arrays.sort(ducks);

    System.out.println("정렬 후: ");
    display(ducks);
  }

  public static void display(Duck[] ducks) {
    for(int i=0; i<ducks.length; i++) {
      System.out.println("ducks[i] = " + ducks[i]);
    }
  }

}
