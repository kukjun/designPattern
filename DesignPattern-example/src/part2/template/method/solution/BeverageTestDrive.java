package part2.template.method.solution;

public class BeverageTestDrive {

  public static void main(String[] args) {
    Coffee coffee = new Coffee();
    Tea tea = new Tea();

    coffee.prepareRecipe();
    System.out.println();
    tea.prepareRecipe();
  }

}
