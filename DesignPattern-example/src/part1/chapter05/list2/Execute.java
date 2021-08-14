package part1.chapter05.list2;

public class Execute {
  public static void main(String[] args) {
    Enemy enemy = new Enemy(new SouthMovePattern());

    enemy.draw();
    System.out.println(enemy.x + ", " + enemy.y);
  }

}
