package part1.chapter06.list3.ui;

import part1.chapter06.list3.JobData;
import part1.chapter06.list3.JobQueue;

public class JobCLI {

  private final JobQueue jobQueue;

  public JobCLI(JobQueue jobQueue) {
    this.jobQueue = jobQueue;
  }
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
