/*********************************************************
//I pledge my Honor that I have not cheated, and will not cheat, on this assignment Steven Faulkner
// StarPattern.java 
//
//  This is a modified version of the Stars.java program
//
//  
//*********************************************************
*/

import java.util.Scanner;

public class StarPattern1
{
   //------------------------------------------------------
   //  Prints a triangle shape using asterisk (star)     

   //  characters.
   //------------------------------------------------------
   public static void main(String[] args)
   {
     

   Scanner scan = new Scanner(System.in);

final int MAX_ROWS ;             

                                                           

 

            //Ask for number of rows
      System.out.println("How many rows of stars would you like?");
      MAX_ROWS = scan.nextInt();


      for (int row = 1; row <= MAX_ROWS; row++) 
      {
        
      for (int space = MAX_ROWS; space >= row ;space--)
               System.out.print(" ");      
    
     

    for (int star = 1; star <= row; star++)
               System.out.print("*");

         System.out.println();
      }
   }
}