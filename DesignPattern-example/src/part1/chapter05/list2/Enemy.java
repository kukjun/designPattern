package part1.chapter05.list2;

public class Enemy extends Character {

  private PathPattern pathPattern;

  public Enemy(PathPattern pathPattern) {
    this.pathPattern = pathPattern;
  }

  public void draw() {
    this.x = pathPattern.nextX();
    this.y = pathPattern.nextY();
  }
}
