package part1.chapter06.list7.ui;

import part1.chapter06.list7.JobData;
import part1.chapter06.list7.JobQueue;
import part1.chapter06.list7.ServiceLocator;

public class JobCLI {
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
    JobQueue jobQueue = ServiceLocator.get(JobQueue.class);
    jobQueue.addJob(new JobData(source, target));
  }

}
