package part1.chapter06.list1;

import part1.chapter06.list1.mock.MockJobQueue;
import part1.chapter06.list1.mock.MockTranscoder;

public class Worker {

  boolean someRunningCondition = true;

  public void run() {
    JobQueue jobQueue = new MockJobQueue(); // = JobQueue 구현클래스 삽입
    Transcoder transcoder= new MockTranscoder(); // = Transcoder 구현 클래스 삽입

    while(someRunningCondition) {
      JobData jobData = jobQueue.getJob();
      transcoder.transcoder(jobData.getSource(), jobData.getTarget());
    }
  }

}
