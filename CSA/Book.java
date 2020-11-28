package CSA;

public class Book {
  public String BookName;
  public String BorrowerName;
  public long BorrowTS;
  int ID;

  public Book(int ID) {
    this.ID = ID;
  }
  public int getID() {
    return this.ID;
  }
  public double Fine(long CurrentTS){
    return 0.00d;
  }
  public double Return(long CurrentTS){
    double cFine = Fine(CurrentTS);

    this.BorrowerName = "";
    this.BorrowTS = 0;

    return cFine;
  }
}
