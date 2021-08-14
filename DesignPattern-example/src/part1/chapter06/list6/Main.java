package part1.chapter06.list6;

import part1.chapter06.list6.ui.JobCLI;

public class Main {

  public static void main(String[] args) {
    // 서비스 로케이터 초기화
    new MyServiceLocator();

    //어플리케이션 코드 실행
    Worker worker = new Worker();
    JobCLI jobCLI = new JobCLI();
    jobCLI.interact();
  }

}
