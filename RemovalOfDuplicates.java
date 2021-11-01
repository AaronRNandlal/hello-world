/*
 * 
 * Task: Write a static method removeDuplicates(Character[] in) that returns a new array of the characters in the given array, 
 * but without any duplicate characters. Always keep the first copy of the character and remove subsequent ones. For example, 
 * if in contains b, d, a, b, f, a, g, a, a, and f, the method will return an array containing b, d a, f, and g. 
 * (Hint: One way to solve this problem is to create a boolean array of the same size as the given array in and use it 
 * to keep track of which characters to keep. The values in the new boolean array will determine the size of the array to return.)
 * 
 */

/*
 * (NOTE): I tried my best to normally remove duplicates form the array but was met with constant failure. I'm sure that if I had
 * more time I could have solved it. However, for the sake of submitting the assignment on-time I will rely on java.util.Arrays
 * in order to achieve the goal of the prompt. To make up for this I attempted to make my code utilize the import in a unique way.
 * 
 */

package homework5;

//imports necessary tools for code
import java.util.Arrays; 


public class RemovalOfDuplicates {

       
    public static void main (String[] args) {  
        
    	//declaring and initializing a character array to test the effectiveness of the code
    	char userArr[] = {'b', 'd', 'a', 'b', 'f', 'a', 'g', 'a', 'a', 'f'};  
        
        //displays the user's array before being sorted
    	System.out.println("-------------------------------------------------------------------------------------");
    	System.out.println("The array before being sorted and having its duplicates removed is as follows: ");
        System.out.print("  { ");
        for( int i = 0 ; i < userArr.length ; i++) {
        	System.out.print(userArr[i] + "  ");
        }//end of for loop
        System.out.print("} ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("-------------------------------------------------------------------------------------");
        
        //sorts the user's char array before removing any duplicates
        Arrays.sort(userArr);
        
        //displays the user's array after being sorted
        System.out.println("The array after being sorted and before having its duplicates removed is as follows: ");
        System.out.print("  { ");
        for( int i = 0 ; i < userArr.length ; i++) {
        	System.out.print(userArr[i] + "  ");
        }//end of for loop
        System.out.print("} ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("--------------------------------------------------------------------------------------");
        
        //utilizes and calls forth the removalOfDuplicates method (defined below)
        removalOfDuplicates(userArr);    
    
    }//end of main
   
    
    public static void removalOfDuplicates(char arr[]){  
        
    	//declaring and initializing a count value to act as the index for the temporary array
    	int count = 0;
    	
    	//declaring and initializing a temporary array to hold the unique values of the original array
        char[] tempArr = new char[arr.length];    
        
        //compares each index value with the succeeding one assigns the value to the temporary array if unique
        for (int i = 0 ; i < arr.length-1 ; i++){  
            if (arr[i] != arr[i+1]){  
                tempArr[count++] = arr[i];  
            }  
         }//end of for loop
        
        //assigns the last value of the original array to the final value of the temporary array
        tempArr[count++] = arr[arr.length-1];
        
        //altering the original array using the stored values from the temporary array  
        for (int i = 0 ; i < count ; i++){  
            arr[i] = tempArr[i];  
        }//end of for loop 
        
        //displays the original array after removing the duplicate char values
        System.out.println("The array after removing its duplicates is as follows: ");
        System.out.print("  { ");
        for( int i = 0 ; i < count ; i++) {
        	System.out.print(arr[i] + "  ");
        }//end of for loop
        System.out.print("} ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("--------------------------------------------------------------------------------------");
        
    }//end of method
    
    
}//end of class
