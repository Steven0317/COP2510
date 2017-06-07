/**
*I pledge my Honor that I have not cheated, and will not cheat, on this assignment.Steven Faulkner

* Paint.java Determines how much paint is needed to paint the walls of a room

* given its length, width, and height

* @author StevenFaulkner

*/

import java.util.Scanner;

public class Paint {
    

    public static void main(String[] args) {
      //declares variables for dimensions of room, door & windows

       final int COVERAGE = 350; // paint covers 350 sq ft/gal

       int length, width, height, door_num, window_num;
       
       int door = 20; 
       
       int window = 15;
      //variables for area of painted space and amount of paint needed
       double totalSqFt;

       double paintNeeded;

       Scanner scan = new Scanner (System.in);
      //Prompts user for dimensions of room and number of unpainted space
       System.out.print ("Enter the length of the room: ");
       length = scan.nextInt();

       System.out.print ("Enter the width of the room: ");
       width = scan.nextInt();

       System.out.print ("Enter the height of the room: ");
       height = scan.nextInt();
       
       System.out.print ("Enter number of doors: ");
       door_num = scan.nextInt();
       
       System.out.print ("Enter number of windows: ");
       window_num = scan.nextInt();
      //calculates total area to be painted
       totalSqFt = (2*(length * height) + 2*(width * height)-((door * door_num) + (window * window_num)));
      //computes amount of paint needed round to two decimals
       paintNeeded = Math.round((totalSqFt/COVERAGE)*100)/100D; 
      // prints values for dimensions of room and amount of paint needed
       System.out.print("Length of room: " +length +"\nWidth of room: " +width +"\nHeight of room: " + height +"\nGallons of paint needed: " +paintNeeded);
       
       
           }

}