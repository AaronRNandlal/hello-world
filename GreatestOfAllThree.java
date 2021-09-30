/*
 * Task: Write a Java program that contains a method to Take three numbers from the user and print the greatest number
 */

package homework3;

//imports necessary tool to allow user inputs
import java.util.Scanner;

public class GreatestOfAllThree {

	//main
		public static void main(String[] args) {
			
			  Scanner input = new Scanner(System.in);
			  
			  
			  //---------------------------------------------------------------(First integer input and display)
			  //asks user for first integer input
			  System.out.print("Please enter your first number:");
			  
			  //declares and initializes the user input to a variable
			  int UserNum1 = input.nextInt();
			  
			  //displays the user's first input
			  System.out.println("Your first integer is: " + UserNum1);
			  System.out.println("");
			  
			  //---------------------------------------------------------------(Second integer input and display)
			  //asks user for second integer input
			  System.out.print("Please enter your second number:");
			  
			  //declares and initializes the user input to a variable
			  int UserNum2 = input.nextInt();
			  
			  //displays the user's second input
			  System.out.println("Your second integer is: " + UserNum2);
			  System.out.println("");
			  
			  //---------------------------------------------------------------(Third integer input and display)
			  //asks user for third integer input
			  System.out.print("Please enter your third number:");
			  
			  //declares and initializes the user input to a variable
			  int UserNum3 = input.nextInt();
			  
			  //displays the user's third input
			  System.out.println("Your third integer is: " + UserNum3);
			  System.out.println("");
			  
			  //closes user's ability to input a value
			  input.close();
			  
			  //runs the GreatestOfAllThree method and determines which input is the greatest, if any
			  GreatestOfAllThree(UserNum1, UserNum2, UserNum3);
			  
			  
	}//end of main	  
	
		
	public static void GreatestOfAllThree(int x, int y, int z) {
		
		//--------------------------------------------------------------(if/else-if statements for user integer inputs)
		  //displays message if first user input is greater than the rest
		  if(x > y && x > z) {
			  System.out.println("");
			  System.out.println("The first integer you entered was the greatest!");
		  
		  //displays message if first user input is equal to any other input, and is the greatest
		  }else if((x == y || x == z) && (x > y || x > z)) {
			  System.out.println("");
			  System.out.println("The first integer you entered was equal to one or more of your inputs.");
			  System.out.println("And it is indeed the greatest among the other inputs.");
		  
		  //displays message if first user input is equal to any other input, and is not the greatest
		  }else if((x == y || x == z) && (x < y || x < z)) {
			  System.out.println("");
			  System.out.println("The first integer you entered was equal to one or more of your inputs.");
			  System.out.println("But it is not the greatest among the other inputs.");
			  
			  
			  
		  //displays message if second user input is greater than the rest
		  }else if(y > x && y > z) {
			  System.out.println("");
			  System.out.println("The second integer you entered was the greatest!");
			  
		  //displays message if second user input is equal to any other input, and is the greatest
		  }else if((y == x || y == z) && (y > x || y > z)) {
			  System.out.println("");
			  System.out.println("The second integer you entered was equal to one or more of your inputs.");
			  System.out.println("And it is indeed the greatest among the other inputs.");
			  
		  //displays message if second user input is equal to any other input, and is not the greatest
		  }else if((y == x || y == z) && (y < x || y < z)) {
			  System.out.println("");
			  System.out.println("The first integer you entered was equal to one or more of your inputs.");
			  System.out.println("But it is not the greatest among the other inputs.");
			  
			  
			  
		  //displays message if third user input is greater than the rest
		  }else if(z > x && z > y) {
			  System.out.println("");
			  System.out.println("The third integer you entered was the greatest!");
			  
		  //displays message if third user input is equal to any other input, and is 
		  }else if((z == x || z == y) && (z > x || z > y)) {
			  System.out.println("");
			  System.out.println("The third integer you entered was equal to one or more of your inputs.");
			  System.out.println("And it is indeed the greatest among the other inputs.");
			 
		  //displays message if third user input is equal to any other input, and is not the greatest
		  }else if((z == y || z == x) && (z < x || z < y)) {
			  System.out.println("");
			  System.out.println("The first integer you entered was equal to one or more of your inputs.");
			  System.out.println("But it is not the greatest among the other inputs.");
			  
		  }//end of if/else-if statements
		  
	}//end of method
	
}//end of class
