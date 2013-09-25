import java.util.Random;
import java.util.Scanner;


public class GuessingGame {
	static Scanner in = new Scanner(System.in);
	
	public static int generateRandomInt() {
		// randomly generate integers between 0 and 50
		Random generator = new Random();
		int integer = generator.nextInt(10);
		return integer;
	}
	
	public static void main (String[] args){
                int number = generateRandomInt();
		while(true){
			System.out.println("Enter your guess: ");
			int guess = in.nextInt();	
			if(guess > number){
				System.out.println("Too high.");
			}
			else if(guess < number){
				System.out.println("Too low.");
			}
			else{
				System.out.println("You got it!");
				System.out.println("The number was " + number);
				break;
			}
		}
	}
}

