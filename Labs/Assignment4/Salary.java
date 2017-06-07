/**I pledge my Honor that I have not cheated, and will not cheat, on this assignment.Steven.Faulkner

* Salary.java

* Computes the amount of a raise and the new salary for an employee. The current  

* salary and a performance rating (a String: "Excellent","Good" or "Poor") are input.

*/

 

import java.util.Scanner;

import java.text.NumberFormat;

 

public class Salary {

   public static void main (String[] args) {

       double currentSalary;        // employee's current salary

       double raise = 0.0;          // amount of the raise

       double newSalary;            // new salary for the employee

       String rating;               // performance rating
       
       boolean flag=false;          // to check input
 

       Scanner scan = new Scanner(System.in);

 
   do
   {


       System.out.print ("Enter the current salary: ");

       currentSalary = scan.nextDouble();

       System.out.print ("Enter the performance rating (Excellent, Good, or Poor): ");
       rating = scan.next();

   
       // Compute the raise using if 
         if (rating.equalsIgnoreCase("Excellent")) // calculates raise for excellent
            { 
                   raise = .06 * currentSalary;
                   break;
            }
         
            if (rating.equalsIgnoreCase("Good"))   // calculates raise for good
               {
                   raise = .04 * currentSalary;
                   break;
               }
            else if (rating.equalsIgnoreCase("Poor")) // calculates raise for poor
               {
                   raise = .015 * currentSalary;
                   break;
               }   
         else                                                     // checks input
            {   
                   System.out.println();
                   System.out.println();
                   System.out.println("Check your spelling and try again");  
                   System.out.println();
                   System.out.println();                  
                   flag=false;
                   
            }      
            
      
    }while(!flag);     
            
    

       newSalary = currentSalary + raise;

 

       // Print the results

       NumberFormat money = NumberFormat.getCurrencyInstance();

       System.out.println();

       System.out.println("Current Salary:       " + money.format(currentSalary));

       System.out.println("Amount of your raise: " + money.format(raise));

       System.out.println("Your new salary:     " + money.format(newSalary));

       System.out.println();


    
      
      
      
         }

}