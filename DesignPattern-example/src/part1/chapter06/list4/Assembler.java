package part1.chapter06.list4;

import part1.chapter06.list4.ffmpegtranscoder.FfmpegTranscoder;
import part1.chapter06.list4.filejobqueue.FileJobQueue;
import part1.chapter06.list4.ui.JobCLI;

public class Assembler {

  private Worker worker;
  private JobCLI jobCLI;

  public void createAndWire() {
    JobQueue jobQueue = new FileJobQueue();
    Transcoder transcoder = new FfmpegTranscoder();
    worker = new Worker();
    jobCLI = new JobCLI();
    worker.setJobQueue(jobQueue);
    worker.setTranscoder(transcoder);
    jobCLI.setJobQueue(jobQueue);
//    this.worker = new Worker(jobQueue, transcoder);
//    this.jobCLI = new JobCLI(jobQueue);
  }
  public Worker getWorker() {
    return this.worker;
  }
  public JobCLI getJobCLI() {
    return this.jobCLI;
  }

}
