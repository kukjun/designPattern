package part1.chapter06.list6;

public abstract class ServiceLocator {

  public abstract JobQueue getJobQueue();
  public abstract Transcoder getTranscoder();

  protected ServiceLocator() {
    ServiceLocator.instance = this;
  }
  private static ServiceLocator instance;
  public static ServiceLocator getInstance() {
    return instance;
  }

}
