package part1.chapter06.list1.ui;

import part1.chapter06.list1.JobData;
import part1.chapter06.list1.JobQueue;
import part1.chapter06.list1.mock.MockJobQueue;

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

    JobQueue jobQueue = new MockJobQueue();// Job 구현 클래스 삽입
    jobQueue.addJob(new JobData(source, target));
  }

}
