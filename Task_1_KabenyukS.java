import java.util.Scanner;

public class Task_1_KabenyukS{

    static Scanner in = new Scanner(System.in);

    
	public static void main (String [] args) {

        System.out.println("\nTask 1. Yasha in the swimming pool.");
		
		System.out.print("\nPlease enter the length of pool - ");
		int length = in.nextInt();
		
		System.out.print("Please enter the width of pool -  ");
		int width = in.nextInt();
		
		int distanceToLongSide1;
		int distanceToShortSide1;
		int distanceToLongSide2;
		int distanceToShortSide2;
		
		do {
			System.out.print("Please enter the distance from long side of the pool - ");
			distanceToLongSide1 = in.nextInt();
		}
		while (distanceToLongSide1 <= 0 || distanceToLongSide1 >= width);
		
		do {	
			System.out.print("Please enter the distance from short side of the pool - ");
			distanceToShortSide1 = in.nextInt();
		}
		while (distanceToShortSide1 <= 0 || distanceToShortSide1 >= length);
		
		distanceToLongSide2 = width - distanceToLongSide1;
		distanceToShortSide2 = length - distanceToShortSide1;
		//System.out.println(distanceToLongSide1 + " + " + distanceToLongSide2 + " = " + width);
		//System.out.println(distanceToShortSide1 + " + " + distanceToShortSide2 + " = " + length);
		
		int choice = Math.min (Math.min(distanceToLongSide1, distanceToLongSide2), 
			Math.min(distanceToShortSide1, distanceToShortSide2));
			
		System.out.println("\nThe way to the closest side is " + choice);	
	
		System.out.println("\nThe program is over");
	}
}
	