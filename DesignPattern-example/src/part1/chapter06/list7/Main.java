package part1.chapter06.list7;

import part1.chapter06.list7.ui.JobCLI;
import part1.chapter06.list7.ffmpegtranscoder.FfmpegTranscoder;
import part1.chapter06.list7.filejobqueue.FileJobQueue;


public class Main {

  public static void main(String[] args) {
    // 서비스 로케이터 초기화
    ServiceLocator.regist(JobQueue.class, new FileJobQueue());
    ServiceLocator.regist(Transcoder.class, new FfmpegTranscoder());

    //어플리케이션 코드 실행
    JobCLI jobCLI = new JobCLI();
    jobCLI.interact();
  }

}
