package part1.chapter06.list6;


public class Worker {

  public boolean someRunningCondition = false;

  public void run() {
    // 서비스 로케이터를 이용해서 의존 객체를 구함
    ServiceLocator locator = ServiceLocator.getInstance();
    JobQueue jobQueue = locator.getJobQueue();
    Transcoder transcoder = locator.getTranscoder();

    // 의존 객체 사용
    while(someRunningCondition) {
      JobData jobData = jobQueue.getJob();
      transcoder.transcoder(jobData.getSource(), jobData.getTarget());
    }
  }

}
