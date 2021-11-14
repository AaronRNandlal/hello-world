package homework6;

//imports necessary tool to allow user inputs
import java.util.Scanner;


public class DiscountPolicyAbstractClass {

	//abstract class required from question 3
	static abstract class DiscountPolicy{
		
		//declares a abstract method that will return the discount of the purchase given a number of a single item
		public abstract double computeDiscount(int count, double itemCost);
		
	}//end of DiscountPolicy parent class
	
	
	//deriving class BulkDiscount from DiscountPolicy as defined above
	public static class BulkDiscount extends DiscountPolicy{

		//creates fields for minimum and percent so the 'this' keyword can be used
		private int minimum;
		private double percent;

		//defines a class constructor that has a 'minimum' and 'percent' as its parameters
		public BulkDiscount(int minimum, double percent) {
			
			//allows the variables minimum and percent to be accessed by the computeDiscount method
			this.minimum = minimum;
			this.percent = percent;
			
		}//end of BulkDiscount constructor
		
		
		public double computeDiscount(int count, double itemCost) {
			
			//declares and initializes variables to simplify necessary computations
			double percentAsDecimal = percent / 100;
			double totalCost = count * itemCost;
			double computedDiscount = percentAsDecimal * totalCost;
			
			//if-else-if statement that computes the discounted price only if appropriate conditions are satisfied
			if(count >= minimum) {
				return computedDiscount;
			}
			return 0;
			
		}//end of computeDiscount method
		
		
	}//end of BulkDiscount child class
	
	
	//displays a message informing the user about the purpose of the code before asking for their inputs
	static void informativeMessage() {
		System.out.println("__________________________________________________________________________");
		System.out.println("|    This code will take user input for a specific quantity of an item,  |");
		System.out.println("| the item's cost, as well as a percent discount given a minimum amount  |");
		System.out.println("| of the item. With this information a discounted price will be produced!|");
		System.out.println("|________________________________________________________________________|");
	}//end of informativeMessage method
	
	
	//displays a user question based on what user input will be needed in the main
	static void userQuestions(int promptNum) {
		System.out.println("");
		
		if( promptNum == 1) {
			System.out.println("How much of the item do you want the supossed customer to purchase?");
		}else if(promptNum == 2) {
			System.out.println("What is the cost of each item that the supossed customer is buying?");
		}else if(promptNum == 3) {
			System.out.println("What is the minimum amount of the item needed for the discount to be applied?");
		}else if(promptNum == 4) {
			System.out.println("At what percent discount are you willing to offer the customer?");
		}
	}//end of userQuestions display
	
	
	//displays a user graphic before printing the discount statements using the inputs given
	static void userGraphic() {
		System.out.println(" ");
		System.out.println("__________________________________________________________________________");
		System.out.println("|    Based on your user inputs, the following statements stand true:     |");
		System.out.println("|________________________________________________________________________|");
	}//end of userGraphic display
	
	
	//displays a user question based on what user input will be needed in the main
		static void userDiscountStatements(int promptNum) {
			System.out.println("");
			
			if( promptNum == 1) {
				System.out.println("Based on the item quantity and cost entered, the tota cost before");
				System.out.print("being discounted is: $");
			}else if(promptNum == 2) {
				System.out.println(" ");
				System.out.print("After discount the total discount for the customer would be: $");
			}else if(promptNum == 3) {
				System.out.println(" ");
				System.out.print("Thus the total cost the customer has to pay would be: $");
			}
		}//end of userDiscountStatements display
		
	
	//main
	public static void main(String[] args) {
		
		//declaring all variables for future user inputs
		int count, minimum;
		double itemCost, percent;
		
		informativeMessage();
		
		//opens user's ability to input values
		Scanner input = new Scanner(System.in);
		
		//asks the user to enter a desired input and initializes a variable to the user input
		userQuestions(1);
		count = input.nextInt();
		userQuestions(2);
		itemCost = input.nextDouble();
		userQuestions(3);
		minimum = input.nextInt();
		userQuestions(4);
		percent = input.nextDouble();
		
		//closes user's ability to input values
		input.close();
		
		//creates an instance of the BulkDiscount class (an object of it)
		BulkDiscount obj = new BulkDiscount(minimum, percent);
		
		//displays a series of statements based on the user's input and the BulkDiscount class
		userGraphic();
		userDiscountStatements(1);
		System.out.println(count*itemCost);
		userDiscountStatements(2);
		System.out.println(obj.computeDiscount(count, itemCost));
		userDiscountStatements(3);
		System.out.println(count*itemCost - obj.computeDiscount(count, itemCost));
		
	}//end of main

}//end of class