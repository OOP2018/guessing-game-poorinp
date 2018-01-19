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
		int max = game.getUpperBound() ;
		int min = 1 ;
		int number = 0 ;
		boolean check = true ;
		while (check) {
			int range = ((max-min)/2) + min ;
			number = (int) (Math.random()*range)+min ;
			game.guess(number) ;
			if ( game.getMessage().contains("large")) {
				max = number ;
				number = (int) (Math.random()*range)+min ;
			}
			else if ( game.getMessage().contains("small")) {
				min = number ;
				number = (int) (Math.random()*range)+min ;
			}
			else {
				break ;
			}
		}
		return number ;
	}
}
