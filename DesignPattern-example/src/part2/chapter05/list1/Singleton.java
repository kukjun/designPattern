package part2.chapter05.list1;

/***
 * 고전적인 인스턴스 생성 방법
 */
public class Singleton {
  private static Singleton uniqueInstance;

  // 기타 인스턴스 변수

  private Singleton() {}

  public static Singleton getInstance() {
    // lazy instantiation
    if (uniqueInstance == null) {
      uniqueInstance = new Singleton();
    }
    return uniqueInstance;
  }

  // 기타 메소드

}
