package part1.chapter06.list3;

import part1.chapter06.list3.ui.JobCLI;
import part1.chapter06.list3.ffmpegtranscoder.FfmpegTranscoder;
import part1.chapter06.list3.filejobqueue.FileJobQueue;

public class Main {

  public static void main(String[] args) {
    // 상위 수준 모듈인 transcoder 패키지에서 사용할 하위 수준 모듈 객체 생성
    JobQueue jobQueue = new FileJobQueue();
    Transcoder transcoder = new FfmpegTranscoder();

    // 상위 수준 모듈이 하위 수준 모듈을 사용할 수 있도록 Locator 를 초기화
    Locator locator = new Locator(jobQueue, transcoder);
    Locator.init(locator);

    // 상위 수준 모듈 객체를 생성하고 실행
    final Worker worker = new Worker(jobQueue, transcoder);
    Thread t = new Thread(new Runnable() {
      @Override
      public void run() {
        worker.run();
      }
    });
    JobCLI cli = new JobCLI(jobQueue);
    cli.interact();
  }

}
