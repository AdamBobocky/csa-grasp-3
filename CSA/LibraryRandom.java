package CSA;

import java.lang.Math;

public class LibraryRandom {
    public int LatestID;

    public LibraryRandom() {
      LatestID = 0;
    }

    public int GetNextBookID(){
      return LatestID++;
    }

    public int randomNumber(int min, int max) {
        int integerNumber = (int)(Math.random()*(max-min+1)+min);
        return integerNumber;
    }

    public String randomName() {

        String[] fName = {"Jeff", "Bill", "Mark", "Warren", "Larry", "Steve", "Elon", "Sergey", "Alice"};
        String[] lName = {"Bezos", "Gates", "Zuckerberg", "Buffet", "Ellison", "Ballmer", "Musk", "Brin", "Walton"};

        int lenF = (fName.length-1);
        int lenL = (lName.length-1);

        String wholeName = "";
        wholeName += fName[randomNumber(0,lenF)];
        wholeName += " ";
        int i = randomNumber(0,10);
        if(i > 8) {
            wholeName += "Jr. ";
        }
        wholeName += lName[randomNumber(0,lenL)];

        return wholeName;
    }

    // Return a random ISBN, borrowed from a previous assignment
    public String randomBook() {

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

}
