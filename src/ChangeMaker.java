import java.util.Scanner;

public class ChangeMaker {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input US Coins: ");
		int originalAmount = input.nextInt();
		returnChange(originalAmount);
	
	}
			
		public static void returnChange(int originalAmount) {

		int quarters = originalAmount / 25; //gives you x amount of quarters
		originalAmount = originalAmount - (25*quarters); //redefining the original amount divided by quarters
		System.out.println("Number of quarter: " +quarters); //printing the number of quarters
		int dimes = originalAmount / 10; //taking the new original amount divided by dimes
		originalAmount = originalAmount - (10*dimes); //remaining original amount minus the dimes
		System.out.println("Number of dimes: " + dimes); // printing the number of dimes
		int nickels = originalAmount / 5; // reaming original amount divided by nickels
		originalAmount = originalAmount - (5*nickels); //original amount minus the nickels
		System.out.println("Number of nickles: " + nickels); // printing the number of nickels
		int pennies = originalAmount / 1; //remaining original amount divided by the pennies
		originalAmount = originalAmount - (1*pennies); //original amount minus the pennies
		System.out.println("Number of pennies: " +pennies); //printing the pennies
		
	}
}
