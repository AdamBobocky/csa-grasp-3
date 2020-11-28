import CSA.*;

public class Runner {
  public static void main(String[] args) {
    Library library = new Library();

    // Task 1:

    library.Readers.add(new Reader(library.random.randomName()));
    library.Readers.add(new Reader(library.random.randomName()));

    library.ChangeDate("2020-05-05");

    System.out.println(library.toString());

    // Task 2:
  }
}
