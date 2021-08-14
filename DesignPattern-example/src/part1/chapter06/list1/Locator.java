package part1.chapter06.list1;

public class Locator {
  private static Locator instance;
  public static Locator getInstance() {
    return instance;
  }

  public void init(Locator locator) { // static?
    this.instance = locator;
  }
  private JobQueue jobQueue;
  private Transcoder transcoder;
  public Locator(JobQueue jobQueue, Transcoder transcoder) {
    this.jobQueue = jobQueue;
    this.transcoder = transcoder;
  }

  public JobQueue getJobQueue() {
    return jobQueue;
  }
  public Transcoder getTranscoder() {
    return transcoder;
  }

}
