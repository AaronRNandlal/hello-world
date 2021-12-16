//Aaron R. Nandlal
//CSCI-125
//Final Project (Turn-Based Role Playing Game)

/*
* In my RPG game you will fight a series of battles against
* 5 opponents,each placed in various rooms (in which their difficulty increases)
*
* I have attempted the following features in my game:
*       ~ allow three options when the player chooses to attack
*         ranging in different attack outputs
*
*       ~ varying miss rates for both player and enemy attacks
*         for each of their different attack options
*
*       ~ a stamina system that works along with the player attack
*         -light attack (1 stamina)  |  heavy attack (2 stamina)  |  special attack (5 stamina)    
*          mechanism (varies with player option)
*
*       ~ an item that drops after the player has defeated certain
*         enemies, that increases the player stats based upon the item
*
*       ~ finally, a 'leveling up' feature that boosts the player stats
*         based by a value of 10, after the deffeat of an enemy has been
*         successfully executed
*
*       ~ decent story line, plus creative cut-scenes and most importantly 
*         LOTS, and LOTS of time and effort
*
* I thank you in advance for your time, may you enjoy my game!
*/

//package name
package csci_125_Final_Project;

//allows for production of random numbers
//allows for user (input) interaction with the console
import java.util.Random;
import java.util.Scanner;


public class MyJavaRpgFinalProject {

	//character class utilized for the rpg game
	static class Character{
			
		private  int health;
		private  int strength;
		private  int defense;
		private  int speed;
		private  String name;

		public int getHealth() {
			return health;
		}
			
		void setHealth(int health) {
			this.health = health; 
		}
			
		int getStrength() {
			return strength;
		}
			
		void setStrength(int strength) {
			this.strength = strength;
		}
			
		int getDefense() {
			return defense;
		}
			
		void setDefense(int defense) {
			this.defense  = defense;
		}
			
		//-------------------------------------------(look at it)
		final String getName(){
			return name;
		}
			
		void setName(String name) {
			this.name = name; 
		}
			
		int getSpeed() {
			return speed;
		}
			
		void setSpeed(int speed) {
			this.speed = speed;
		}
			
			
		//Character();
		Character(String n, int h, int s, int d, int sp){
			name = n;
			health = h;
			strength = s;
			defense = d;
			speed = sp;
		}

	
		//function definition for playerAttack character function
		int playerAttack(int c) {
			  System.out.println(" ");
			  int s = 0;
			  int min = 0;
			  int max = 100;
			  int rand_m = (int)Math.floor(Math.random()*(max-min+1)+min);
			  int a_choice = c;
				 
			  System.out.println("               __[~ Player Attacks ~]__\n ");
				 
			  //attack value based upon selection of 'light' and 10% miss rate
			  if(a_choice == 1) {
				  if(rand_m >= 11 && rand_m <= 100){
					  s = (int) (0.75 * strength);
					  System.out.println("            " + name + " hit with a light attack. ");
					  System.out.println("            " + name + " dealt " + s + " damage!");
			
				  }else{
					  s = 0 * strength;
					  System.out.println("            " + name + " missed their light attack. ");
					  System.out.println("            " + name + " dealt " + s + " damage!");
				  }
		
			  //attack value based upon selection of 'heavy' and 15% miss rate
			  }else if(a_choice == 2){
				  if(rand_m >= 16 && rand_m <= 100){
					  s = (int) (1.00 * strength);
					  System.out.println("            " + name  + " hit with a heavy attack.");
					  System.out.println("            "  + name  + " dealt "  + s  + " damage!");
			
				  }else{
					  s = 0 * strength;
					  System.out.println("            "  + name  + " missed their heavy attack. ");
					  System.out.println("            "  + name  + " dealt "  + s  + " damage!");
				  }
		
				//attack value based upon selection of 'special' and 5% miss rate
			  }else if(a_choice == 3){
				  if(rand_m >= 6 && rand_m <= 100){
					  s = (int) (1.50 * strength);
					  System.out.println("            "  + name  + " hit with a SPECIAL attack.");
					  System.out.println("            "  + name  + " dealt "  + s  + " damage!");
			
				  }else{
					  s = 0 * strength;
					  System.out.println("            "  + name  + " missed their SPECIAL attack.");
					  System.out.println("            "  + name  + " dealt "  + s  + " damage!");
				  }
			  }
			  return s;

		}//end of playerAttack function


		//function definition for enemyAttack character function
		int enemyAttack(){
			System.out.println(" ");
			int s = 0;//value for emitted damage
			int min1 = 0, min2 = 0;
			int max1 = 100, max2 = 100;
			int rand_a = (int)Math.floor(Math.random()*(max1-min1+1)+min1); //random value used to decide what type of attack
			int rand_m = (int)Math.floor(Math.random()*(max2-min2+1)+min2); //random value used to decide miss rate
		
			System.out.println("               __[~ Enemey Attacks ~]__\n");
			//enemy attack value based upon random selection of (60% chance of) 'light' attack
			//and 10% miss rate
			if(rand_a >= 41 && rand_a <= 100){
				if(rand_m >= 11 && rand_m <= 100){
					s = (int) (0.75 * strength);
					System.out.println("            " + name + " hit with a light attack. ");
					System.out.println("            " + name + " dealt " + s + " damage!");
			
				}else{
					s = 0 * strength;
					System.out.println("            " + name + " missed their attempt of a light attack. ");
					System.out.println("            " + name + " dealt " + s + " damage!");
				}
		
			//enemy attack value based upon random selection of (30% chance of) 'heavy' attack
			//and 15% miss rate
			}else if(rand_a >= 11 && rand_a <= 40){
				if(rand_m >= 16 && rand_m <= 100){
					s = (int) (1.00 * strength);
					System.out.println("            " + name + " hit with a heavy attack. ");
					System.out.println("            " + name + " dealt " + s + " damage!");
			
				}else{
					s = 0 * strength;
					System.out.println("            " + name + " missed their attempt of a heavy attack. ");
					System.out.println("            " + name + " dealt " + s + " damage!");
				}
		
			//enemy attack value based upon random selection of (10% chance of) 'special' attack
			//and 5% miss rate
			}else if(rand_a >= 1 && rand_a <= 10){
				if(rand_m >= 6 && rand_m <= 100){
					s = (int) (1.25 * strength);
					System.out.println("            " + name + " hit with a SPECIAL attack. ");
					System.out.println("            " + name + " dealt " + s + " damage!");
			
				}else{
					s = 0 * strength;
					System.out.println("            " + name + " missed their attempt of a heavy attack. ");
					System.out.println("            " + name + " dealt " + s + " damage!");
				}
			}
			return s;

		}//end of enemyAttack function


		//function definition for takeDamage character function
		void takeDamage(int n) {
			int damage;
				
			if(n-defense <=0)
				damage = 0;
			else
				damage = n-defense;
				System.out.println("            " + name + " took " + damage + " damage");
				health -= damage;

		}//end of takeDamage function

		
	}//end of character class
	
	
	//main function
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//allows for random generation of random numbers
		Random rand = new Random(); //instance of random class
				
		//array for enemy drop items
		String rewards[] = {"VITALITY", "UNBROKEN", "TENACITY", "VELOCITY"};
				
			//variables used for the game
		int direction;
		int room = 1;
		int map_choice;
		boolean is_playerAlive = false;
		boolean is_bossDead = false;
		String user_n;
				
		//displays welcome screen
		welcomeScreen();
				
		//allows player to enter to continue
		System.out.println(" ");
		System.out.print("                  ");
		System.out.println("Press Enter To Continue...");
		new java.util.Scanner(System.in).nextLine();
		        
		//receives player input for their name choice  8 characters for efficient displaying purposes
		Scanner sc = new Scanner(System.in);
		System.out.println("\n      Please enter your characters's name: (8 characters long)");
		System.out.print("      ");
		user_n = sc.nextLine();
		System.out.print("\n");
		    	
