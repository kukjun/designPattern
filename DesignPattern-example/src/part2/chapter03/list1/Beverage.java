package part2.chapter03.list1;

public class Beverage {
  protected String description;
  protected boolean milk;
  protected boolean soy;
  protected boolean mocha;
  protected boolean whip;

  public String getDescription() {
    return description;
  }
  public double cost() {
    int sum = 0;
    if (isMilk()) {
      sum += 500;
    }
    if (isMocha()) {
      sum += 1000;
    }
    if (isSoy()) {
      sum += 600;
    }
    if (isWhip()) {
      sum += 1000;
    }
    return sum;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public boolean isMilk() {
    return milk;
  }

  public void setMilk(boolean milk) {
    this.milk = milk;
  }

  public boolean isSoy() {
    return soy;
  }

  public void setSoy(boolean soy) {
    this.soy = soy;
  }

  public boolean isMocha() {
    return mocha;
  }

  public void setMocha(boolean mocha) {
    this.mocha = mocha;
  }

  public boolean isWhip() {
    return whip;
  }

  public void setWhip(boolean whip) {
    this.whip = whip;
  }

}
