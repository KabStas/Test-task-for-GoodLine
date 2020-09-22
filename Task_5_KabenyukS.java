import java.util.*;

public class Task_5_KabenyukS{

    static Scanner in = new Scanner(System.in);

    
	
	public static void main (String [] args) {

        System.out.println("\nTask 5. Equal numbers in arrays\n");
		
		
		System.out.print("Please enter the length of first array - ");
		int lengthOfFirstArray = in.nextInt();
		System.out.print("\nPlease enter the length of second array - ");
		int lengthOfSecondArray = in.nextInt();
		
		int [] firstArray = new int [lengthOfFirstArray];
		int [] secondArray = new int [lengthOfSecondArray];
		int countOfEqualValues = 0;
		int i,j,k = 0;
		
		System.out.println();
		
		for (i = 0; i < firstArray.length; i++) { 
		
			System.out.print("Please enter the element of first array - ");
			firstArray[i] = in.nextInt();
		}
		System.out.println();
		
		for (i = 0; i < secondArray.length; i++) { 
		
			System.out.print("Please enter the element of second array - ");
			secondArray[i] = in.nextInt();
		}
		
		for (i = 0; i < firstArray.length; i++) { 
		
			for (j = 0; j < secondArray.length; j++) {
				
				if (firstArray[i] == secondArray[j]) {
					
					countOfEqualValues++;
				}
			}
		}
		
		int [] arrayOfEqualValues = new int [countOfEqualValues];
		
		for (i = 0; i < firstArray.length; i++) { 
		
			for (j = 0; j < secondArray.length; j++) {
				
				if (firstArray[i] == secondArray[j]) {
					
					arrayOfEqualValues[k] = firstArray[i];
					k++;
				}
			}
		}
		
		Arrays.sort(arrayOfEqualValues);
		
		System.out.print(arrayOfEqualValues[0] + " ");
		
		for (i = 1; i < arrayOfEqualValues.length; i++) { 
		
			if (arrayOfEqualValues[i] != arrayOfEqualValues[i - 1]) {
				
				System.out.print(arrayOfEqualValues[i] + " ");
			}
		}	
	}
}