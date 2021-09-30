/*
* Task: Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday
*/

package homework3;

//imports necessary tool to allow user inputs
import java.util.Scanner;

public class NumericWeekdayGenerator {


	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
			  
		//asks user for an integer input
		System.out.print("Please enter an integer between 1 and 7 (inclusive): ");
			  
		//declares and initializes the user input to a variable
		int UserNum = input.nextInt();
			  
		//displays the user's input
		System.out.println("The integer you entered is: " + UserNum);
			  
		//closes user's ability to input a value
		input.close();
			  
		//runs the WeekdayGenerator method and displays the associated weekday for the user input
		WeekdayGenerator(UserNum);  
			  
	}//end of main

	
	//a method in which generates a weekday dependent on a user input
	public static void WeekdayGenerator(int x){
		//switch expression
		switch(x) {
		//case statements
			case 1: System.out.println("The number you enetered corresponds to the weekday Monday!");
			break;
			case 2: System.out.println("The number you entered corresponds to the weekday Tuesday!");
			break;
			case 3: System.out.println("The number you entered corresponds to the weekday Wednesday!");
			break;
			case 4: System.out.println("The number you entered corresponds to the weekday Thursday!");
			break;
			case 5: System.out.println("The number you entered corresponds to the weekday Friday!");
			break;
			case 6: System.out.println("The number you entered corresponds to the weekday Saturday!");
			break;
			case 7: System.out.println("The number you entered corresponds to the weekday Sunday!");
			break;
			default: System.out.println("The number you entered was not between 1 to 7 inclusive.");
			System.out.println("Therefore there is no corresponding weekday!");
		}//end of switch statements
		
	}//end of method
	
	
}//end of class