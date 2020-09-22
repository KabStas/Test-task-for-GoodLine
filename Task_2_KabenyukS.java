import java.util.Scanner;

public class Task_2_KabenyukS{

    static Scanner in = new Scanner(System.in);

    
	public static void main (String [] args) {

        System.out.println("\nTask 2. Biker Vasya.");
		
		
		int speed = 0;
		int time = 0;
		int distance = 0;
		int lengthOfRoad = 109;
		int quantityOfLaps = 0;
		int markOnRoad = 0;
		
		do {
			System.out.print("\nPlease enter the speed of biker - ");
			speed = in.nextInt();
		}
		while (speed < -1000 || speed > 1000);
		
		do {
			System.out.print("\nPlease enter the time of biker`s movement - ");
			time = in.nextInt();
		}
		while (time < 0 || time > 1000);
		
		distance = Math.abs(speed * time);
		quantityOfLaps = distance / lengthOfRoad;
		
		if (speed > 0) {
			
			markOnRoad = distance - quantityOfLaps * lengthOfRoad;	
		}
		else if (speed < 0) {
			
			markOnRoad = lengthOfRoad + quantityOfLaps * lengthOfRoad - distance;		
		}
		else {
			markOnRoad = 0;
		}
		
		System.out.println("\nThe mark on road is " + markOnRoad);	
	
		System.out.println("\nThe program is over");
	}
}
	