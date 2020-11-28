import CSA.*;

public class Runner {
  public static void main(String[] args) {
    Library library = new Library();

    library.Readers.add(new Reader(library.random.randomName()));
    library.Readers.add(new Reader(library.random.randomName()));

    library.ChangeDate("2007-11-11");

    System.out.println("Random reader name for fun and giggles: " + library.random.randomName());

    System.out.println(library.toString());
  }
}
