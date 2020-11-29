package CSA;  // Package to be imported in the main class

public class Reader { // Reader class

  private String name;  // Name of the reader

  public Reader(String name) {  // Constructor
    this.name = name;
  }

  public String getName() { // Name getter
    return this.name;
  }

  public void setName(String name) {  // Name setter
    this.name = name;
  }

  @Override // Override other toString methods
  public String toString() {  // Function that returns the reader name
    return "Reader name: " + name;
  }
}
