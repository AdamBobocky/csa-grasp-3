package CSA;

import java.util.ArrayList;
import java.time.LocalDate;

public class Library {
  public LibraryRandom random;
  public ArrayList<Book> Books;
  public ArrayList<Reader> Readers;
  int Date;

  public Library() {
    random = new LibraryRandom();

    Books = new ArrayList<Book>();
    Readers = new ArrayList<Reader>();

    System.out.println("Welcome to this 'Not-good Not-bad Librarian Software©'");
  }
  public void ChangeDate(String nameStr) {
    // LocalDate date = LocalDate.parse(nameStr);
    // System.out.println(date.toString());
    // this.Date = (int) date.getTime();

    // System.out.println("Date is now: " + this.Date);
  }
  @Override
  public String toString() {
    return "ok";
  }
}
