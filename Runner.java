import CSA.*;

public class Runner {
  public static void main(String[] args) {
    Library library = new Library();

    System.out.println("Random reader name for fun and giggles: " + library.random.randomName());

    System.out.println(library.toString());
  }
}
