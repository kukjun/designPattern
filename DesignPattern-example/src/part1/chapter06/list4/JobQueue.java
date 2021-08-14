package part1.chapter06.list4;

public interface JobQueue {
  public void addJob(JobData jobData);
  public JobData getJob();
}
