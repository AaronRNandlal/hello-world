package homework6;

//imports necessary tool to allow user inputs
import java.util.Scanner;


public class PayCalculatorAbstractClassRevised {

	//abstract class required from question 1
	public static abstract class PayCalculator{
		
		//declaring a variable pay rate (dollars per hour) for the parent class
		double payRate;
		
		//defined method to compute the pay given an amount of time
		public double computePay(double hours) {
			double totalPay = hours * payRate;
			return totalPay;
		}
		
	}//end of PayCaclulator class
	
	
	//deriving class RegularPay from PayCalculator as defined above
	public static class RegularPay extends PayCalculator{
		
		//defines a class constructor that has payRate as its parameters does not override any previous methods
		public RegularPay(double rate) {
			super.payRate = rate;
		}
		
	}//end of RegularPay class
	
	
	//deriving class HazardPay from PayCaclulator
	public static class HazardPay extends PayCalculator{
		
		//defines a class constructor that has payRate as its parameters but does not override any previous methods
		public HazardPay(double rate) {
			super.payRate = rate;
		}
		
		//overrides computePay method from its parent class to produce a new Hazard Pay
		public double computePay(double hours){
			double newlyComputedPay = super.computePay(hours) * 1.5;
			return newlyComputedPay;
		}
		
	}//end of HazardPay class
	
	
	//displays a message informing the user about the purpose of the code before asking for their inputs
	static void userMessage() {
		System.out.println("_____________________________________________________________________________");
		System.out.println("|  This code will take a user input for the amount of a hours an individual  |");
		System.out.println("| works and computes both their regular and hazard pay for the predetermiend |");
		System.out.println("| rate.                                                                      |");
		System.out.println("|_____________________________________________________________________________");
		System.out.println(" ");
	}//end of userMessage display
	
	
	//displays a user graphic before printing the discount statements using the inputs given
	static void userGraphic() {
		System.out.println(" ");
		System.out.println("__________________________________________________________________________");
		System.out.println("|    Based on your user inputs, the following statements stand true:     |");
		System.out.println("|________________________________________________________________________|");
	}//end of userGraphic display
	
	
	public static void main(String[] args) {
		
		//displays a user-friendly message
		userMessage();
		
		//opens user's ability to input values
		Scanner input = new Scanner(System.in);
		
		//asks the user to input their desired # of hours
		System.out.println("How many hours did the suppossed worker work?");
		
		//declares and initializes a user input to represent time spent working
		double hours = input.nextDouble();
		
		//asks the user to input a pay rate value for the code
		System.out.println(" ");
		System.out.println("What pay rate (per hour) does the suppossed worker have?");
		
		//declares and initializes a user input to represent the rate of pay for the hypothetical worker
		double rateOfPay = input.nextDouble();
		
		//closes user's ability to input values
		input.close();
		
		//creating instances (objects) of the class defined above
		RegularPay obj = new RegularPay(rateOfPay);
		HazardPay obj2 = new HazardPay(rateOfPay);
		
		//displays a user-friendly graphic
		userGraphic();
		
		//proves that Hazard Pay works as intended
		System.out.println("The regular pay for a person with a pay rate of $" + obj.payRate + " per hour, will be $" + obj.computePay(hours));
		System.out.println("The hazard pay for a person with a pay rate of $" + obj2.payRate + " per hour, will be $" + obj2.computePay(hours));
		
		
	}//end of main

	
}//end of class
