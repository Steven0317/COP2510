//*********************************************************
// TempConv.java 
//“I pledge my Honor that I have not cheated, and will not cheat, on this assignment.” Steven Faulkner
//
// This program prints a range of converted temperature
// (from Celsius to Fahrenheit) to a text file.
//*********************************************************

import java.util.Scanner; // Needed for the Scanner class
import java.io.*;         // Needed for the File class
import java.text.*;

public class TempConv
{
   public static void main(String[] args) throws IOException
   {
     final int BASE = 32;
     final double CONVERSION_FACTOR = 9.0/5.0;
     String fileName = "TempTable.txt";
     // Variables for Starting and ending Celsius
     int startC, endC, Cels;
     

     // Variable Fahrenheit Temperatures
     double startF, endF, Fahr;
     
     // For keyboard input
     Scanner scan = new Scanner(System.in);
     
     // Get starting and ending temperatures
     System.out.println("What is the starting temperature? ");
     startC = scan.nextInt();
     System.out.println("What is the ending temperature? ");
     endC = scan.nextInt();
     
     //scan.nextLine(); // get newline character [Enter]
   
     // Open the file.
     PrintWriter outfile = new PrintWriter(fileName);

     // Print table header to the file
      outfile.println("Celsius Temperature " +"             " +" Fahrenheit Temperature");
 
      DecimalFormat fmt = new DecimalFormat ("0.##");
// Get data and write to the file
     for (int i=startC; i <= endC ;i++)       
     {
     
         // Print Celsius Temperature to the file
         outfile.print("       "+i);
         // Convert Temperature
           Fahr = i *CONVERSION_FACTOR + BASE;
         // Print Fahrenheit Temperature to the file
         outfile.println("                                   "+fmt.format(Fahr));
     }

     outfile.close(); // Close the file.
     
     // Status message printed
     System.out.println("Results posted to TempTable.txt");
   }
}