package CSA;

import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Library {
  public LibraryRandom random;
  public ArrayList<Book> Books;
  public ArrayList<Reader> Readers;
  long ts;

  public Library() {
    random = new LibraryRandom();

    Books = new ArrayList<Book>();
    Readers = new ArrayList<Reader>();

    System.out.println("Welcome to this 'Not-good Not-bad Librarian Software©'");
  }
  public void ChangeDate(String nameStr) {
    LocalDate date = LocalDate.parse(nameStr);
    this.ts = (long) date.atStartOfDay(ZoneId.systemDefault()).toEpochSecond();
  }
  @Override
  public String toString() {
    String out = "";

    out += "The date is " + new Date(this.ts * 1000).toLocaleString() + ".\n";
    out += "And there are " + this.Readers.size() + " readers registered and " + this.Books.size() + " books in total.";

    return out;
  }
}
