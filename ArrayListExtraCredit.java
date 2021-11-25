//For Extra points write a class to store and print name of all students using arraylist

//name of package the code resides in
package extraCreditCode;

//imports all necessary tools to allow user inputs and dynamic use of array
import java.util.Scanner;
import java.util.*;  
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayListExtraCredit {

	//a class that will be used to ask, retrieve, store, and print user-entered student names
	public static class StudentNames{
		
		//creating an array list to represent a collection of multiple student names
		static ArrayList<String> nameList = new ArrayList<String>();
		
		
		//a class constructor that asks and stores the names of students entered
		public static void AskAndStoreNames(int cSize) {
			
			//continuously asks the user to enter student names for the length of their class size
			for(int m = cSize  ; m > 0 ; m--) {
				
				//creates a scanner object necessary for string-based user input
				Scanner input = new Scanner(System.in);  // Create a Scanner object
				
				//allows the user input to be read
				String studentName = input.nextLine();
				
				//adds the name object into the nameList array list
				nameList.add(studentName);
				
			}//end of for loop
			
			
		}//end of AsksAndStoresNames constructor
		
		
		//a class constructor that prints all entered student names
		public static void PrintNames() {
			
			//allows the array list to be traversed
			Iterator itr=nameList.iterator();  
			
			int studentCount = 0;
			System.out.println("____________________________________________________________________________");
			System.out.println("|                                                                          |");
			//loops through the array list and prints the student names
			while(itr.hasNext()){  
				
				//prints the student name with its corresponding number
				studentCount++;
				System.out.println("|                   Student " + studentCount + ": " + itr.next() + ". "); 
			
			}//end of while loop
			System.out.println("|__________________________________________________________________________|");
			
		}//end of PrintNames constructor 
		
	}//end of StudentNames
	
	
	public static void main(String args[]) throws NumberFormatException, IOException{  
		
		//displays informative message about the purpose of the code
		informativeMessage();
		
		//creates an instance of the StudentNames class (an object of it)
		StudentNames test1 = new StudentNames();
		
		//displays a prompt that asks the user for their class size
		ClassSizeQuestion();
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		int classSize = Integer.parseInt(br.readLine());
		
		//displays a prompt that asks the user for a student name
		StudentNameQuestion();
		
		//calls forth the class constructor to ask and store student names
		test1.AskAndStoreNames(classSize);
		
		//displays a message before printing back all entered student names
		userFriendlyMessage();
		
		//calls forth the class constructor to print the student names in chronological order
		test1.PrintNames();
		
		//displays a closing message to the user
		closingMessage();
		
	}//end of main

	
	//displays a message informing the user about the purpose of the code before asking for their inputs
	static void informativeMessage() {
		System.out.println("____________________________________________________________________________");
		System.out.println("|      This code will initially ask the user to input their class size.    |");
		System.out.println("|   Dependent on this size, the user will be asked to input the names of   |");
		System.out.println("|   their students. Once entered, these names will be stored in an array   |");
		System.out.println("|   and be printed in chronological order after all inputs are obtained.   |");
		System.out.println("|                                                                          |");
		System.out.println("|                    Thank you for your time in advance                    |");
		System.out.println("|                 With that said, please enjoy my program!                 |");
		System.out.println("|__________________________________________________________________________|");
	}//end of informativeMessage method
	
	
	//displays a user graphic before asking the user for their class size
	static void ClassSizeQuestion() {
		System.out.println(" ");
		System.out.println("____________________________________________________________________________");
		System.out.println("|             Please enter the amount of students in your class:           |");
		System.out.println("|__________________________________________________________________________|");
	}//end of ClassSizeQuestion display
	
	
	//displays a user graphic before asking the user for the names of each student in their class
	static void StudentNameQuestion() {
		System.out.println("____________________________________________________________________________");
		System.out.println("|                  Please enter the name of all students                   |");
		System.out.println("|__________________________________________________________________________|");
	}//end of StudentNameQuestion display
	
	
	//displays a user graphic before asking the user for the names of each student in their class
	static void userFriendlyMessage() {
		System.out.println("____________________________________________________________________________");
		System.out.println("|    Given your inputs, your class consists of the following students:     |");
		System.out.println("|__________________________________________________________________________|");
	}//end of userFriendlyMessage display
		
	//displays a user graphic before asking the user for the names of each student in their class
	static void closingMessage() {
		System.out.println("____________________________________________________________________________");
		System.out.println("|        This marks the end of my code, I hope you've enjoyed it and       |");
		System.out.println("|        will add the aproppriate amount of extra credit to my grade!      |");
		System.out.println("|__________________________________________________________________________|");
	}//end of closingMessage display
	
		
}//end of ArrayListExtraCredit class
	