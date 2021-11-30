/*

5.) Create an interface MessageEncoder that has a single abstract method encode(plainText), where 
    plainText is the message to be encoded. The method will return the encoded message.

6.) Create a class SubstitutionCipher that implements the interface MessageEncoder, as described in the 
    previous exercise. The constructor should have one parameter called shift. Define the method encode so 
    that each letter is shifted by the value in shift. For example, if shift is 3, a will be replaced by d, b will be 
    replaced by e, c will be replaced by f, and so on. Hint: You may wish to define a private method that shifts 
    a single character.
    
 */

package homework6;

//imports all necessary tools to allow for user inputs
import java.util.Scanner;

public interface MessageEncoderHomework {
	
	//create an interface named MessageEncoder that bears a single abstract method called encode
	public interface MessageEncoder {

		//a single abstract method where the plainText will be encoded
		public abstract String encode(String plainText);

	}//end of Message Encoder interface

	
	//creates a class called SubstitutionCipher that is implements the interface MessageEncoder
	public class SubstitutionCipher implements MessageEncoder {

		//an integer that represents how much the value is shifted by
		private int numShift;    

		//class constructor that takes shift as its parameter
		public SubstitutionCipher (int numShift){
				
			//used to reference the object of the current class for constructors
			this.numShift = numShift;

		}//end of SubstitutionCipher constructor
		
		
		//a private method that allows for a single character to be shifted
		private char SingleCharShift(char s) {
			
			//returns the newly shifted character
			char charComputation = (char)(( (s - 'a' + this.numShift) % 26) + 'a');
			
			return (charComputation);

		}//end of SingleCharShift method
		
		
		//a method that will shift the user text by the value in numShift
		public String encode(String plainText){

			//declares and initializes a string to contain the shifted characters
			String encodedResult = "";
			
			//assigns the characters to a char array cHolder
			for( int i = 0; i < plainText. length(); i++){
				
				char cHolder = plainText. charAt(i);
				
				//utilizes the SingleCharShift method for each character in the plainText
				encodedResult += Character.toString(SingleCharShift(cHolder));

			}//end of for loop
			return encodedResult;

		}//end of encode method
		
	}//end of SubstitutionCipher class
	
	
	//main used to test functionality of the code
	public static void main (String[] args){

		//creates the object of the scanner class to allow user inputs
		Scanner input = new Scanner(System.in);
		
		//displays an informative message about the code before interacting with the user
		informativeMessage();
		
		//displays the prompt asking the user to enter their message
		messagePrompt();
	
		//allows the user to enter an input that will be used as plainText
		String PlainText = input.nextLine();
			
		//displays the prompt asking the user to enter an integer that their message will be shifted by
		shiftPrompt();
		
		//allows the user to enter an input that will be used as numShift
		int numShift = input.nextInt();
	
		//creates the object of the class SubstitutionCipher so the testing can begin
		SubstitutionCipher obj = new SubstitutionCipher(numShift);
	
		//declaring and initializing a string variable to represent the result of calling the method encode
		String stringResult = obj.encode(PlainText);
	
		//closes the scanner so that user input will no longer be allowed
		input.close();
		
		//displays the new message
		encodedMessagePrompt(stringResult);

	}//end of main

	
	//displays a message informing the user about the purpose of the code before asking for their inputs
	static void informativeMessage() {
		System.out.println("____________________________________________________________________________");
		System.out.println("|     This code will initially ask the user to input a message of their    |");
		System.out.println("|   choosing. After this the user will be asked to enter the amount they   |");
		System.out.println("|   want their message to be shifted. Through use of interfaces, classes,  |");
		System.out.println("|   methods/constructors, and much more the user inputs will produce an    |");
		System.out.println("|                         encoded message for the user.                    |");
		System.out.println("|                                                                          |");
		System.out.println("|                    Thank you for your time in advance                    |");
		System.out.println("|                 With that said, please enjoy my program!                 |");
		System.out.println("|__________________________________________________________________________|");
	}//end of informativeMessage method
	
	
	//displays a user graphic before asking the user for their message
	static void messagePrompt() {
		System.out.println(" ");
		System.out.println("____________________________________________________________________________");
		System.out.println("|                   Please enter a message to be encoded:                  |");
		System.out.println("|__________________________________________________________________________|");
	}//end of messagePrompt display
	
	
	//displays a user graphic before asking the user for their message
	static void shiftPrompt() {
		System.out.println(" ");
		System.out.println("____________________________________________________________________________");
		System.out.println("|     Please enter an integer your original message will be shifted by:    |");
		System.out.println("|__________________________________________________________________________|");
	}//end of messagePrompt display
	
	
	//displays a user graphic before asking the user for their message
	static void encodedMessagePrompt(String eMessage) {
		System.out.println(" ");
		System.out.println("____________________________________________________________________________");
		System.out.println("|      The following set of characters is your newly encoded message:      |");
		System.out.println("       " + eMessage + " " );
		System.out.println("|__________________________________________________________________________|");
	}//end of messagePrompt display
	
	
}//end of message encoder Code