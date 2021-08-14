package part2.chapter08.list1;

public class Tea extends CaffeineBeverage{

  @Override
  public void brew() {
    System.out.println("차를 우려내는 중");
  }

  @Override
  public void addCondiments() {
    System.out.println("레몬을 추가하는 중");
  }

}