		//displays both introductory cutscenes for enhancement of player's understanding (context)
		playerIntro_cutscene();
		System.out.println(" ");
		System.out.print("                  ");
		System.out.println("Press Enter To Continue...");
		new java.util.Scanner(System.in).nextLine();
		playerCircumstance_cutscene(user_n);
		System.out.println(" ");
		System.out.print("                  ");
		System.out.println("Press Enter To Continue...");  //system("PAUSE") java equivalent
		new java.util.Scanner(System.in).nextLine();
		        
		        
		//creates the titan classed character the player will being using
		int startingHealth = 650; 
		int startingStrength = 125;
		int startingDefense = 64;
		int startingSpeed = 50;  
		Character titan = new Character(user_n, startingHealth, startingStrength, startingDefense, startingSpeed);
				
		    	
		map(0);
		//provides initial information to the player
		System.out.println("\n   Rooms are indicated by the number upper left of a room border.");
		System.out.println("                    Player is currently in room 0,");

		    	
		//obtains player's initial advancement to the first room before starting game
		//provides statements for any illogical move made
		do{
			System.out.println("              Enter a room number you would like to go: ");
			direction = sc.nextInt();
			    		
			if(direction == 0){
				System.out.println("                     You are already in that room.");
				map(0);
			}else if(direction > 1){
				System.out.println("                         You CANNOT skip rooms.");
				map(0);
			}
		    		
		}while(direction != 1);
		    	
		//clears the screen, and displays an updated map of where the player is (along with room number)
		System.out.println("                     You have now entered room 1.");
		map(direction);

