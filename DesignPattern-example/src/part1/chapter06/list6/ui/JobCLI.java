package part1.chapter06.list6.ui;

import part1.chapter06.list6.JobData;
import part1.chapter06.list6.JobQueue;
import part1.chapter06.list6.ServiceLocator;

public class JobCLI {

  ServiceLocator locator = ServiceLocator.getInstance();
  private JobQueue jobQueue = locator.getJobQueue();
  public void printInputSourceMessage() {
    System.out.println("넣을 메시지");
  }

  public String getSourceFromConsole() { // 콘솔에 값 넣기
    return "test";
  }

  public void printInputTargetMesszage() {
    System.out.println("받은 메시지");
  }

  public String getTargetFromConsole() {
    return "test2";
  }

  public void interact() {
    printInputSourceMessage();
    String source = getSourceFromConsole();
    printInputTargetMesszage();
    String target = getTargetFromConsole();

    jobQueue.addJob(new JobData(source, target));
  }

}
