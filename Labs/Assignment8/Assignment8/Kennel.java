 

//*********************************************************
//I pledge my Honor that I have not cheated, and will not cheat, on this assignment. Steven Faulkner 
//Kennel.java       
//
// This is the driver program for the Dog class
//*********************************************************

public class Kennel
{
   //------------------------------------------------------
   // Creates and exercises some Dog objects.
   //------------------------------------------------------
   public static void main (String[] args)
   {
     // Create objects - test constructor 
     Dog d1 = new Dog("Cooper", 1);
     Dog d2 = new Dog("Fido", 4);
     Dog d3 = new Dog("Spike", 6);
     Dog d4 = new Dog("Kujo", 3);
    
     
     
          

     // Test toString
     System.out.println(d1); 
     System.out.println(d2);
     System.out.println(d3);
     System.out.println(d4);
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
   }
}
 