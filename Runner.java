import CSA.*;

public class Runner {
  public static void main(String[] args) {
    Library library = new Library();

    // Task 1:

    System.out.println("Task 1");

    library.ChangeDate("2020-05-05");

    library.Readers.add(new Reader(LibraryRandom.randomName()));
    library.Readers.add(new Reader(LibraryRandom.randomName()));

    System.out.println(library.toString());

    // Task 2:

    System.out.println("Task 2");

    for(var i = 0; i < 15; i++){
      library.AddRandomBook();
    }

    library.Borrow(1, 0); // Borrow book index 1 to borrower index 0
    library.Borrow(2, 1); // Borrow book index 2 to borrower index 1

    library.ChangeDate("2020-06-05");

    library.PrintFines();

    // Task 3:

    System.out.println("Task 3");

    library.Return(1);  // Return book index 1

    library.PrintFines();

    library.ChangeDate("2020-07-06");

    System.out.println(library.toString());

    // Task 4:

    System.out.println("Task 4");

    library.Return(2);  // Return book index 2

    library.PrintFines();
  }
}
