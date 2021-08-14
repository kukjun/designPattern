package part1.chapter06.list2;


public class Worker {

  boolean someRunningCondition = true;

  public void run() {
    JobQueue jobQueue = Locator.getInstance().getJobQueue();
    Transcoder transcoder= Locator.getInstance().getTranscoder();

    while(someRunningCondition) {
      JobData jobData = jobQueue.getJob();
      transcoder.transcoder(jobData.getSource(), jobData.getTarget());
    }
  }

}
