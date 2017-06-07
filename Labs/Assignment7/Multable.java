/*************************************************
//I pledge my Honor that I have not cheated, and will not cheat, on this assignment.Steven Faulkner
//
// Displays a multipliction table for a given set of numbers
**************************************************/
import java.util.Scanner;

public class Multable
{
   public static void main(String [] args)
   {
      final int ROWS = 12;  // number of rows is fixed
      int cols;             // number of columns is not
      
      Scanner scan = new Scanner (System.in);
      
      // Ask the user for the number of columns
        System.out.println("Enter the number of columns");
        cols = scan.nextInt();
      // Validate the input
      while (cols <= 2)
      {
      System.out.println("Please enter a positive integer above two");
      scan.nextInt();

      }
      
      // Declare 2-D array

int [][] table = new int[ROWS] [cols];
      
      // Fill the array with mutiples
      for (int row = 0; row < ROWS; row++)
      {
         for (int col = 0; col < cols; col++)
            {
              table [row][col] = (row+1)*(col+1); 
            }

      }      
      System.out.println("Here's your table: \n");
      
      // Print the array
      for (int row = 0; row < table.length; row++)
      {
         for (int col = 0; col < table[row].length; col++)
            // Formats output 
            // values printed within 5 character field
            System.out.printf("%-5d", table[row][col]);
         System.out.println();
      }   
   }
}