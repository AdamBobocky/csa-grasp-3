package CSA;

import java.util.ArrayList;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Library {
  public ArrayList<Book> Books;
  public ArrayList<Reader> Readers;

  private long ts;

  public Library() {
    Books = new ArrayList<Book>();
    Readers = new ArrayList<Reader>();

    System.out.println("Welcome to this 'Not-good Not-bad Librarian Software©'");
  }
  public void ChangeDate(String nameStr) {
    LocalDate date = LocalDate.parse(nameStr);
    this.ts = (long) date.atStartOfDay(ZoneId.systemDefault()).toEpochSecond();
  }
  public Book AddRandomBook() {
    Book WorkBood = new Book(Books.size(), LibraryRandom.randomISBN(), LibraryRandom.randomBookName());

    Books.add(WorkBood);

    return WorkBood;
  }
  public Book Borrow(int BookIndex, int ReaderIndex) {
    Book WorkBook = Books.get(BookIndex);

    WorkBook.Borrow(ReaderIndex, Readers.get(ReaderIndex).getName(), this.ts);

    return WorkBook;
  }
  public double Return(int BookIndex) {
    return Books.get(BookIndex).Return(this.ts);
  }
  public void PrintFines() {
    boolean anyFines = false;

    for(var i = 0; i < Books.size(); i++){
      Book book = Books.get(i);
      double fine = book.Fine(this.ts);

      if(fine > 0d){
        System.out.println("Fine was accrued on book id: " + i + ", fine of $" + fine + " by borrower: " + book.BorrowerName);

        anyFines = true;
      }
    }

    if(!anyFines){
      System.out.println("No fines found!");
    }
  }
  @Override
  public String toString() {
    String out = "";

    out += "The date is " + new Date(this.ts * 1000).toLocaleString() + ".\n";
    out += "And there are " + this.Readers.size() + " readers registered and " + this.Books.size() + " books in total.\n";
    out += "List of the readers is:\n";

    for(var i = 0; i < this.Readers.size(); i++){
      out += this.Readers.get(i).toString() + "\n";
    }

    out += "List of the books is:\n";

    for(var i = 0; i < this.Books.size(); i++){
      out += this.Books.get(i).toString() + "\n";
    }

    return out;
  }
}
