package part1.chapter06.list6;

import part1.chapter06.list6.ffmpegtranscoder.FfmpegTranscoder;
import part1.chapter06.list6.filejobqueue.FileJobQueue;

public class MyServiceLocator extends ServiceLocator{
  private FileJobQueue jobQueue;
  private FfmpegTranscoder transcoder;

  public MyServiceLocator() {
    super();
    this.jobQueue = new FileJobQueue();
    this.transcoder = new FfmpegTranscoder();
  }

  @Override
  public JobQueue getJobQueue() {
    return jobQueue;
  }

  @Override
  public Transcoder getTranscoder() {
    return transcoder;
  }
}
