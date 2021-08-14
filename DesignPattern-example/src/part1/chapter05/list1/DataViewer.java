package part1.chapter05.list1;



public class DataViewer {

  public String url;
  public UI tableUI;

  public void display() {
    String data = loadHtml();
    updateGui(data);
  }

  public String loadHtml() {
    HttpClient client = new HttpClient();
    client.connect(url);
    return client.getResponse();
  }

  public void updateGui(String data) {
    GuiData guiModel = parseDataToGuiData(data);
    tableUI.changeDat(guiModel);
  }
  private GuiData parseDataToGuiData(String data) {
    // ...//파싱 처리 코드
    return new GuiData();
  }
  // ... // 기타 필드 등 다른 코드
}
