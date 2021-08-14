package part1.chapter06.list5;

public class ServiceLocator {
  private JobQueue jobQueue;
  private Transcoder transcoder;

  public ServiceLocator(JobQueue jobQueue, Transcoder transcoder) {
    this.jobQueue = jobQueue;
    this.transcoder = transcoder;
  }

  public JobQueue getJobQueue() {
    return jobQueue;
  }

  public Transcoder getTranscoder() {
    return transcoder;
  }

  private static ServiceLocator instance;
  public static void load(ServiceLocator locator) {
    ServiceLocator.instance = locator;
  }
  public static ServiceLocator getInstance() {
    return instance;
  }

}
