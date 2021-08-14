package part1.chapter03.list5;

public class FlowController {

  private boolean useFile;

  public FlowController(boolean useFile) {
    this.useFile = useFile;
  }

  public void process() {
    ByteSource source = ByteSourceFactory.getInstance().create();
    byte[] data = source.read();

    Encryptor encryptor = new Encryptor();
    byte[] encryptedData = encryptor.encrypt(data);

    FileDataWriter writer = new FileDataWriter();
    writer.write(encryptedData);
  }

}
