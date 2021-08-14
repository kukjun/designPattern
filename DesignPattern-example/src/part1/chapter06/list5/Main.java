package part1.chapter06.list5;

import part1.chapter06.list5.ffmpegtranscoder.FfmpegTranscoder;
import part1.chapter06.list5.filejobqueue.FileJobQueue;
import part1.chapter06.list5.ui.JobCLI;

public class Main {

  public static void main(String[] args) {
    // 의존 객체 생성
    FileJobQueue jobQueue = new FileJobQueue();
    FfmpegTranscoder transcoder = new FfmpegTranscoder();

    // 서비스 로케이터 초기화
    ServiceLocator locator = new ServiceLocator(jobQueue, transcoder);
    ServiceLocator.load(locator);

    //어플리케이션 코드 실행
    Worker worker = new Worker();
    JobCLI jobCLI = new JobCLI();
    jobCLI.interact();
  }

}
