/*
 *
 * Task: Write a static method isStrictlyIncreasing(double[] in) that returns true if each value in the given array 
 * is greater than the value before it, or false otherwise.
 * 
 * (NOTE): I have implemented a user input mechanism that allows the user to create and populate their own array. 
 * This array will then be used to observe if it is indeed strictly increasing or not.
 * 
 */

package homework5;

//imports necessary tools to allow user inputs
import java.util.Scanner;


public class strictlyIncreasing {

	
	public static void main(String[] args) {
		
		//allows user's ability to input values
		Scanner input = new Scanner(System.in);
		
		//declaring variables used within the code
		int numElements, count=0;
		double userInput;
		
		//asks user how many elements they would like their array to have
		System.out.println("How many elements would you like your array to have?");
		numElements = input.nextInt();
		
		//declares an user-based array that corresponds to the user's input
		double[] userArr = new double[numElements];
		
		//a do-while loop used to populate the user array with values and a corresponding user friendly statement
		do {
			
			//asks user for their desired double value
			System.out.println("What 'double' value would you like to assign index: " + count);
			userInput = input.nextDouble();
			
			//assigns user input to elements of the array
			userArr[count] = userInput;
			count++;
		
		//conditional statement that assures the loop will run until the array is fully populated
		}while(count < numElements);
		
		//closes user's ability to input a value
		 input.close();
		
		//displays a numerical representation of the user's array
		System.out.println(" ");
		System.out.println("--------------------------------------------------------");
		System.out.println(" ");
		System.out.println("The user's array consists of the following elements: ");
		System.out.print("  { ");
		for(int i = 0 ; i < userArr.length ; i++) {
			System.out.print(userArr[i] + "  ");
		}//end of for loop
		System.out.print("}");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("--------------------------------------------------------"); 
		System.out.println("Given the values in the array...");
		
		//utilizes and calls forth the isStrictlyIncreasing method (defined below)
		isStrictlyIncreasing(userArr);
		
	}//end of main
	

	static void isStrictlyIncreasing(double[] in) {
		
		//counter used to keep track of how many of how many times the elements
		//were strictly increasing
		int increasingNumCounter = 0;
		int sameNumCounter = 0;
		
		//a loop used to navigate through each element of the array
		for(int i = 0; i < in.length-1; i++) {
			
			//adds numbers to counters if sufficient conditions are met
			if(in[i] < in[i+1]) {
				increasingNumCounter += 1;
			}else if(in[i] == in[i+1]) {
				sameNumCounter +=1;
			}
			
		}//end of for loop

		//compares the counter with the length of the array and determines
		//whether it equals the mount of elements in the array
		if(increasingNumCounter == in.length-1) {
			System.out.println("True! This array is indeed strictly increasing!");
			//System.out.println("Counter: " + increasingNumCounter);
			//System.out.println("sameNumCounter: " + sameNumCounter);
		}else if(increasingNumCounter != in.length-1 && sameNumCounter > 0){
			System.out.println("False! This array contains a duplicate value next to one another.");
			System.out.println("Therefore this array is not strictly increasing.");
			//System.out.println("Counter: " + increasingNumCounter);
			//System.out.println("sameNumCounter: " + sameNumCounter);
		}else if(increasingNumCounter != in.length-1) {
			System.out.println("False! This array is not strictly increasing!");
			//System.out.println("Counter: " + increasingNumCounter);
			//System.out.println("sameNumCounter: " + sameNumCounter);
		}
		
	}//end of method
	
	
}//end of class
