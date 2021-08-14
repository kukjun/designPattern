package part1.chapter05.list3;

public class Execute {

  public static void main(String[] args) {
    Square square = new Square();
    Rectangle rectangle = new Rectangle();

    try {
      square.setHeight(10);
      System.out.println("square -> width : " + square.getWidth() + ", height : " + square.getHeight());
      square.increaseHeight(square);
      System.out.println("change square -> width : " + square.getWidth() + ", height : " + square.getHeight());
      System.out.println();

      rectangle.setHeight(10);
      rectangle.setWidth(10);
      System.out.println("rectangle -> width : " + rectangle.getWidth() + ", height : " + rectangle.getHeight());
      rectangle.increaseHeight(rectangle);
      System.out.println("change rectangle -> width : " + rectangle.getWidth() + ", height : " + rectangle.getHeight());
    }
    catch (CantSupportSquareException e) {
      System.out.println(e.getMessage());
    }
  }

}
