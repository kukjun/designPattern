package part1.chapter06.list3;


public class Worker {

  private JobQueue jobQueue;
  private Transcoder transcoder;

  // 외부에서 사용할 객체를 전달받을 수 있는 방법 제공
  public Worker(JobQueue jobQueue, Transcoder transcoder) {
    this.jobQueue = jobQueue;
    this.transcoder = transcoder;
  }

  public void run() {
    JobData jobData = jobQueue.getJob();
    transcoder.transcoder(jobData.getSource(), jobData.getTarget());

  }

}
