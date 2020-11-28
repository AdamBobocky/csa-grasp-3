package CSA;

public class Book {
  public String BookName;
  public int BorrowerIndex;
  public String BorrowerName;

  private long BorrowTS;
  private int ID;
  private String ISBN;

  public Book(int ID, String ISBN, String BookName) {
    this.ID = ID;
    this.ISBN = ISBN;
    this.BookName = BookName;
  }
  public int getID() {
    return this.ID;
  }
  public String getISBN() {
    return this.ISBN;
  }
  public double Fine(long CurrentTS) {
    if(BorrowTS == 0){
      return 0d;
    }else{
      return Math.floor(((CurrentTS - BorrowTS) / 24 / 60 / 60)) * 0.08d;
    }
  }
  public void Borrow(int BorrowerIndex, String BorrowerName, long TS) {
    this.BorrowerIndex = BorrowerIndex;
    this.BorrowerName = BorrowerName;
    this.BorrowTS = TS;
  }
  public double Return(long CurrentTS) {
    double cFine = Fine(CurrentTS);

    this.BorrowerName = "";
    this.BorrowTS = 0;

    return cFine;
  }
}
