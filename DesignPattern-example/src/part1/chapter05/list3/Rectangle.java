package part1.chapter05.list3;

public class Rectangle {
  private int width;
  private int height;

  public void setWidth(int width) {
    this.width = width;
  }
  public void setHeight(int height) {
    this.height = height;
  }
  public void increaseHeight(Rectangle rec) throws CantSupportSquareException{
    if (rec instanceof Square) {
      throw new CantSupportSquareException("error");
    }
    if (rec.getHeight() <= rec.getWidth()) {
      rec.setHeight(rec.getWidth() + 10);
    }
  }
  public int getWidth() {
    return width;
  }
  public int getHeight() {
    return height;
  }

}
