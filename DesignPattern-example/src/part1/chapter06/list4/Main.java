package part1.chapter06.list4;

import part1.chapter06.list4.ui.JobCLI;

public class Main {

  public static void main(String[] args) {
    Assembler assembler = new Assembler();
    assembler.createAndWire();

    final Worker worker = assembler.getWorker();
    JobCLI cli = assembler.getJobCLI();
    Thread t = new Thread(new Runnable() {
      @Override
      public void run() {
        worker.run();
      }
    });
    cli.interact();
  }

}
