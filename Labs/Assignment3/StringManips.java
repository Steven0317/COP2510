/**
*I pledge my Honor that I have not cheated, and will not cheat, on this assignment. Steven Faulkner

*

* StringManips.java Tests several methods for manipulating String objects

* @author Steven Faulkner

*/

import java.util.Scanner;

class StringManips {

   public static void main(String[] args) {

       String phrase;

    int phraseLength;  // number of characters in the phrase String

    int middleIndex;   // index of the middle character in the String

    String firstHalf;   // first half of the phrase String

    String secondHalf; // second half of the phrase String

    String switchedPhrase; // a new phrase with original halves switched
    
    String  middle3;      // middle three characters of phrase string
 
    String city;          // users hometown
    
    String state;         // users home state
    
    String cityState;     // mutation of users input data
    
    // read in a phrase

    Scanner scan = new Scanner(System.in);

    System.out.println("Please enter a phrase:");

    phrase = scan.nextLine();

 

    // compute the length and middle index of the phrase

    phraseLength = phrase.length();

    middleIndex = phraseLength / 2;

    middle3 = (phrase.length() < 3)? null:
       phrase.substring(phrase.length()/2-1, phrase.length()/2+2);
 

    // get the substring for each half of the phrase
    firstHalf = phrase.substring(0,middleIndex);
    secondHalf = phrase.substring(middleIndex,phraseLength);
    

    // concatenate the firstHalf at the end of the secondHalf
   switchedPhrase = secondHalf.concat(" " +firstHalf);
   switchedPhrase = switchedPhrase.replace (' ','*'); // replacess blank charcters with asterisks
   
   
   
          // print information about the phrase

    

    System.out.println("Original phrase: " + phrase);

    System.out.println("Length of the phrase: " + phraseLength + " characters");

    System.out.println("Index of the middle: " + middleIndex);

    System.out.println("Character at the middle index: " + phrase.charAt(middleIndex));

    System.out.println(switchedPhrase);

    System.out.println(middle3);
    
    
    
    //asks user for home city and state
    
    System.out.println("Please enter your home city");
     city = scan.nextLine();
    
    System.out.println("Please enter your home state");
     state = scan.nextLine();
     
    // changes charater state of city and state string
    city = city.toLowerCase();
    
    state = state.toUpperCase();
     
    cityState = state.concat(city + state); 
    
    // prints altered form of user input
     System.out.println(cityState);
   }

}