 

//*********************************************************
//I pledge my Honor that I have not cheated, and will not cheat, on this assignment. Steven Faulkner 
//Kennel.java       
//
// This is the driver program for the Dog class
//*********************************************************
import java.util.Scanner;


public class KennelVer2
{
   //------------------------------------------------------
   // Creates and exercises some Dog objects.
   //------------------------------------------------------
   public static void main (String[] args)
   {
      
     String newDog; 
     int newAge; 
         
     Scanner scan = new Scanner(System.in);
   
     System.out.println("Enter the name of the dog: ");
     newDog = scan.next();
     System.out.println("Enter the age of the new dog: ");
     newAge = scan.nextInt();
     
     scan.close();
      
     // Create objects - test constructor 
     DogVer2 d1 = new DogVer2("Cooper", 1);
     DogVer2 d2 = new DogVer2("Fido", 4);
     DogVer2 d3 = new DogVer2("Spike", 6);
     DogVer2 d4 = new DogVer2("Kujo", 3);
     DogVer2 d5 = new DogVer2(newDog,newAge);
     
     
          

     // Test toString
     System.out.println(d1); 
     System.out.println(d2);
     System.out.println(d3);
     System.out.println(d4);
     System.out.println(d5);
       // create corresponding statements

     System.out.println();

    

// Retrieve a name: call getName from an output

// statement
     System.out.print(d1.getName() + 
                      " also answers to the name ");

     // Update a name
     String newname = "Coop";

// call setName here
     d1.setName(newname);
     System.out.print(d1.getName());
     
          
    
     // Retreive and update an age
     int newage;
     newage = d3.getAge() + 1;   
     // call setAge here
      d3.setAge(newage);

System.out.println();
     
     // Print new age for the dog. Call personYears here
      System.out.println("Happy Birthday, " + d3.getName() +"!");
      System.out.println("You are now "+ d3.getAge() +" which is " + d3.getpersonYears() +" years old in person-years."); 
      
      System.out.println();
      
      System.out.println("Instances Created:: "  +DogVer2.getCount());
   }
}
 