package CSA;

import java.lang.Math;

public class LibraryRandom {
  public static int randomNumber(int min, int max) {
    int integerNumber = (int)(Math.random()*(max-min+1)+min);
    return integerNumber;
  }
  public static int randomIndex(int len) {
    return (int) (Math.random() * len);
  }
  public static String randomName() {
    String[] fName = {"Jeff", "Bill", "Mark", "Warren", "Larry", "Steve", "Elon", "Sergey", "Alice"};
    String[] lName = {"Bezos", "Gates", "Zuckerberg", "Buffet", "Ellison", "Ballmer", "Musk", "Brin", "Walton"};

    String wholeName = "";
    wholeName += fName[randomIndex(fName.length)];
    wholeName += " ";
    double i = Math.random();
    if(i > 0.8d) {
      wholeName += "Jr. ";
    }
    wholeName += lName[randomIndex(lName.length)];

    return wholeName;
  }
  // Return a random ISBN, borrowed from a previous assignment
  public static String randomISBN() {
    // Placeholder variables
    String temp = "";
    int sum = 0;

    // A foor loop that generates random numbers for positions 1-9 and adds them to the temp string
    for(int i = 10; i>1; i--) {
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

    // Create the checksum value
    int difference = (k - sum);

    // Add the checksum value to the string containing the first 9 numbers
    temp = temp + "-" + difference;

    // Return the complete string
    return temp;
  }
  public static String randomBookName() {
    String[] fWord = {"War and Peace", "The Great Gatsby", "Lolita", "The Adventures of Huckleberry Finn", "Moby Dick", "Don Quixote", "One Hundred Years of Solitude", "Crime and Punishment", "The Odyssey", "Pride and Prejudice", "Wuthering Heights", "Invisible Man", "The Bible", "To Kill a Mockingbird"};

    int lenF = (fWord.length-1);

    String allName = "";
    allName += fWord[randomNumber(0,lenF)];

    return allName;
  }
}
