import java.util.Random;
import java.util.Scanner;
public class GuesstheSecretNumber {

	public static void main(String[] args) {
		
		Random r = new Random();
		int x = 1 + r.nextInt(10);
		int UserGuess;
		String UserChoice = "";
		
		do{	
			System.out.println("Enter your number : ");
			Scanner guess = new Scanner(System.in);
			UserGuess = guess.nextInt();
				
				if(UserGuess > x){
					System.out.println("You guessed too high, try again? (Y/N)");
					Scanner choice = new Scanner(System.in);
					UserChoice = choice.nextLine();
					
				} else if(UserGuess < x){
					System.out.println("You guessed too low, try again? (Y/N)");
					Scanner choice = new Scanner(System.in);
				    UserChoice = choice.nextLine();
					
				} else System.out.println("Bingo!");
		}
		
		while(UserGuess != x || UserChoice == "Y");
	}

}
