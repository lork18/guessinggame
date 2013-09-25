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
		int triesCount = 0;
		while(true){
			System.out.println("Enter your guess: ");
			int guess = in.nextInt();	
			if(guess > number){
				System.out.println("Too high.");
				triesCount = triesCount + 1;
			}
			else if(guess < number){
				System.out.println("Too low.");
				triesCount = triesCount + 1;
			}
			else{
				triesCount = triesCount + 1;
				System.out.println("You got it!");
				System.out.println("The number was " + number);
				System.out.println("Number of tries: " + triesCount);
				break;
			}
		}
	}
}

