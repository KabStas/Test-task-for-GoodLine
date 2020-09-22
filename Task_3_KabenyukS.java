import java.util.Scanner;

public class Task_3_KabenyukS{

    static Scanner in = new Scanner(System.in);

    
	public static void main (String [] args) {

        System.out.println("\nTask 3. Unique elements in array.");
		
		
		int lengthOfArray;
		int countOfEqualDigits = 0;
		int countOfUniqueValues = 0;
		int i,j = 0;
		int index = 0;
		
		do {
			System.out.print("\nPlease enter the length of array -  ");
			lengthOfArray = in.nextInt();
		}
		while (lengthOfArray <= 0);
		
		int [] array = new int [lengthOfArray];
		
		
		do {
			System.out.print("Please enter element of array - ");
			array[index] = in.nextInt();
			index++;
		}
		while (index < lengthOfArray);
		
		System.out.println("\nUnique elements are:");
		
		for (i = 0; i < array.length; i++) {

			countOfEqualDigits = 0;
			for (j = 0; j < array.length; j++) {
				
				if (array[i] == array[j]) {
					
					countOfEqualDigits++;
				}
			}
			if (countOfEqualDigits == 1) {
				
				countOfUniqueValues++;
				System.out.print(array[i] + " ");
			}
			
		}
		if (countOfUniqueValues == 0) {
			
			System.out.println("Error! Unique values not found!");
		}
		System.out.println("\n\nThe program is over");
	}
}
	