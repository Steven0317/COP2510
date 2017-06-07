//*********************************************************
// WordCount.java 
// “I pledge my Honor that I have not cheated, and will not cheat, on this assignment.” Steven Faulkner
//
// This program asks the user for a word and checks to see
// the number of times it appears in 'The Raven'.
//*********************************************************
import java.util.Scanner; // Needed for the Scanner class
import java.io.*;         // Needed for the File class

public class WordCount
{
   public static void main(String[] args) throws IOException
   {
     int wcount = 0; // keeps track of word
     String word, entry;
     
     System.out.println("This code lets a user enter a word " 
         + " and checks \'The Raven\' to see how many times "
         + "it appears.");
     
     Scanner scan = new Scanner(new FileReader("TheRaven.txt"));
     
     
    
     Scanner keyboard = new Scanner(System.in);
     
     
     // Ask the user for a word and store it in entry
     System.out.println("Enter a word to search for: ");
     entry = keyboard.nextLine();
    

     // Read lines from the file until no more are left.
     while (scan.hasNext())
     {
        // Use the word variable to read the file
      word = scan.next();      
       
         if (word.equalsIgnoreCase(entry)) // if word is equal to entry
          {
           wcount++;
          }     
                
     }

     scan.close();// Close the file.

     System.out.println( "The word " + entry +" appears " + wcount +" times");// displays total word count 
  }
     
}