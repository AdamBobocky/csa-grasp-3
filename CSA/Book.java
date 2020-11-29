package CSA;  // Package to be imported in the main class

public class Book { // Book class

  public String BookName; // Name of the book
  public int BorrowerIndex; // Index of the borrower
  public String BorrowerName; // Name of the borrower

  private long BorrowTS;  // Time stamp of the borrow date
  private int ID; // ID of the book
  private String ISBN;  // ISBN of the book

  public Book(int ID, String ISBN, String BookName) { // Constructor for the book object
    this.ID = ID;
    this.ISBN = ISBN;
    this.BookName = BookName;
  }

  public int getID() {  // Getter function that returns ID of the book object
    return this.ID;
  }

  public String getISBN() { // Getter function that returns ISBN of the book object
    return this.ISBN;
  }

  public double Fine(long CurrentTS) {  // Function that calculates the fine based on the timestamp of return date
    if(BorrowTS == 0){
      return 0d;
    }else{
      return Math.floor(((CurrentTS - BorrowTS) / 24 / 60 / 60)) * 0.08d; // Floor the long so that an integer is returned
    }
  }

  public void Borrow(int BorrowerIndex, String BorrowerName, long TS) { // Constructor for the borrow object
    this.BorrowerIndex = BorrowerIndex;
    this.BorrowerName = BorrowerName;
    this.BorrowTS = TS;
  }

  public double Return(long CurrentTS) {  // Return the calculated fine
    double cFine = Fine(CurrentTS);

    this.BorrowerName = "";
    this.BorrowTS = 0;

    return cFine;
  }

  @Override // Override other toString methods
  public String toString() {  // Return a message that gives all the important information
    var out = "";

    out += BookName + " (" + ID + "):\n";
    out += " Borrower(" + BorrowerIndex + "): " + BorrowerName + "\n";
    out += " ISNB: " + ISBN;

    return out;
  }
}