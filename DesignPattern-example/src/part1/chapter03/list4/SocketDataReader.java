package part1.chapter03.list4;

public class SocketDataReader implements ByteSource {

  @Override
  public byte[] read() {
    return new byte[5];
  }

}
