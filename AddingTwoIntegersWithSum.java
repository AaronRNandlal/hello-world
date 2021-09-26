/*
 * Task: Create a class that adds two integers and prints the sum
 */

package homework2;

public class AddingTwoIntegersWithSum {

	//main
	public static void main(String[] args) {
		
		//declares a,b, and c as integers
		int a,b,c;
		
		//initializes a and b to an integer value
		a = 35;
		b = 75;
		
		//initializes c to equal the sum of a and b
		c = a + b;
		
		//prints user friendly statement about the first term
		System.out.println("The first integer is:  " + a);
		
		//prints user friendly statement about the second term
		System.out.println("The second integer is: " + b);
		
		//prints user friendly statement about the sum term
		System.out.println("The sum of " + a + " + " + b + " = " + c);
		
	}

}