		while(true) {
		    	//max and min of the user's character stats
	    		int maxH = titan.getHealth() + 10;
	    		int minH = titan.getHealth();
	    		int maxS = titan.getStrength() + 10;
	    		int minS = titan.getStrength();
	    		int maxD = titan.getDefense() + 10;
	    		int minD = titan.getDefense();
	    		int maxSP = titan.getSpeed() + 5;
	    		int minSP = titan.getSpeed() - 5;

	    		//difference of high and (low +1) + low
		    	int rand_h = (int)Math.floor(Math.random()*(maxH - (minH+1)) + minH);      //range (from player starting health)             to   (10 more than player starting health)
	    		int rand_s = (int)Math.floor(Math.random()*(maxS - (minS+1)) + minS);      //range (from player starting strength)           to   (10 more than player starting strength)
	    		int rand_d = (int)Math.floor(Math.random()*(maxD - (minD+1)) + minD);      //range (from player starting defense)            to   (10 more than player starting defense)
	    		int rand_sp = (int)Math.floor(Math.random()*(maxSP - (minSP+1)) + minSP);  //range (from 5 less than player starting speed)  to   (5 more than player starting speed)

		    	
	        	//obtains player choice of whether or not they would like to advance on the map
	    		System.out.println("\n        Would you like to advance, or visit a previous room? (1/2) ");
	    		System.out.println("                    (1 = advance  |  2 = revisit)");
	    		map_choice = sc.nextInt();
		
		    	//allows player to visually and physically advance to another room
		    	if(map_choice == 1){
		
		    	//only obtains a logical player input, provides statements for any illogical move made
		    	do{
		    		System.out.println("                Enter a room number you would like to go: ");
		    		direction = sc.nextInt();
		
			    	if(direction == room){
			    		System.out.println("                     You are already in that room.");
			    		map(room);
			    	}else if(direction > room+1){
			    		System.out.println("                        You CANNOT skip rooms.");
			    		map(room);
			    	}
		    	}while(direction != room+1);
		    	//increases room number to keep track of player advancements
		    	room+=1;
		
		    	//clears the screen, and displays an updated map of where the player is (along with room number)
		    	System.out.println("\n\n                     You have now entered room " + room);
		    	map(direction);
		    	
		    	System.out.print("\n                ");
		    	System.out.println("Press Enter To Continue...");  //system("PAUSE") java equivalent
		        new java.util.Scanner(System.in).nextLine();
		    	
		    	
		        //----------------------------------------------------------------------------------------------------------------------------------battle mechanism-------------------------------------------------------------//

		        if(room == 3 || room == 5 || room == 7 || room == 9 || room == 11){
		
			        //displays cutscene for enemy dependent on the room
			        cutscene(room);
		
			        //pauses so that the player can retain all the information
			        System.out.print("                ");
			        System.out.println("Press Enter To Continue...");  //system("PAUSE") java equivalent
			        new java.util.Scanner(System.in).nextLine();
		
			        //creates the first enemy the player will face-of against
			        Character player2 = new Character("Akuma",rand_h, rand_s, rand_d, rand_sp);
		
			        //displays initial stats of character and enemy before engaging in battle
			        viewStat(titan, player2);
		
			        //declares variables utilized by player for enemy one
			        int stamina = 10;
			        int turn = 1;
		
			        //loops entire battle and enemy response mechanism until either health is depleated
			        while((titan.getHealth() > 0) && (player2.getHealth() > 0)){
				        int a_choice;
				             
				        //based on speed, if the player's speed is higher or if it is equal to enemy speed
				        //the player is prioritized and attacks first
				        if(titan.getSpeed() > player2.getSpeed() || titan.getSpeed() == player2.getSpeed()){
			
					        //displays who attacks first based on speed
					        if(turn == 1){
					        	System.out.println("\n   ______________________________________________________");
					        	System.out.println("  | " + titan.getName() + "'s speed was higher, " + titan.getName() + " attacks first. |");
					        	System.out.println("   ------------------------------------------------------");
					        }
				
				
					        //pauses so that the player can retain all the information
					        System.out.println(" ");
					        System.out.print("                ");
					        System.out.println("Press Enter To Continue...");  //system("PAUSE") java equivalent
					        new java.util.Scanner(System.in).nextLine();
				
				
					        //player's attack mechanism
					        do{
						        //displays player's options for attacking
						        System.out.print("\n\n");
						        System.out.println("          _Turn: " + turn + "_____________________________ ");
						        System.out.println("       __|                                     |__");
						        System.out.println("      |  What course of action would you like? :  |");
						        System.out.println("      |          Light    attack  (1)             |");
						        System.out.println("      |          Heavy    attack  (2)             |");
						        System.out.println("      |          Special  attack  (3)             |");
						             
						        //displays player options for attacking
						        if(stamina >= 0){
							        if(stamina >= 10){
							        	System.out.println("      |          __________________               | ");
							        	System.out.println("      |         |Player Stamina: " + stamina + "|              | ");
							        	System.out.println("      |__       |__________________|            __| ");
							        }else if(stamina < 10){
							        	System.out.println("      |          __________________               | ");
							        	System.out.println("      |         |Player Stamina: " + stamina + " |              | ");
							        	System.out.println("      |__       |__________________|            __| ");
							        }
							        System.out.println("        |_______________________________________| ");
					
						        }else if(stamina < 0){
						        	System.out.println("      |         _____________________             | ");
						        	System.out.println("      |         |Player Stamina: 0  |             | ");
						        	System.out.println("      |__       _____________________           __| ");
						        	System.out.println("        |_______________________________________|   ");
						        }
				
						        //obtain player's battle choice
						        do{
						        	System.out.println("\n         Please select your choice (1 / 2 / 3): ");
						        	System.out.print("         ");
						        	a_choice = sc.nextInt();
						        }while(a_choice != 1 && a_choice != 2  && a_choice != 3);
						             
							    //protocol, if player attempts to use more stamina that he/ she has
							    if((stamina -= staminaDecrease(a_choice)) < 0){
							    	System.out.println(" ___________________________________________________________   ");
							    	System.out.println("| Sorry your choice exhausted all of your stamina reserves, |  ");
							    	System.out.println("| therefore your attack wasn't fully executed.              |  ");
							    	System.out.println("|___________________________________________________________|  ");
									break;
							    }else if(stamina == 0){
							    	break;
							    }
					             
					        }while((stamina - staminaDecrease(a_choice)) < 0);
				
					        //once out of stamina the player misses a turn & enemy attacks
					              //player while they are vulnerable & displays it
					        if(stamina == 0 || stamina < 0){
						        //SetConsoleTextAttribute(color, 12);
					        	System.out.println("\n                You are out of Stamina!           ");
					        	System.out.println("              You cannot attack for one turn.       ");
					        	System.out.println("         Within this turn the enemy attacks while.. ");
					        	System.out.println("                your stamina will regernates.       ");
						        //SetConsoleTextAttribute(color, 11);
					
						        //SetConsoleTextAttribute(color, 5);
						        titan.takeDamage(player2.enemyAttack());
						        viewBattleStats(titan, player2);
						        //SetConsoleTextAttribute(color, 11);
						        stamina = 10;
						        turn++;
				
				
					        //enemy takes player damage, then player takes enemy damage
					        //& displays each action as it happens
					        }else if(stamina > 0){
						        //SetConsoleTextAttribute(color, 9);
						        player2.takeDamage(titan.playerAttack(a_choice));
						        viewBattleStats(titan, player2);
						        //SetConsoleTextAttribute(color, 11);
					
						        System.out.print("\n          o-----------------------------------o\n");
					
						        //SetConsoleTextAttribute(color, 5);
						        titan.takeDamage(player2.enemyAttack());
						        viewBattleStats(titan, player2);
						        //SetConsoleTextAttribute(color, 11);
					             
					        }
				             
				             
				        //based on speed, if enemy speed is higher they attack first
				        }else if(player2.getSpeed() > titan.getSpeed()){
			
					        //displays who attacks first based on speed
					        if(turn == 1){
						        System.out.println("\n    ________________________________________________");
						        System.out.println("   | " + player2.getName() + "'s speed was higher, " + player2.getName() + " attacks first. | ");
						        System.out.println("    ------------------------------------------------");
					
						        //initial enemy attack, since faster
						        //SetConsoleTextAttribute(color, 5);
						        titan.takeDamage(player2.enemyAttack());
						        viewBattleStats(titan, player2);
						        //SetConsoleTextAttribute(color, 11);
						             
					        }
				
				
					        //pauses so that player can retain all the information
					        System.out.println(" ");
					        System.out.print("                ");
					        System.out.println("Press Enter To Continue...");  //system("PAUSE") java equivalent
					        new java.util.Scanner(System.in).nextLine();
				
				
					              //player's attack mechanism
					              do{
								      //displays player's options for attacking
								      System.out.print("\n\n");
								      System.out.println("          _Turn: " + turn + "_____________________________ ");
								      System.out.println("       __|                                     |__");
								      System.out.println("      |  What course of action would you like? :  |");
								      System.out.println("      |          Light    attack  (1)             |");
								      System.out.println("      |          Heavy    attack  (2)             |");
								      System.out.println("      |          Special  attack  (3)             |");
								             
								      //displays player options for attacking
								      if(stamina >= 0){
									      if(stamina >= 10){
									    	  System.out.println("      |          __________________               | ");
									    	  System.out.println("      |         |Player Stamina: " + stamina + "|              | ");
									    	  System.out.println("      |__       |__________________|            __| ");
									      }else if(stamina < 10){
									    	  System.out.println("      |          __________________               | ");
									    	  System.out.println("      |         |Player Stamina: " + stamina + " |              | ");
									    	  System.out.println("      |__       |__________________|            __| ");
									      }
									      System.out.println("        |_______________________________________| ");
									      
								      }else if(stamina < 0){
								    	  System.out.println("      |         _____________________             | ");
								    	  System.out.println("      |         |Player Stamina: 0  |             | ");
								    	  System.out.println("      |__       _____________________           __| ");
								    	  System.out.println("        |_______________________________________| ");
								      }
						             
						              //obtain player's battle choice
						              do{
						            	  System.out.println("\n         Please select your choice (1 / 2 / 3): ");
						            	  a_choice = sc.nextInt();
						              }while(a_choice != 1 && a_choice != 2 && a_choice != 3);
						             
						              //protocol, if player attempts to use more stamina that he/ she has
						              if((stamina -= staminaDecrease(a_choice)) < 0){
						            	  System.out.println(" ___________________________________________________________   ");
						            	  System.out.println("| Sorry your choice exhausted all of your stamina reserves, |  ");
						            	  System.out.println("| therefore your attack wasn't fully executed.              |  ");
						            	  System.out.println("|___________________________________________________________|  ");
							              break;
						              }else if(stamina == 0){
						            	  break;
						              }
					             
					              }while((stamina - staminaDecrease(a_choice)) < 0);
					             
					              //once out of stamina the player misses a turn & enemy attacks
					              // player while they are vulnerable & displays it
					        if(stamina == 0 || stamina < 0){
						        //SetConsoleTextAttribute(color, 12);
					        	System.out.println("\n                You are out of Stamina!           ");
					        	System.out.println("              You cannot attack for one turn.       ");
					        	System.out.println("         Within this turn the enemy attacks while.. ");
					        	System.out.println("                your stamina will regernates.       ");
						        //SetConsoleTextAttribute(color, 11);
					
						        //SetConsoleTextAttribute(color, 5);
						        titan.takeDamage(player2.enemyAttack());
						        viewBattleStats(titan, player2);
						        //SetConsoleTextAttribute(color, 11);
						        stamina = 10;
						        turn++;
				
				
					        //enemy takes player damage, then player takes enemy damage
					        //& displays each action as it happens
					        }else if(stamina > 0){
						        //SetConsoleTextAttribute(color, 9);
						        player2.takeDamage(titan.playerAttack(a_choice));
						        viewBattleStats(titan, player2);
						        //SetConsoleTextAttribute(color, 11);
					
						        System.out.print("\n          o-----------------------------------o\n");
					
						        //SetConsoleTextAttribute(color, 5);
						        titan.takeDamage(player2.enemyAttack());
						        viewBattleStats(titan, player2);
						        //SetConsoleTextAttribute(color, 11);
				
					        }
				             
				        }
				        turn += 1; //increases (sets equal to) +1 turn
		
			        }//end of while loop for player & enemyhealth
		
			        //uses the player's health to decide whether they are alive or not
			        if(titan.getHealth() > 0){
			        	is_playerAlive = true;
			        }else if(titan.getHealth() <= 0){
			        	is_playerAlive = false;
			        	System.out.println("\n\n                     You lose!");
			        	break;
			        }
		
			        if(is_playerAlive == true && room == 11 && player2.getHealth() <= 0){
			        	is_bossDead = true;
			        	break;
			        }
		
			        //displays message along with stats after the battle is won
			        if(is_playerAlive == true){
				        
			        	int maxI = 5, minI = 0;
			        	int rand_item = (int)Math.floor(Math.random()*(maxI - (minI+1)) + minI);
				        System.out.print("\n\n");
				        System.out.println("O------------------------------------------------------O");
				        System.out.println("|               " + titan.getName() + " WON THE BATTLE!               |");
				        System.out.println("| After being demolished, the enemy dropped an item... |");            
				        System.out.println("|          " + titan.getName() + " found: Charm of " + rewards[rand_item] + "!          |");
				        System.out.println("O------------------------------------------------------O");
			
				        //SetConsoleTextAttribute(color, 14);
				        if(rewards[rand_item] == "VITALITY"){
				        	System.out.println("     Charm of Vitality grants the player (+5 health)");
					        titan.setHealth(startingHealth);
					        System.out.print("     " + titan.getHealth() + " HP +5  ");
					        titan.setHealth(startingHealth+=5);
				        
				        }else if(rewards[rand_item] == "UNBROKEN"){
				        	System.out.println("     Charm of Unbroken grants the player (+5 defense)");
				        	System.out.print("     " + titan.getDefense() + " DEF +5  ");
					        titan.setDefense(startingDefense+=5);
				        
				        }else if(rewards[rand_item] == "TENACITY"){
				        	System.out.println("     Charm of Tenacity grants the player (+5 strength)");
				        	System.out.print("     " + titan.getStrength() + " STR +5  ");
					        titan.setStrength(startingStrength+=5);
				        
				        }else if(rewards[rand_item] == "VELOCITY"){
				        	System.out.println("     Charm of Velocity grants the player (+5 speed)");
				        	System.out.print("     " + titan.getSpeed() + " SPE +5  ");
					        titan.setSpeed(startingSpeed+=5);
					        
				        }
				        //SetConsoleTextAttribute(color, 11);
			
				        //pauses so that player can retain all the information
				        System.out.print("\n                  ");
				        System.out.println("Press Enter To Continue...");  //system("PAUSE") java equivalent
				        new java.util.Scanner(System.in).nextLine();
			
				        //restores player health dependent on reward, & displays all other power-ups
				        if(rewards[rand_item] == "VITALITY"){
				        	viewPowerUp(titan, 10, titan.getHealth());
				        }else if(rewards[rand_item] != "VITALITY"){
				        	viewPowerUp(titan, 10, startingHealth);
				        }
			
				        //pauses so that player can retain all the information
				        System.out.print("\n                  ");
				        System.out.println("Press Enter To Continue...");  //system("PAUSE") java equivalent
				        new java.util.Scanner(System.in).nextLine();
				        
				        //sets all the player's character stats to +10
				        if(rewards[rand_item] != "VITALITY"){
				        	titan.setHealth(startingHealth);
				        }
			
				        //holds a value for +10 of the player's previous stats (for setting them in process below)
				        int healthPowerUp = titan.getHealth() + 10;
				        int strengthPowerUp = titan.getStrength() + 10;
				        int defensePowerUp = titan.getDefense() + 10;
				        int speedPowerUp = titan.getSpeed() + 10;
			
				        //increases all the player stats by 10 when they 'level up'
				        titan.setHealth(healthPowerUp);
				        titan.setStrength(strengthPowerUp);
				        titan.setDefense(defensePowerUp);
				        titan.setSpeed(speedPowerUp);
			
				        //just checks to make sure all the powerup stuff works
				        viewLevelUp(titan);
			
				        //re-print player location
				        System.out.print("\n                  ");
				        System.out.println("Press Enter To Continue...");  //system("PAUSE") java equivalent
				        new java.util.Scanner(System.in).nextLine();
				        map(room);
		
			        }//end of increasing stats sequence


		        //displays a message telling the player that the room was empty
		        }else if(room == 1 || room == 2 || room == 4 || room == 6 || room == 8 || room == 10){
		        	System.out.println("     ___________________________________________________________   ");
		        	System.out.println("    |  The room you have entered feels as if nothing had been   |  ");
		        	System.out.println("    |  there in a while.. and is infact empty yet there is a    |  ");
		        	System.out.println("    |  erie feeling to what may lay ahead in the upcoming rooms |  ");
		        	System.out.println("    |___________________________________________________________|  ");
		        }

		        
		        //allows player to visually and physically revisit another room
		    	}else if(map_choice == 2){

			        //only obtains a logical player input, provides statements for any illogical move made
			        do{
			        	System.out.println("            Enter a room number you would like to revisit: ");
			        	direction = sc.nextInt();
			
				        if(direction == room && room == 0){
				        	System.out.println("\n\n    You cannot revisit a previous room, this is where you started.");
					        break;
				        }else if(direction == room){
				        	System.out.println("\n\n                     You are already in that room.");
					        map(room);
				        }else if(direction >= room+1){
				        	System.out.println("\n\n    You CANNOT skip rooms, or advance you chose to revisit a room.");
					        map(room);
				        }
			
			        }while(direction != room-1);
			        
			        //decreases room number to keep track of player's room number as they revisit
			        if(room != 0){
			        	room-=1;
			        }
			
			        //clears the screen, and displays an updated map of where the player is (along with room number)
			        System.out.print("\n                  ");
			        System.out.println("Press Enter To Continue...");  //system("PAUSE") java equivalent
			        new java.util.Scanner(System.in).nextLine();
			        System.out.println("\n\n                     You have now entered room " + room);
			        map(direction);
		    	}

		}//end of while true loop
		    	

