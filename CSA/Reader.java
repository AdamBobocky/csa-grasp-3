package CSA;

public class Reader {
  private String name;

  public Reader(String name) {
    this.name = name;
  }
  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }
  @Override
  public String toString() {
    return "Reader name: " + name;
  }
}
