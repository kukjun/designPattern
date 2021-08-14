package part1.chapter06.list6;

public interface JobQueue {
  public void addJob(JobData jobData);
  public JobData getJob();
}
