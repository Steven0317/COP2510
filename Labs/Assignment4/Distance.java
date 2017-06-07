/*“I pledge my Honor that I have not cheated, and will not cheat, on this assignment.Steven Faulkner
*
*
*
*A program to calculate the distance formula for a pair of catersian cooridinates
*
*
*/

import java.util.Scanner;

import java.text.DecimalFormat;

public class Distance
{
   public static void main(String[] args)
   {
   
   
   double x1, x2, y1, y2; // coordinate points
   
   double DistanceX, DistanceY, DistanceXY; // distance results
  
   
   Scanner scan = new Scanner(System.in);
   
   
   // Asks user for data points
   System.out.println("Pease enter the original x cooridinate");
   x1 = scan.nextDouble();
   
   System.out.println("please enter the original Y cooridinate");
   y1 = scan.nextDouble();
   
   System.out.println("Please enter the new x cooridinate");
   x2 = scan.nextDouble();
   
   System.out.println("Please enter the new y coordinate");
   y2 = scan.nextDouble(); 
   
        
   DecimalFormat fmt = new DecimalFormat ("0.###");
   // squares the difference of x and y
   DistanceX = Math.pow((x1-x2),2);
   DistanceY = Math.pow((y1-y2),2);
   //squre root the sum of Dx&Dy
   DistanceXY = Math.sqrt(DistanceX + DistanceY);
   
   //prints results
   System.out.println("\n\nDistance from point A to point B: " +fmt.format(DistanceXY));
      
    
   }
}