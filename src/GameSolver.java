import java.util.Random;

/**
 * Automatically find the secret to any NumberGame.
 */
public class GameSolver {
	/**
	 * Play a NumberGame and return the solution.
	 * The numberGame objects must provide messages (getMessage)
	 * containing the phrase "too small" if a guess is too small and "too large" if a guess is too large,
	 * for efficient solution.
	 * @param game is the NumberGame to solve
	 * @return the secret number
	 */
	public int play( NumberGame game ) {
		long seed = System.nanoTime() ;
		Random rand = new Random( seed ) ;
		int max = game.getUpperBound() ;
		int min = 1 ;
		int range = (max-min)+1;
		boolean check = true ;
		int number = rand.nextInt(range) + 1;
		while (check) {
			
			game.guess(number) ;
			if ( game.getMessage().contains("large")) {
				max = number - 1 ;
				number = rand.nextInt(range) + min ;
			}
			else if ( game.getMessage().contains("small")) {
				min = number + 1 ;
				number = rand.nextInt(range) + min ;
			}
			else {
				break ;
			}
		}
		return number ;
	}
}
