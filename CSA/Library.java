package CSA;

import java.util.ArrayList;

public class Library {
  public LibraryRandom random;
  public ArrayList<Book> Books;
  public ArrayList<Reader> Readers;
  int Date;

  public Library() {
    random = new LibraryRandom();

    System.out.println("Welcome to this 'Not-good Not-bad Librarian Software©'");
  }
  public void ChangeDate(int NewDate) {
    this.Date = NewDate;

    System.out.println("Date is now: " + this.Date);
  }
  @Override
  public String toString() {
    return "ok";
  }
}
