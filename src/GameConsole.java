import java.util.Scanner;

public class GameConsole {
	
	/**
	 * The play method plays a game using input from a user.
	 * @param game is class that method play() run on
	 * @return number that is the secret number
	 */
	public int play( NumberGame game ) {
		Scanner console = new Scanner(System.in);
		System.out.println( game.toString() );
		System.out.println( game.getMessage() );
		boolean check = true ;
		int number = 0 ;
		while ( check ) {
			System.out.print("Your answer? ");
			int guess = console.nextInt();
			number = guess ;
			if ( game.guess(number) == true ) {
				System.out.println( game.getMessage() );
				break ;
			}
			System.out.println( game.getMessage() );
		}
		return number ;
	}
}
