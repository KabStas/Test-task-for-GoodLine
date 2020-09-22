import java.util.*;

public class Task_4_v2_KabenyukS{

    static Scanner in = new Scanner(System.in);

    
	public static void main (String [] args) {

        System.out.println("\nTask 4. Is it ip-address?");
		
		System.out.print("\nPlease enter the string:  ");
		String input = in.next();
		String digitsAndDot = "0123456789.";
		int [] arrayOfNumbers = new int [4];
		int countOfDots = 0;
		int countOfCorrectChars = 0;
		int countOfNumbers = 0;
		char dot = '.';
		char zero = '0';
		String newString = "";
		int number = -1;
		int i,j = 0;
		
		if (input.length() < 7 && input.length() > 15) { //checking for the quantity of chars in string
			
			System.out.println("NO");
			System.out.println("\nThe program is over");
			System.exit(0);
		}
		
		for (i = 0; i < input.length(); i++) {     //checking for correct chars in string
			
			for (j = 0; j < digitsAndDot.length(); j++) {
				
				if (input.charAt(i) == digitsAndDot.charAt(j)) {
					
					countOfCorrectChars++;
				}
			}
		}
		
		if (countOfCorrectChars != input.length()) { //
			
			System.out.println("NO");
			System.out.println("\nThe program is over");
			System.exit(0);
		}
		
		
		if (input.charAt(0) == dot || input.charAt(input.length() - 1) == dot) { //checking for correctly placed dots
			
			System.out.println("NO");
			System.out.println("\nThe program is over");
			System.exit(0);
			
		}
		
		for (i = 0; i < input.length() - 1; i++) { 
		
			if (input.charAt(i) == dot && input.charAt(i + 1) == dot) {
				
				System.out.println("NO");
				System.out.println("\nThe program is over");
				System.exit(0);
			}
		}
		
		for (i = 0; i < input.length() - 1; i++) {                  //checking for extra zeroes, f.e. 00.000.000.0
		
			if (input.charAt(i) == zero && input.charAt(i + 1) == zero) {
				
				System.out.println("NO");
				System.out.println("\nThe program is over");
				System.exit(0);
			}
		}
		
		for (i = 0; i < input.length(); i++) {	//checking for correct numbers in string and quantity of numbers and dots 
			
			if (input.charAt(i) == dot ) {
				
				countOfDots++;
				countOfNumbers++;
				number = Integer.parseInt(newString);
				newString = "";
				
				if (number < 0 || number > 255) {
					
					System.out.println("NO");
					System.out.println("\nThe program is over");
					System.exit(0);
				}
				number = -1;
				continue;
			}
			newString += input.charAt(i);
			if (i == input.length() - 1) {
				
				countOfNumbers++;
				number = Integer.parseInt(newString);
				if (number < 0 || number > 255 || countOfDots > 3 || countOfNumbers > 4) {
					
					System.out.println("NO");
					System.out.println("\nThe program is over");
					System.exit(0);
					
				} else {
					System.out.println("YES");
				}
			}
			
		}
		
		System.out.println("\n\nThe program is over");
	}
}