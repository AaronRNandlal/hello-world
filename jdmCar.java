package homework4;

public class jdmCar {

	//properties for jdmCar
	String manufacturer;
	String paintJob;
	String model;
	int yearProduced;
	int currentValue;
	
	
	//introductory car listing
	public void carListing() {
		System.out.println("Welcome, this " + manufacturer + " " + model + " is currently for sale.");
		System.out.println("This " + paintJob + " is a JDM classic and is listed at " + currentValue + " dollars!");
		System.out.println(" ");
	}
	
	
	//car reliability statement
	public void reliabilityEval() {
		
		if((2021-yearProduced) <= 10) {
			System.out.println("This " + model + " is a reliable car.");
			System.out.println("The vehicle's age can attest to this claim.");
			System.out.println(" ");
		}else if((2021-yearProduced) <= 20) {
			System.out.println("Our " + model + " is a moderatly reliable car.");
			System.out.println("The vehicle's age can attest to this claim.");
			System.out.println(" ");
		}else if((2021-yearProduced) <= 30) {
			System.out.println("Our " + model + " is an unreliable car.");
			System.out.println("The vehicle's age can attest to this claim.");
			System.out.println(" ");
		}
	}
	
	
	//car appreciation statement
	public void carAppreciation() {
		if(currentValue >= 20000) {
			System.out.println("Our " + manufacturer + " " + model + " will be worth approcimatly " + (currentValue+6000) + " in a decade.");
		}else if(currentValue >= 15000) {
			System.out.println("Our " + manufacturer + " " + model + " will be worth approcimatly " + (currentValue+5000) + " in a decade.");
		}else if(currentValue >= 10000) {
			System.out.println("Our " + manufacturer + " " + model + " will be worth approcimatly " + (currentValue+4000) + " in a decade.");
		}else if(currentValue >= 5000) {
			System.out.println("Our " + manufacturer + " " + model + " will be worth approcimatly " + (currentValue+3000) + " in a decade.");
		}else
			System.out.println("Our " + manufacturer + " " + model + " will be worth approcimatly " + (currentValue+2000) + " in a decade.");
	}
	
	
	//car visual display
	public void carVisual() {
		if(manufacturer == "Toyota" || manufacturer == "toyota") {
			System.out.println("A rendered image of our "+ yearProduced + " " + manufacturer + " " + model + " looks like the image below.");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("                              _.-=\"_-         _");
			System.out.println("                         _.-=\"   _-          | ||\"\"\"\"\"\"\"---._______     __..");
			System.out.println("             ___.===\"\"\"\"-.______-,,,,,,,,,,,,`-''----\" \"\"\"\"\"       \"\"\"\"\"  __'");
			System.out.println("      __.--\"\"     __        ,'                   o \\           __        [__|");
			System.out.println(" __-\"\"=======.--\"\"  \"\"--.=================================.--\"\"  \"\"--.=======:");
			System.out.println("]       [w] : /        \\ : |========================|    : /        \\ :  [w] :");
			System.out.println("V___________:|          |: |========================|    :|          |:   _-\"");
			System.out.println(" V__________: \\        / :_|=======================/_____: \\        / :__-\"");
			System.out.println(" -----------'  \"-____-\"  `-------------------------------'  \"-____-\"");
		}else if(manufacturer == "Nissan" || manufacturer == "nissan") {
			System.out.println("A rendered image of our "+ yearProduced + " " + manufacturer + " " + model + " looks like the image below.");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("                      ___..............._");
			System.out.println("             __.. ' _'.\"\"\"\"\"\"\\\\\"\"\"\"\"\"\"\"- .`-._");
			System.out.println(" ______.-'         (_) |      \\\\           ` \\\\`-. _");
			System.out.println("/_       --------------'-------\\\\---....______\\\\__`.`  -..___");
			System.out.println("| T      _.----._           Xxx|x...           |          _.._`--. _");
			System.out.println("| |    .' ..--.. `.         XXX|XXXXXXXXXxx==  |       .'.---..`.     -._");
			System.out.println("\\_j   /  /  __  \\  \\        XXX|XXXXXXXXXXX==  |      / /  __  \\ \\        `-.");
			System.out.println(" _|  |  |  /  \\  |  |       XXX|\"\"'            |     / |  /  \\  | |          |");
			System.out.println("|__\\_j  |  \\__/  |  L__________|_______________|_____j |  \\__/  | L__________J");
			System.out.println("     `'\\ \\      / ./__________________________________\\ \\      / /___________\\");
			System.out.println("        `.`----'.'   dp                                `.`----'.'");
			System.out.println("          `\"\"\"\"'                                         `\"\"\"\"'");
		}else if(manufacturer != "Toyota" || manufacturer != "Nissan" || manufacturer != "toyota" || manufacturer!= "nissan" ) {
			System.out.println("A rendered image of our "+ yearProduced + " " + manufacturer + " " + model + " looks like the image below.");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("                       ____________________");
			System.out.println("                     //|           |        \\");
			System.out.println("                   //  |           |          \\");
			System.out.println("      ___________//____|___________|__________()\\__________________");
			System.out.println("    /__________________|_=_________|_=___________|_________________{}");
			System.out.println("    [           ______ |           | .           | ==  ______      { }");
			System.out.println("  __[__        /##  ##\\|           |             |    /##  ##\\    _{# }_");
			System.out.println(" {_____)______|##    ##|___________|_____________|___|##    ##|__(______}");
			System.out.println("             /  ##__##                              /  ##__##        \\");
		}
	}
	
	
	//default constructor
	public jdmCar() {
		manufacturer = "Toyota";
		model = "Supra";
		paintJob = "White Pearl";
		yearProduced = 1994;
		
	}//end of default constructor
	
	
	//parameterized constructor
	public jdmCar(String make, String type, String color, int year, int price) {
		manufacturer = make;
		model = type;
		paintJob = color;
		yearProduced = year;
		currentValue = price;
		
	}//end of parameterized constructor
	
	
	public static void main(String[] args) {
		
		jdmCar c1 = new jdmCar("Toyota", "Mr2", "Silver Met", 1997, 15000);
		jdmCar c2 = new jdmCar("Nissan", "Laurel", "Bluish Silver Met", 2007, 21000);
		
		c1.carListing();
		c2.carListing();
		
		System.out.println("---------------------------------------------------");
		
		c1.reliabilityEval();
		c2.reliabilityEval();
		
		System.out.println("---------------------------------------------------");
		
		c1.carAppreciation();
		c2.carAppreciation();
		
		System.out.println("---------------------------------------------------");
		
		c1.carVisual();
		System.out.println("-----------------------------------------------------------------------------");
		c2.carVisual();
		
		System.out.println("-----------------------------------------------------------------------------");
	}

	
	
	
	//local var = method
	//instance var = class
	//static var = object
	
	
}//end of jdm car class
