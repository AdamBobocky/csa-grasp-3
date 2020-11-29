package CSA;  // Package to be imported in the main class

// Import the necessary packages
import java.lang.Math;

public class LibraryRandom {  // LibraryRandom class
  // Generates borrower names, book ISBNs and book names

  public static int randomNumber(int min, int max) {  // Function that generates a random integer based on the bounds passed to it
    int integerNumber = (int)(Math.random()*(max-min+1)+min);
    return integerNumber;
  }

  public static int randomIndex(int len) {  // Function that generates a random index number
    return (int) (Math.random() * len);
  }

  public static String randomName() { // Generate a random name of the reader 

    String[] fName = {"Jeff", "Bill", "Mark", "Warren", "Larry", "Steve", "Elon", "Sergey", "Alice"};
    String[] lName = {"Bezos", "Gates", "Zuckerberg", "Buffet", "Ellison", "Ballmer", "Musk", "Brin", "Walton"};

    String wholeName = "";  // Placeholder string
    wholeName += fName[randomIndex(fName.length)];  // Select a random first name and add it to the string
    wholeName += " ";
    double i = Math.random();
    if(i > 0.8d) {  // An if loop that has a 20% probability of adding Jr. to the name of the reader
      wholeName += "Jr. ";
    }
    wholeName += lName[randomIndex(lName.length)];  // Select a random last name and add it to the string

    return wholeName; // Return the whole name string
  }

  public static String randomISBN() { // Return a random ISBN, borrowed from a previous assignment

    // Placeholder variables
    String temp = "";
    int sum = 0;

    for(int i = 10; i>1; i--) { // A foor loop that generates random numbers for positions 1-9 and adds them to the temp string
      int placeholder = randomNumber(0,9);
      temp = temp + placeholder;
      sum = sum + (i*placeholder);
    }

    // A for loop that creates numbers divisible by 11 and compares them to the checkdigit number
    // Once it's larger it notes down the value and stops the loop
    int k = 0;
    for(int j = 11; j < 499; j = j + 11) {
      if (j < sum) {
        k=j;
      } else {
        k = j;
        j = 500;
      }
    }

    int difference = (k - sum); // Create the checksum value

    temp = temp + "-" + difference; // Add the checksum value to the string containing the first 9 numbers

    return temp; // Return the ISBN string
  }

  public static String randomBookName() { // Pick a random book name from the list
    String[] fWord = {"War and Peace", "The Great Gatsby", "Lolita",
    "The Adventures of Huckleberry Finn", "Moby Dick", "Don Quixote",
    "One Hundred Years of Solitude", "Crime and Punishment", "The Odyssey",
    "Pride and Prejudice", "Wuthering Heights", "Invisible Man",
    "The Bible", "To Kill a Mockingbird"};

    int lenF = (fWord.length-1);  // Int that has the value of the maximal index

    String allName = "";
    allName += fWord[randomNumber(0,lenF)]; // Selects a book based on a random number

    return allName; // Return book name
  }
}
