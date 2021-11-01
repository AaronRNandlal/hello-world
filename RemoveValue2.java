/*
 * 
 * Write a static method remove(int v,int[] in) that will return a new array of the integers
 * in the given array, but with the value v removed. For example, if v is 3 and in contains 
 * 0, 1, 3, 2, 3, 0, 3, and 1, the method will return an array containing 0, 1, 2, 0, and 1.
 * 
 * (NOTE): I have implemented a user input mechanism that allows the user to create and populate 
 * their own array. This array will then be used to remove whatever value the user desires from
 * their array.
 * 
 */

package homework5;

//imports necessary tools to allow user inputs
import java.util.Scanner;


public class RemoveValue2 {
	
		
public static void main(String[] args) {
		
		//allows user's ability to input values for each declared variable
		Scanner input = new Scanner(System.in);
		
		//declaring variables used within the code
		int numElements, userInput, count=0, value;
		
		//asks user how many elements they would like their array to have
		System.out.println("How many elements would you like your array to have?");
		numElements = input.nextInt();
				
		//declares an user-based array that corresponds to the user's input
		int[] userArr = new int[numElements];
				
		//a do-while loop used to populate the user array with values and a corresponding user friendly statement
		do {
					
			//asks user for their desired double value
			System.out.println("What value would you like to assign index: " + count);
			userInput = input.nextInt();
					
			//assigns user input to elements of the array
			userArr[count] = userInput;
			count++;
				
		//conditional statement that assures the loop will run until the array is fully populated
		}while(count < numElements);
		
		//asks user what value they wish to remove form the array
		System.out.println("What value would you like to remove from your user-created array? : ");
		value = input.nextInt();
		
		//closes user's ability to input a value
		input.close();
		
		//displays a numeric representation of the user's array
		System.out.println(" ");
		System.out.println("---------------------------------------------------");
		System.out.println(" ");
		System.out.println("User Array before removal of value: " + value);
		System.out.print("  { ");
		for(int i = 0 ; i< userArr.length ; i++) {
			System.out.print(userArr[i] + "  ");
		}//end of for loop
		System.out.print("} ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("---------------------------------------------------");
		System.out.println(" ");
		
		//utilizes and calls forth the remove method (defined below)
		remove(value, userArr);

		
	}//end of main

	
	static void remove(int v, int[] in) {
		
		int valueCount = 0, uniqueCount = 0;
				
		//spans the user array and counts the occurrences of the value that is being removed
		for(int i = 0 ; i < in.length-1 ; i++) {
			if(in[i] == v){
				valueCount++;
			}
		}//end of for loop
		
		//Statements used to verify that the # of occurrences and the array length are correct, when using the difference for the newArray
			//System.out.println("The value count is: " + valueCount);
			//System.out.println("The array length is: " + in.length);
		
		//declares and initializes the newArray to only hold all values besides the one being removed
		int newArr[] = new int[in.length - valueCount];
		
		//searches the user array for all values not equal to the one being removed and assigns it to its respective index value for the new array
		for(int i = 0 ; i < in.length; i++) {
			if(in[i] != v) {
				uniqueCount++;
				newArr[uniqueCount-1] = in[i];
			}
		}//end of for loop
		
		//displays a numeric representation of the new array after removing the integer
		System.out.println("User array after removal of value: " + v);
		System.out.print("  { ");
		for(int i = 0 ; i< newArr.length ; i++) {
		System.out.print(newArr[i] + "  ");
		}//end of for loop
		System.out.print("} ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("---------------------------------------------------");
		System.out.println(" ");
		
	}//end of method
	
	
}//end of class

