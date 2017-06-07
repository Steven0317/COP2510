/*I pledge my Honor that I have not cheated, and will not cheat, on this test.Steven Faulkner
*
*
*
*Calculates the area and volume of a cylinder or a torus
*
*
*/

import java.util.Scanner;
import java.text.*;

public class Calculate
{

public static void main(String[] args)

      {  // declare varables for radisu and height of objects 
         final double PI = 3.14159;
         
         String Input;
         
         double C_radius, C_height, T_radius1, T_radius2, T_height;
         
         DecimalFormat fmt = new DecimalFormat("0.###");
      
         Scanner scan = new Scanner(System.in);
         
               // Asks user for input        
              
               System.out.println("Enter either \"Cylinder\" or \"Torus\" to calculate the area and volume of the object");
               Input = scan.next();
               
               
               
           if (Input.equalsIgnoreCase("Cylinder"))
               {
               
               //Calulates area and volume of cylinder and prints the results
                  System.out.println( "Please enter the radius of the cylinder");
                  C_radius = scan.nextDouble();
                  System.out.println("Please enter the height of the cylinder");
                  C_height = scan.nextDouble();
                  
                  double C_area, C_volume;
                  //C area and C volume
                  C_area = ( 2*PI*C_radius*C_height);
                  C_volume = (PI * Math.pow(C_radius,2)*C_height);
                  
                  System.out.println("Area of a Cylinder: " + fmt.format(C_area));
                  System.out.println("Volume of a Cylinder: " +fmt.format(C_volume));
      
               }
               
            else 
            {
               //calulates area and volume of a torus and prints the results
                  System.out.println("Please enter the first radius of the Torus: ");
                  T_radius1 = scan.nextDouble();
                  System.out.println("Please enter the second radius of the Torus: ");
                  T_radius2 = scan.nextDouble();
                  ;
                  
                  double T_sum, T_difference, T_pow, T_area, T_volume;
                  
                  //Torus area
                  T_difference = (Math.pow(T_radius2,2) - Math.pow(T_radius1,2));
                  T_area = (Math.pow(PI,2)* T_difference);
                  
                  
                  //T volume
                  T_pow = Math.pow(T_radius1 - T_radius2,2);
                  T_sum = ((T_radius1+T_radius2)* T_pow);
                  T_volume = (.25 * Math.pow(PI,2)* T_sum);
                  
                  System.out.println("The area of a Torus is: " + fmt.format(T_area));
                  System.out.println("The volume of a Torus is: " +fmt.format(T_volume));
                  
             }   
             
                             
      }

}