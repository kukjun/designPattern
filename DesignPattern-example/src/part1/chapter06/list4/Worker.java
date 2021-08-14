package part1.chapter06.list4;


public class Worker {

  private JobQueue jobQueue;
  private Transcoder transcoder;

  public void setJobQueue(JobQueue jobQueue) {
    this.jobQueue = jobQueue;
  }

  public void setTranscoder(Transcoder transcoder) {
    this.transcoder = transcoder;
  }

  public void run() {
    JobData jobData = jobQueue.getJob();
    transcoder.transcoder(jobData.getSource(), jobData.getTarget());

  }

}
