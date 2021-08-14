package part1.chapter06.list1.mock;

import part1.chapter06.list1.JobData;
import part1.chapter06.list1.JobQueue;

public class MockJobQueue implements JobQueue {

  @Override
  public void addJob(JobData jobData) {

  }

  @Override
  public JobData getJob() {
    return null;
  }

}
