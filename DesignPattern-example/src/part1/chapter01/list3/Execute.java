package part1.chapter01.list3;

public class Execute {

  public static void main(String[] args) throws NotEnoughSpaceException {
    Container c = new Container(5);
    for(int i=0; i<5; i++) {
      Luggage size2Luggage = new Luggage();
      System.out.println("Luggage size : " + size2Luggage.size);
      if (c.canContain(size2Luggage)) {
        c.put(size2Luggage);
        System.out.println("in\n");
      }
      else {
        System.out.println("out\n");
      }
    }
    System.out.println("\n\n\n");

    //잘못된 클래스 사용
    Container c2 = new Container(5);
    for(int i=0; i<5; i++) {
      Luggage size3Luggage = new Luggage();
      System.out.println("Luggage size : " + size3Luggage.size);
      if (c2.canContain(size3Luggage)) {
        c2.add(size3Luggage);
        System.out.println("in\n");
      }
      else {
        System.out.println("out\n");
      }
    }

  }


}