		//displays appropriate message based on if the player won or lost
		if(is_playerAlive == false && titan.getHealth() <= 0){
			System.out.print("\n                  ");
			System.out.println("Press Enter To Continue...");  //system("PAUSE") java equivalent
			new java.util.Scanner(System.in).nextLine();
			gameLosingCutscene();

		}else if(is_playerAlive == true && is_bossDead == true ){
			System.out.print("\n                  ");
			System.out.println("Press Enter To Continue...");  //system("PAUSE") java equivalent
			new java.util.Scanner(System.in).nextLine();
			finalBossDefeated_cutscene();
			System.out.println(" ");
			System.out.print("\n                  ");
			System.out.println("Press Enter To Continue...");  //system("PAUSE") java equivalent
			new java.util.Scanner(System.in).nextLine();
			gameWinningCutscene();
		}
		//closes the system scanner since there is no other required user input
		sc.close();
		    	
	}//end of main

	
	
	
	
	
	
	
	
	
	

	//displays welcome screen
	static void welcomeScreen(){

	//welcome display for RPG-game
	  System.out.print("           +==========================================+");
	  System.out.print("\n            |                                        |");
	  System.out.print("\n            |  |/|______________________________|/|  |");
	  System.out.print("\n            |   |        W E L C O M E         |     |");
	  System.out.print("\n            |   |____T_O__M_Y___R_P_G___O_F____|     |");
	  System.out.print("\n            |  |/|                              |/|  |");
	  System.out.print("\n            |__                                    __|");
	  System.out.print("\n               |  ------------------------------  |   ");
	  System.out.print("\n               |  |    A  L  F  H  E  I  M     |  |   ");
	  System.out.print("\n              _|  ------------------------------  |__");
	  System.out.print("\n             |__                                   __|");
	  System.out.print("\n              __|     By your student: Aaron N.   |__ ");
	  System.out.print("\n             |__    __    __    __    __    __    ___|");
	  System.out.print("\n                |__|  |__|  |__|  |__|  |__|  |__|\n\n");
	  System.out.print("\n\n");

	}



	//definition for playerIntro cutscene
	static void playerIntro_cutscene(){
		System.out.println("         ________________Introduction__________________");
		System.out.println("         | __________________________________________ |");
		System.out.println("         | | In the distant past there once had a   | |");
		System.out.println("         | | a kingdom named Alfheim. In this       | |");
		System.out.println("         | | kingdom there were three classes of    | |");
		System.out.println("         | | warriors: titans, hunters, and         | |");
		System.out.println("         | | warlocks. Of them all, the titan were  | |");
		System.out.println("         | |     !     the sworn protectors of the  | |");
		System.out.println("         | |    .-.    people and royal family due  | |");
		System.out.println("         | |  __|=|__  to their sheer skill and     | |");
		System.out.println("         | | (_/`-`|_)  bravery. In this game, you  | |");
		System.out.println("         | | //|___/||   will play as a titan faced | |");
		System.out.println("         | | <>/   |<>  with a duty that will test  | |");
		System.out.println("         | |  ||_._|/   his/her ability to live     | |");
		System.out.println("         | |   <_I_>   their lives as a sacrifice   | |");
		System.out.println("         | |    |||_   for the sake of others.      | |");
		System.out.println("         | |   /_|__|            . . .              | |");
		System.out.println("         | |________________________________________| |");
		System.out.println("         |____________________________________________|");
	}



	//definition for playerCircumstance cutscene
	static void playerCircumstance_cutscene(String n){

		System.out.println("___________________________________________________________________");
		System.out.println("|                                                                 |");
		System.out.println("|                             |>>>                                |");
		System.out.println("|                             |                                   |");
		System.out.println("|               |>>>      _  _|_  _         |>>>                  |");
		System.out.println("|               |        |;| |;| |;|        |                     |");
		System.out.println("|            _  _|_  _    \\.    .  /    _  _|_  _                 |");
		System.out.println("|           |;|_|;|_|;|    \\:. ,  /    |;|_|;|_|;|                |");
		System.out.println("|           \\..      /    ||;   . |    \\.    .  /                 |");
		System.out.println("|            \\.  ,  /     ||:  .  |     \\:  .  /                  |");
		System.out.println("|            ||:   |_   _ ||_ . _ | _   _||:   |                  |");
		System.out.println("|            ||:  .|||_|;|_|;|_|;|_|;|_|;||:.  |                  |");
		System.out.println("|            ||:   ||.    .     .      . ||:  .|                  |");
		System.out.println("|            ||: . || .     . .   .  ,   ||:   |       /,/        |");
		System.out.println("|            ||:   ||:  ,  _______   .   ||: , |            /`/   |");
		System.out.println("|            ||:   || .   /+++++++|    . ||:   |                  |");
		System.out.println("|            ||:   ||.    |+++++++| .    ||: . |                  |");
		System.out.println("|         __ ||: . ||: ,  |+++++++|.  . _||_   |                  |");
		System.out.println("|____--`~    '--~~__|.    |+++++__|----~    ~`---,              __|");
		System.out.println("|-~--~                   ~---__|,--~'                  ~~----_____|");
		System.out.println("|_________________________________________________________________|");
		System.out.println("| The titan, " + n + " is sent by the king to fight off a series   |");
		System.out.println("| enemies housed inside of an abandoned castle. The titan must run|");
		System.out.println("| through the many rooms defeating the species of beasts called   |");
		System.out.println("| akuma. The fate of the entirety of the towns-people as well as  |");
		System.out.println("| the royal family depends on the success of the titan. With this |");
		System.out.println("| weight resting upon his/hers shoulders the titan walks in...    |");
		System.out.println("|_________________________________________________________________|");
	}



	//definition for enemy cutscene function
	static void cutscene(int r){
		if(r == 3){
				System.out.println("         |--------------------------------------|");
				System.out.println("         | In the room you entered you feel as  |");
				System.out.println("         | if you are not alone, you soon notice|");
				System.out.println("         |    that within the deepest darkest   |");
				System.out.println("         |      corner of the room that...      |");
				System.out.println("         |        AN ENEMY HAS APPEARED!        |");
				System.out.println("         |______________________________________|");
				System.out.println("         |                                      |");
				System.out.println("         |     _.===._       ,'^^^^',           |");
				System.out.println("         |    /_| ^^^/|    /  ^ ,^  |      ,    |");
				System.out.println("         |    (0| ^ /0)|  / ^  /  ^  |    /|    |");  
				System.out.println("         |     |     /  ^^   ^ | ^ |  ',.'' /   |");
				System.out.println("         |      )   (  ^  ^   ^ |   |    ,'     |");
				System.out.println("         |      (o_o)^    | ^   ,)  /`^^`       |");
				System.out.println("         |       ^V^| ^ |  |_,-''((((           |");
				System.out.println("         |       /  /`''/  /                    |");
				System.out.println("         |      (((`   '(((                     |");
				System.out.println("         |______________________________________|");
	
		}else if(r == 5){
				System.out.println("         |--------------------------------------|");
				System.out.println("         | In the room you entered you feel a   |");
				System.out.println("         | familiar feeling that, something else|");
				System.out.println("         | lurks around you. Then to the corner |");
				System.out.println("         |      of your eye you see that...     |");
				System.out.println("         |        AN ENEMY HAS APPEARED!        |");
				System.out.println("         |______________________________________|");
				System.out.println("         |                                      |");
				System.out.println("         |                    #|`-'-'/          |");
				System.out.println("         |                    #/   o (o         |");
				System.out.println("         |                   #/ |__   '._       |");
				System.out.println("         |   ,_#_#          #/  /=/`-. _')      |");
				System.out.println("         |    '-.`|#       #/  /=(_.. `-`.      |");
				System.out.println("         |       | `|#    #/  -.'`_|||`_|||     |");
				System.out.println("         |        ;  |#  #/ '.__.'=|_.'         |");
				System.out.println("         |        |   '-#;    _|====|_          |");
				System.out.println("         |        ;      '  /`  `|==| |         |");
				System.out.println("         |         |     .        |=| /         |");
				System.out.println("         |          '-.._         // /__        |");
				System.out.println("         |               `)-.    `----._|       |");
				System.out.println("         |               <_______|_|_|_|        |");
				System.out.println("         |______________________________________|");
	
		}else if(r == 7){
				System.out.println("         |--------------------------------------|");
				System.out.println("         | In the room you entered you feel a   |");
				System.out.println("         |     familiar feeling again, that     |");
				System.out.println("         | the room isn't empty and it was only |");
				System.out.println("         |a matter of time until you see that...|");
				System.out.println("         |        AN ENEMY HAS APPEARED!        |");
				System.out.println("         |______________________________________|");
				System.out.println("         |                                /|    |");
				System.out.println("         |                               //     |");
				System.out.println("         |          .==.        .==.    //      |");
				System.out.println("         |         //`^\\      //^`\\    //       |");
				System.out.println("         |        // ^ ^|(|__/)/^ ^^| //        |");
				System.out.println("         |       //^ ^^ ^/6  6| ^^ ^ //|        |");
				System.out.println("         |      //^ ^^ ^/( .. )|^ _ // ||       |");
				System.out.println("         |     // ^^ ^/|| v''v |/@@@) ^||       |");
				System.out.println("         |    // ^^/|/ /  `~~`   @'/|^ ^||      |");
				System.out.println("         |    \\^ /  _/  /IIII. |_/  |^ //       |");
				System.out.println("         |     ||/  /(  (IIIIII/  |   |//       |");
				System.out.println("         |      ^  /  |  |IIII'    |   ^        |");
				System.out.println("         |         |  ((((`II'     /            |");
				System.out.println("         |       .--'  /|_____/|  `--.          |");
				System.out.println("         |      ((((--'         '--))))         |");
				System.out.println("         |______________________________________|");
	
		}else if(r == 9){
				System.out.println("         |----------------------------------------|");
				System.out.println("         |  In the room you entered you feel the  |");
				System.out.println("         |      same feeling as before, that      |");
				System.out.println("         |  you are not alone, and at this point  |");
				System.out.println("         | you already know that an enemy is near |");
				System.out.println("         |       ...AN ENEMY HAS APPEARED!        |");
				System.out.println("         |________________________________________|");
				System.out.println("         |                                        |");
				System.out.println("         |     _____,    _..-=-=-=-=-====--,      |");
				System.out.println("         |   _.'a   /  .-',___,..=--=--==-'`      |");
				System.out.println("         |  ( _     | /  //___/-=---=----'        |");
				System.out.println("         |   ` `|    /  //---/--==----=-'         |");
				System.out.println("         | ,-.    | / v_//-_.'==-==---='          |");
				System.out.println("         (.-.`v  | |'../-'=-=-=-=--'              |");
				System.out.println("         |(' `v`v| //_|-|.`;-~````~,        _     |");
				System.out.println("         |      | | |_,_,_|.'        |     .'_`|  |");
				System.out.println("         |       `|            ,    , |    || `|| |");
				System.out.println("         |         |/   /   _.-- |    |'._.' / || |");
				System.out.println("         |         /  /`---'   | |   |`'---'   V/ |");
				System.out.println("         |        / /'          | ;-. |           |");
				System.out.println("         |     __/ /           __) | ) `|         |");
				System.out.println("         |   ((='--;)         (,___/(,_/          |");
				System.out.println("         |________________________________________|");
	
		}else if(r == 11){
				System.out.println("         |--------------------------------------|");
				System.out.println("         |  Here at last, you have reached the  |");
				System.out.println("         |  the last room in the castle, behind |");
				System.out.println("         | these doors exists the mighty beast  |");
				System.out.println("         | that rules all others. With its death|");
				System.out.println("         | the kindom, and its royal family can |");
				System.out.println("         |  rest peacefully. But it isn't that  |");
				System.out.println("         |   simple as this will prove to be a  |");
				System.out.println("         | battle of might and bravery, will you|");
				System.out.println("         |  have what it takes to slay what none|");
				System.out.println("         | has ever even faced before...        |");
				System.out.println("         | ONLY TIME WILL TELL, GOOD LUCK TITAN!|");
				System.out.println("         |______________________________________|");
				System.out.println("         ,                                      ,  ");
				System.out.println("        ||                                      /|  ");
				System.out.println("         \'._ ,                           ,  _.'/   ,  ");
				System.out.println("      ||  {'. '-`|,      ,-._**_.-,      ,/`-' .'}  /|  ");
				System.out.println("       |`'-'-.  '.`|      |*____*/      /`.'  .-'-'`/  ");
				System.out.println("     ,'-'-._  '.  ) )     /`    `|     ( (  .'  _.-'-',  ");
				System.out.println("     ||'- _ '.   , /     /  /--|  |     | ,  .'  _ -'/|  ");
				System.out.println("      |'-.   .  ; (      |_|^  ^|_/      ) ;   .  .-'/  ");
				System.out.println("       `'--, . ;  {`-.     |___/      .-'}  ; . ,--'`  ");
				System.out.println("       '--`_. ;  { ^  |    _|  |_    /  ^ }  ; ._`--'  ");
				System.out.println("       `,_.--  ;  { ^  `-'`      `'-`  ^ }  ;  --._,`  ");
				System.out.println("         ,_.-    ; {^    /        |    ^} ;    -._,  ");
				System.out.println("          ,_.-`), /|{^,/||_'_/|_'_//|,^}/| ,(`-._,  ");
				System.out.println("            _.'.-` /.'   |        /   `.| `-.'._  ");
				System.out.println("           `  _.' `       |      /       ` '._   `  ");
				System.out.println("                         .-'.  .'-.  ");
				System.out.println("                       .'    `` ^  '.  ");
				System.out.println("                       /  ^ ^   ^  ^ |  ");
				System.out.println("                      | ^    ^   ^   |  ");
				System.out.println("                     /^   ^/    |  ^  |  ");
				System.out.println("                     |,_^_/    ^ |_,^|  ");
				System.out.println("                      /=/  |^   /  |=|  ");
				System.out.println("                  __ /=/_   | ^|   _|=| __  ");
				System.out.println("                <(=,'=(==,) |  | (,==)=',=)>  ");
				System.out.println("                  /_/|_|    /  |    /_||_|  ");
				System.out.println("                  `V (=|  .'    '.  |=) V`  ");
				System.out.println("                      V  / _/  |_ |  V  ");
				System.out.println("                        `'` |  / `'`  ");
				System.out.println("                             |(  ");
	
			}

	}//end of cutscene displays function

	//definition for map display function
	static void map(int D){
		if(D == 0){
			System.out.println("                     _          _ATLAS_          _ ");
			System.out.println("                    |_|-------------------------|_|");
			System.out.println("                      | _______________________ |");
			System.out.println("                      | |                     | |");
			System.out.println("                      | |  |7--|6--|4--|5--|  | |");
			System.out.println("                      | |  |               |  | |");
			System.out.println("                      | |  |9--|8 -|2 -|3--|  | |");
			System.out.println("                      | |  |       |       |  | |");
			System.out.println("                      | |  |10 |11-|1 -|0--|  | |");
			System.out.println("                      | |  |       |     H |  | |");
			System.out.println("                      | |  |---|---|---|---|  | |");
			System.out.println("                     _| |_____________________| |_ ");
			System.out.println("                    |_|-------------------------|_|");
	
		}else if(D == 1){
			System.out.println("                     _          _ATLAS_          _ ");
			System.out.println("                    |_|-------------------------|_|");
			System.out.println("                      | _______________________ |");
			System.out.println("                      | |                     | |");
			System.out.println("                      | |  |7--|6--|4--|5--|  | |");
			System.out.println("                      | |  |               |  | |");
			System.out.println("                      | |  |9--|8 -|2 -|3--|  | |");
			System.out.println("                      | |  |       |       |  | |");
			System.out.println("                      | |  |10 |11-|1 -|0--|  | |");
			System.out.println("                      | |  |       | H     |  | |");
			System.out.println("                      | |  |---|---|---|---|  | |");
			System.out.println("                     _| |_____________________| |_");
			System.out.println("                    |_|-------------------------|_|");
	
		}else if(D == 2){
			System.out.println("                     _          _ATLAS_          _ ");
			System.out.println("                    |_|-------------------------|_|");
			System.out.println("                      | _______________________ |");
			System.out.println("                      | |                     | |");
			System.out.println("                      | |  |7--|6--|4--|5--|  | |");
			System.out.println("                      | |  |               |  | |");
			System.out.println("                      | |  |9--|8 -|2 -|3--|  | |");
			System.out.println("                      | |  |       | H     |  | |");
			System.out.println("                      | |  |10 |11-|1 -|0--|  | |");
			System.out.println("                      | |  |       |       |  | |");
			System.out.println("                      | |  |---|---|---|---|  | |");
			System.out.println("                     _| |_____________________| |_ ");
			System.out.println("                    |_|-------------------------|_|");
	
		}else if(D == 3){
			System.out.println("                     _          _ATLAS_          _ ");
			System.out.println("                    |_|-------------------------|_|");
			System.out.println("                      | _______________________ |");
			System.out.println("                      | |                     | |");
			System.out.println("                      | |  |7--|6--|4--|5--|  | |");
			System.out.println("                      | |  |               |  | |");
			System.out.println("                      | |  |9--|8 -|2 -|3--|  | |");
			System.out.println("                      | |  |       |     H |  | |");
			System.out.println("                      | |  |10 |11-|1 -|0--|  | |");
			System.out.println("                      | |  |       |       |  | |");
			System.out.println("                      | |  |---|---|---|---|  | |");
			System.out.println("                     _| |_____________________| |_ ");
			System.out.println("                    |_|-------------------------|_|");
	
		}else if(D == 4){
			System.out.println("                     _          _ATLAS_          _ ");
			System.out.println("                    |_|-------------------------|_|");
			System.out.println("                      | _______________________ |");
			System.out.println("                      | |                     | |");
			System.out.println("                      | |  |7--|6--|4--|5--|  | |");
			System.out.println("                      | |  |         H     |  | |");
			System.out.println("                      | |  |9--|8 -|2 -|3--|  | |");
			System.out.println("                      | |  |       |       |  | |");
			System.out.println("                      | |  |10 |11-|1 -|0--|  | |");
			System.out.println("                      | |  |       |       |  | |");
			System.out.println("                      | |  |---|---|---|---|  | |");
			System.out.println("                     _| |_____________________| |_ ");
			System.out.println("                    |_|-------------------------|_|");
	
		}else if(D == 5){
			System.out.println("                     _          _ATLAS_          _ ");
			System.out.println("                    |_|-------------------------|_|");
			System.out.println("                      | _______________________ |");
			System.out.println("                      | |                     | |");
			System.out.println("                      | |  |7--|6--|4--|5--|  | |");
			System.out.println("                      | |  |             H |  | |");
			System.out.println("                      | |  |9--|8 -|2 -|3--|  | |");
			System.out.println("                      | |  |       |       |  | |");
			System.out.println("                      | |  |10 |11-|1 -|0--|  | |");
			System.out.println("                      | |  |       |       |  | |");
			System.out.println("                      | |  |---|---|---|---|  | |");
			System.out.println("                     _| |_____________________| |_ ");
			System.out.println("                    |_|-------------------------|_|");
	
		}else if(D == 6){
			System.out.println("                     _          _ATLAS_          _ ");
			System.out.println("                    |_|-------------------------|_|");
			System.out.println("                      | _______________________ |");
			System.out.println("                      | |                     | |");
			System.out.println("                      | |  |7--|6--|4--|5--|  | |");
			System.out.println("                      | |  |     H         |  | |");
			System.out.println("                      | |  |9--|8 -|2 -|3--|  | |");
			System.out.println("                      | |  |       |       |  | |");
			System.out.println("                      | |  |10 |11-|1 -|0--|  | |");
			System.out.println("                      | |  |       |       |  | |");
			System.out.println("                      | |  |---|---|---|---|  | |");
			System.out.println("                     _| |_____________________| |_ ");
			System.out.println("                    |_|-------------------------|_|");
	
		}else if(D == 7){
			System.out.println("                     _          _ATLAS_          _ ");
			System.out.println("                    |_|-------------------------|_|");
			System.out.println("                      | _______________________ |");
			System.out.println("                      | |                     | |");
			System.out.println("                      | |  |7--|6--|4--|5--|  | |");
			System.out.println("                      | |  | H             |  | |");
			System.out.println("                      | |  |9--|8 -|2 -|3--|  | |");
			System.out.println("                      | |  |       |       |  | |");
			System.out.println("                      | |  |10 |11-|1 -|0--|  | |");
			System.out.println("                      | |  |       |       |  | |");
			System.out.println("                      | |  |---|---|---|---|  | |");
			System.out.println("                     _| |_____________________| |_ ");
			System.out.println("                    |_|-------------------------|_|");
	
		}else if(D == 8){
			System.out.println("                     _          _ATLAS_          _ ");
			System.out.println("                    |_|-------------------------|_|");
			System.out.println("                      | _______________________ |");
			System.out.println("                      | |                     | |");
			System.out.println("                      | |  |7--|6--|4--|5--|  | |");
			System.out.println("                      | |  |               |  | |");
			System.out.println("                      | |  |9--|8 -|2 -|3--|  | |");
			System.out.println("                      | |  |     H |       |  | |");
			System.out.println("                      | |  |10 |11-|1 -|0--|  | |");
			System.out.println("                      | |  |       |       |  | |");
			System.out.println("                      | |  |---|---|---|---|  | |");
			System.out.println("                     _| |_____________________| |_ ");
			System.out.println("                    |_|-------------------------|_|");
	
		}else if(D == 9){
			System.out.println("                     _          _ATLAS_          _ ");
			System.out.println("                    |_|-------------------------|_|");
			System.out.println("                      | _______________________ |");
			System.out.println("                      | |                     | |");
			System.out.println("                      | |  |7--|6--|4--|5--|  | |");
			System.out.println("                      | |  |               |  | |");
			System.out.println("                      | |  |9--|8 -|2 -|3--|  | |");
			System.out.println("                      | |  | H     |       |  | |");
			System.out.println("                      | |  |10 |11-|1 -|0--|  | |");
			System.out.println("                      | |  |       |       |  | |");
			System.out.println("                      | |  |---|---|---|---|  | |");
			System.out.println("                     _| |_____________________| |_ ");
			System.out.println("                    |_|-------------------------|_|");
	
		}else if(D == 10){
			System.out.println("                     _          _ATLAS_          _ ");
			System.out.println("                    |_|-------------------------|_|");
			System.out.println("                      | _______________________ |");
			System.out.println("                      | |                     | |");
			System.out.println("                      | |  |7--|6--|4--|5--|  | |");
			System.out.println("                      | |  |               |  | |");
			System.out.println("                      | |  |9--|8 -|2 -|3--|  | |");
			System.out.println("                      | |  |       |       |  | |");
			System.out.println("                      | |  |10 |11-|1 -|0--|  | |");
			System.out.println("                      | |  | H     |       |  | |");
			System.out.println("                      | |  |---|---|---|---|  | |");
			System.out.println("                     _| |_____________________| |_ ");
			System.out.println("                    |_|-------------------------|_|");
	
		}else if(D == 11){
			System.out.println("                     _          _ATLAS_          _ ");
			System.out.println("                    |_|-------------------------|_|");
			System.out.println("                      | _______________________ |");
			System.out.println("                      | |                     | |");
			System.out.println("                      | |  |7--|6--|4--|5--|  | |");
			System.out.println("                      | |  |               |  | |");
			System.out.println("                      | |  |9--|8 -|2 -|3--|  | |");
			System.out.println("                      | |  |       |       |  | |");
			System.out.println("                      | |  |10 |11-|1 -|0--|  | |");
			System.out.println("                      | |  |     H |       |  | |");
			System.out.println("                      | |  |---|---|---|---|  | |");
			System.out.println("                     _| |_____________________| |_ ");
			System.out.println("                    |_|-------------------------|_|");
			}
	}//end of map method


	//function definition for viewStat
	static void viewStat(Character a, Character b){
		System.out.println(" ");
		System.out.println("      _____________________________________________ ");
		System.out.println("     |                                            |");
		System.out.println("     |   ___________PRE-BATTLE_STATS___________   |");
		System.out.println("     |   |                                    |   |");
		System.out.println("     |   |  " + a.getName() + "         " + b.getName() + "            |   |");
		System.out.println("     |   |  " + "Health: " + a.getHealth() + "      " + "Health: " + b.getHealth() + "      |   |");
		System.out.println("     |   |  " + "Strength: " + a.getStrength() + "    " + "Strength: " + b.getStrength() + "    |   |");
		System.out.println("     |   |  " + "Defense: " + a.getDefense() + "      " + "Defense: " + b.getDefense() + "      |   |");
		System.out.println("     |   |  " + "Speed: " + a.getSpeed() + "        " + "Speed: " + b.getSpeed() + "        |   |");
		System.out.println("     |   -------------------------------------    |");
		System.out.println("     |____________________________________________|");
	}//end of viewStat method



	//function definition for viewPowerUp
	static void viewPowerUp(Character a, int n, int h){
		//HANDLE color=GetStdHandle(STD_OUTPUT_HANDLE);
			System.out.println(" ");
			System.out.println("      _____________________________________________ ");
			System.out.println("     |                                            |");
			System.out.println("     |    ______POST-BATTLE -> RECOVERY______     |");
			System.out.println("     |   |                                   |    |");
			System.out.println("     |   |  " + a.getName() + "         " + a.getName() + "        |    |");
			System.out.print("     |   |  " + "Health: " + a.getHealth() + "      ");
			a.setHealth(h);
			System.out.println("Health: " + a.getHealth() + "     |    |");
			System.out.println("     |   |  " + "Strength: " + a.getStrength() + "    " + "Strength: " + a.getStrength() + "   |    |");
			System.out.println("     |   |  " + "Defense: " + a.getDefense() + "      " + "Defense: " + a.getDefense() + "     |    |");
			System.out.println("     |   |  " + "Speed: " + a.getSpeed() + "        " + "Speed: " + a.getSpeed() + "       |    |");
			System.out.println("     |   -------------------------------------    |");
			System.out.println("     |____________________________________________|");
			System.out.println(" ");
			//SetConsoleTextAttribute(color, 10);
			System.out.println("      ____________________________________________");
			System.out.println("     |                                            |");
			System.out.println("     |    _________!!!YOU_LEVEL_UP!!!_________    |");
			System.out.println("     |    |                                  |    |");
			System.out.println("     |    |       " + a.getName() + "                   |    |");
			System.out.println("     |    |       " + "Health: " + a.getHealth() + "    + " + n + "        |    |");
			System.out.println("     |    |       " + "Strength: " + a.getStrength() + "  + " + n + "        |    |");
			System.out.println("     |    |       " + "Defense: " + a.getDefense() + "    + " + n + "        |    |");
			System.out.println("     |    |       " + "Speed: " + a.getSpeed() + "      + " + n + "        |    |");
			System.out.println("     |    ------------------------------------    |");
			System.out.println("     |____________________________________________|");
			//SetConsoleTextAttribute(color, 11);
	}//end of viewPowerUp method


	//function definition for viewLevelUp
	static void viewLevelUp(Character a) {
		System.out.println(" ");
		System.out.println("      ____________________________________________ ");
		System.out.println("     |                                            |");
		System.out.println("     |    ___________CURRENT__STATS___________    |");
		System.out.println("     |    |                                  |    |");
		System.out.println("     |    |       " + a.getName() + "                   |    |");
		System.out.println("     |    |       " + "Health: " + a.getHealth() + "                |    |");
		System.out.println("     |    |       " + "Strength: " + a.getStrength() + "              |    |");
		System.out.println("     |    |       " + "Defense: " + a.getDefense() + "                |    |");
		System.out.println("     |    |       " + "Speed: " + a.getSpeed() + "                  |    |");
		System.out.println("     |    ------------------------------------    |");
		System.out.println("     |____________________________________________|");
		System.out.println(" ");
	}
	

	//definition for finalBossDefeated cutscene
	static void finalBossDefeated_cutscene(){
		System.out.println("__________________________________________________________________");
		System.out.println("|                                O                               |");
		System.out.println("| And so it was with the      ,-.|____________________           |");
		System.out.println("| use of determination and  O==+-|(>-------- --  -     .>        |");
		System.out.println("| absolute perseverence    `   - |'''''''d88b'''''''''           |");
		System.out.println("| that the brave titan had     | O     d8P 88b                   |");
		System.out.println("| managed to pull of the feat  |  |    88= ,=88                  |");
		System.out.println("| that no other warrior has    |   )   9b _. 88b                 |");
		System.out.println("| done before him/her. By the   `._ `.   8`--'888                |");
		System.out.println("| the end of the battle, a       |    |--'|   `-8___             |");
		System.out.println("| strong, bloody, yet joyous     |`-.               |            |");
		System.out.println("| warrior celebrated a victory     `. | -       _ / <            |");
		System.out.println("| well deserved. For it was all      | `---   ___/|_-|           |");
		System.out.println("| due to their actions that the      | ._      _. |_-|           |");
		System.out.println("| town-people and the royal family    |  _     _  /.-|           |");
		System.out.println("| is now safe and sound at last.       | -! . !- ||   |          |");
		System.out.println("| The beast species 'Akuma' is no more | '| ! |' /|   |          |");
		System.out.println("| and wont be able to do any harm from  =oO)X(Oo=  |  /          |");
		System.out.println("| now till kingdom come. It was on      888888888   < |          |");
		System.out.println("| that day, that a simple warrior      d888888888b  |_/          |");
		System.out.println("| had become a LEGEND...               88888888888               |");
		System.out.println("|_____________________________________8888888888888______________|");
	}//end of finalBossDefeated_cutscene method



	//function definition for gameWinningCutscene
	static void gameWinningCutscene(){
		System.out.println("-------------------------------------------------------------------");
		System.out.println("  /|                                                               ");
		System.out.println("  ||                                      ~CONGRADULATIONS~        ");
		System.out.println("  ||                               You have successfully beaten all");
		System.out.println("  ||                               the enemies that have posed a   ");
		System.out.println("  ||           {}                  threat to the kingdom. Throughout");
		System.out.println("  ||          .--.                 this journey you and your character");
		System.out.println("  ||         /.--.|                the 'titan' have grown both in skill");
		System.out.println("  ||         |====|                and strength. Although not perfect");
		System.out.println("  ||         |`::`|                a lot of effort, time, and energy has");
		System.out.println(" _||_    .-;`|..../`;-.-^-.-       went into this project in hopes of");
		System.out.println("  /\\   /  |...::..|`   :   `|     making a game that is truly enjoyable");
		System.out.println("  |:'| |   /'''::''|   .:.   |     and one that stands out from the rest.");
		System.out.println("   | /|;-,/|   ::  |..:::::..|     With that said, thank you for playing");
		System.out.println("    | <` >  >.-::-.| ':::::' |     and thank you for your time warrior!");
		System.out.println("     `--`  /   ^^  |   ':'   |                                          ");
		System.out.println("           |       |    :    /                                          ");
		System.out.println("           |        |   :   /      Created by:                          ");
		System.out.println("           |___/|___|`-.:.-`            Your Student & Game Connoisseur ");
		System.out.println("            |_ || -/    `               Aaron R. Nandlal,               ");
		System.out.println("            <_ >< _>                                                    ");
		System.out.println("            |  ||  |                                                    ");
		System.out.println("            |  ||  |                                                    ");
		System.out.println("           _ |:||:./_                                                  ");
		System.out.println("          /____/|____|                                                  ");
		System.out.println("----------------------------------------------------------------------");
	}//end of gameWinningCutscene method



	//function definition for gameLosingCutscene
	static void gameLosingCutscene(){
		System.out.println("----------------------------------------------------------------------");
		System.out.println("                                                                      ");
		System.out.println("               {}                                                     ");
		System.out.println("              .--.                                                    ");
		System.out.println("             /.--.|                   __ ~SORRY BUT YOU LOST~ __      ");
		System.out.println("             |====|                                                   ");
		System.out.println("             |`::`|                 It appears that at some point     ");
		System.out.println("         .-;/ ..../`;_.-^-._        during a fearsome battle the      ");
		System.out.println("  /\\   /  |...::..|`   :   `|       young and brave warrior that     ");
		System.out.println("  |:'  |   /'''::''|   .:.   |      is yourself has indeed fallen.    ");
		System.out.println(" @|  / ;-,/    ::  |..:::::..|      Though it may be embaressing to   ");
		System.out.println(" `||  <` >  >._::_.| ':::::' |      fall so soon, it is not the end   ");
		System.out.println("  || `--`  |   ^^  |   ':'   |      of the world. Please replay the   ");
		System.out.println("  ||       |       |    :    /      the game once you have fully      ");
		System.out.println("  ||       |        |   :   /       replenished your stats and are    ");  
		System.out.println("  ||       |___/|___|`-.:.-`        ready to be immersed in the world ");
		System.out.println("  ||        |_ || _/    `           of Alfheim, untill next time      ");
		System.out.println("  ||        <_ >< _>                warrior!                          ");
		System.out.println("  ||        |  ||  |                                                  ");
		System.out.println("  ||        |  ||  |                                                  ");
		System.out.println("  ||       _ |:||:./_                                                 ");
		System.out.println("          /____/|____|                                                ");
		System.out.println("----------------------------------------------------------------------");
	}//end of gameLosingCutscene method



	//function definition for staminaDecrease
	static int staminaDecrease(int c){
		int subtract = 0;
	
		//takes a string value and identifies value to subtract
		if(c == 1){
			subtract = 1;
		}else if(c == 2){
			subtract = 2;
		}else if(c == 3){
			subtract = 5;
		}
		return subtract;
	}//end of staminaDecrease method



	//function definition for viewBattleStats
	static void viewBattleStats(Character a, Character b){
		System.out.println(" ");
		 
		if(a.getHealth() >= 100 || a.getHealth() <= -10){
			System.out.println("            " + a.getName() + "        |     " + b.getName());
		}else if(a.getHealth() < 100){
			System.out.println("            " + a.getName() + "       |     " + b.getName());
		}
		 
		System.out.println("            " + "Health: " + a.getHealth() + "     |     " + "Health: " + b.getHealth());
	}//end of viewBattleStats function

	
	
}//end of overarching class




