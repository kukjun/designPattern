package part2.chapter11.list3;

import java.io.Serializable;

public interface State extends Serializable {

  public void insertQuarter();

  public void ejectQuarter();

  public void turnCrank();

  public void dispense();

}
