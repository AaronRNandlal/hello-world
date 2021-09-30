/*
 * Task: Write a Java program that contains a method to get a number from the user and print whether it is positive or negative
 */

package homework3;

//imports necessary tool to allow user inputs
import java.util.Scanner;

public class PositiveOrNegative {
	
	//main
	public static void main(String[] args) {
		
		  Scanner input = new Scanner(System.in);
		  
		  //asks user for an integer input
		  System.out.print("Please enter an integer:");
		  
		  //
		  int UserNum = input.nextInt();
		  
		  //displays the user's input
		  System.out.println("The integer you entered is: " + UserNum);
		  
		  //closes user's ability to input a value
		  input.close();
		  
		  //runs the PositiveOrNegative method & determines which the user input is
		  PositiveOrNegative(UserNum);
		  
	}//end of main
		  
		  
	//a method in which determines whether or not the input is positive or negative using if/else-if statements
	public static void PositiveOrNegative(int x) {
		//if/else-if statement that displays whether the user's input was positive or not
		if(x > 0){
			  
			//displays that the user integer is positive
			System.out.println("The integer " + x + " is positive!");
			  
		}else if(x < 0){
			  
			//displays that the user integer is negative
			System.out.println("The integer " + x + " is negative!");
			
		}else if(x == 0){
			
			//displays that the user integer is neither
			System.out.println("The integer " + x + " is neither positive or negative!");
			
		}//end of if/else-if statement 
	
	
	}//end of method
	
	
}//end of class