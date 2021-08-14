package part1.chapter06.list3;

public class Locator {
  private static Locator instance;
  public static Locator getInstance() {
    return instance;
  }

  public static void init(Locator locator) { // static?
    instance = locator;
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
