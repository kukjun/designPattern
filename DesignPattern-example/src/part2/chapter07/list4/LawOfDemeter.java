package part2.chapter07.list4;

public class LawOfDemeter {

  public Field field;

  public void testMethod() {

  }

  public void goodLawOfDemeter(OuterObject outerObject) {
    testMethod(); // 1. 객체 자체의 메소드
    outerObject.testMethod(); // 2. 메소드의 매개변수로 전달된 객체
    OuterObject object = new OuterObject();
    object.testMethod(); // 3. 그 메소드에서 생성하거나 인스턴스를 만든 객체
    field.innerMethod(); // 4. 그 객체에 속하는 구성요소
  }

  public void violateLawOfDemeter(OuterObject outerObject) {
    Field field = outerObject.getTestField(); // 인자로 받은 객체
    field.innerMethod(); // 에서 호출

    outerObject.getTestField().innerMethod(); // 동일한 잘못된 코드
  }

}

class Field {

  void innerMethod() {

  }

}

class OuterObject {

  Field testField;

  void testMethod() {

  }

  Field getTestField() {
    return testField;
  }

}