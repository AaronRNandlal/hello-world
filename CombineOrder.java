/*
 * 
 * Task: Suppose that we are selling boxes of candy for a fund-raiser. We have five kinds of candy 
 * to sell: Mints, Chocolates with Nuts, Chewy Chocolates, Dark Chocolate Creams, and Sugar-Free 
 * Suckers. We will record a customer’s order as an array of five integers, representing the number 
 * of boxes of each kind of candy. Write a static method combineOrder that takes two orders as its 
 * arguments and returns an array that represents the combined orders. For example, if order1 contains 
 * 0, 0, 3, 4, and 7, and order2 contains 0, 4, 0, 1, and 2, the method should return an array containing 
 * 0, 4, 3, 5, and 9.
 * 
 * (NOTE): I have implemented a user input mechanism that allows the user to create and populate their own array. 
 * This array will then be combined with a default order to observe the effectiveness of my combinedOrder method.
 * 
 */

package homework5;

//imports necessary tools to allow user inputs
import java.util.Scanner;


public class CombineOrder {

	
	public static void main(String[] args) {
		
		//declaring variables for the number of boxes for each candy type
		int numMints, numChocoNuts, numChewyChoco, numDarkChoco, numSugarFree;
		
		//allows user's ability to input values for each declared variable
		Scanner input = new Scanner(System.in);
		
		//user friendly statements that welcome and asks user for their inputs
		System.out.println("Welcome to New York Tech's annual Candy-Fest Fund-raiser!");
		
		System.out.println("  How many boxes of Mints would you like, if any?: ");
		numMints = input.nextInt();
		
		System.out.println("  How many boxes of Chocolates with Nuts would you like, if any?: ");
		numChocoNuts = input.nextInt();
		
		System.out.println("  How many boxes of Chewy Chocolates would you like, if any?: ");
		numChewyChoco = input.nextInt();
		
		System.out.println("  How many boxes of Dark Chocolate Creams would you like, if any?: ");
		numDarkChoco = input.nextInt();
		
		System.out.println("  How many boxes of Sugar Free Suckers would you like, if any?: ");
		numSugarFree = input.nextInt();
		System.out.println(" ");
		
		//closes user's ability to input a value for each of the declared variables
		 input.close();
		
		//displays a verbal and numerical representation of the user's order
		System.out.println("----------------------------------------------------------------------------");
		System.out.println(" ");
		System.out.println("Thank you for your purchase, your order consists of: ");
		System.out.println("  Boxes of Mints: " + numMints);
		System.out.println("  Boxes of Chocolates with Nuts: " + numChocoNuts);
		System.out.println("  Boxes of Chewy Chocolates: " + numChewyChoco);
		System.out.println("  Boxes of Dark Chocolate Creams: " + numDarkChoco);
		System.out.println("  Boxes of Sugar Free Suckers: " + numSugarFree);
		System.out.println(" ");
		
		//declares and initializes the customer and default order
		int arrOrder1[] = {numMints, numChocoNuts, numChewyChoco, numDarkChoco, numSugarFree};
		int arrOrder2[] = {0, 4, 0, 1, 2};
		
		//displays a verbal and numerical representation of the default order
		System.out.println("The default order consists of: ");
		System.out.println("  Boxes of Mints: " + arrOrder2[0]);
		System.out.println("  Boxes of Chocolates with Nuts: " + arrOrder2[1]);
		System.out.println("  Boxes of Chewy Chocolates: " + arrOrder2[2]);
		System.out.println("  Boxes of Dark Chocolate Creams: " + arrOrder2[3]);
		System.out.println("  Boxes of Sugar Free Suckers: " + arrOrder2[4]);
		System.out.println(" ");
		
		//displays a numerical representation of both the user's and default order
		System.out.println("As a formality here are the orders before combination:");
		System.out.print("  Customer: ");
		for(int i = 0 ; i < arrOrder1.length ; i++){
			System.out.print(arrOrder1[i] + " ");
		}
		System.out.println(" ");
		System.out.print("  Default: ");
		for(int i = 0 ; i < arrOrder2.length ; i++){
			System.out.print(arrOrder2[i] + " ");
		}
		System.out.println(" ");
		System.out.println(" ");
		
		//utilizes and calls forth the combineOrder method (defined below)
		combineOrder(arrOrder1, arrOrder2);
		
	}//end of main
	
	
	static void combineOrder(int arr1[], int arr2[]){
		
		//declares and initializes an array to hold the combined order values
		int combinedOrder[] = {0, 0, 0, 0, 0};
		
		//spans through the combinedOrder array and replaces the 0's with the combined values
		for(int i = 0 ; i < arr1.length ; i++) {
			combinedOrder[i] = (arr1[i] + arr2[i]);
		}//end of for loop
		
		//displays a verbal and numerical representation of the combined order
		System.out.println("----------------------------------------------------------------------------");
		System.out.println(" ");
		System.out.println("The combined order of the customer & that of the default is as follows: ");
		System.out.println("  Boxes of Mints: " + combinedOrder[0]);
		System.out.println("  Boxes of Chocolates with Nuts: " + combinedOrder[1]);
		System.out.println("  Boxes of Chewy Chocolates: " + combinedOrder[2]);
		System.out.println("  Boxes of Dark Chocolate Creams: " + combinedOrder[3]);
		System.out.println("  Boxes of Sugar Free Suckers: " + combinedOrder[4]);
		System.out.println(" ");
		
		//displays a numerical representation of the combined order
		System.out.print("  Customer: ");
		for(int i = 0 ; i < arr1.length ; i++){
			System.out.print(arr1[i] + " ");
		}//end of for loop
		System.out.println(" ");
		System.out.print("  Default: ");
		for(int i = 0 ; i < arr2.length ; i++){
			System.out.print(arr2[i] + " ");
		}//end of for loop
		System.out.println(" ");
		System.out.println("          +___________");
		System.out.print("  Combined: ");
		for(int i = 0 ; i < combinedOrder.length ; i++){
			System.out.print(combinedOrder[i] + " ");
		}//end of for loop
		System.out.println(" ");
		
		
	}//end of combineOrder method

	
}//end of class
