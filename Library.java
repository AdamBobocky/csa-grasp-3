import CSA.Book;

public class Library {
  public Book[] Books;
  // public Reader[] Readers;
  int Date;

  public static void main(String[] args) {
    System.out.println("Welcome to this 'Not-good Not-bad Librarian Software©'");
  }
  public void ChangeDate(int NewDate) {
    this.Date = NewDate;

    System.out.println("Date is now: " + this.Date);
  }
  @Override
  public String toString() {
    return "";
  }
}
