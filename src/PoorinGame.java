import java.util.Random;

/**
 * Game of guessing a secret number.
 * @author Poorin Pichayamongkol
 */
public class PoorinGame extends NumberGame {
	/* properties of a guessing game	 */
	private int secret ;
	private int upperBound ;
	private int counter ;
	
	/**
	 * Initialize a new Game.
	 * @param upperbound is the max value for the secret number (>1).
	 */
	public PoorinGame( int upperbound ) {
		this.upperBound = upperbound ;
		counter = 0 ;
		long seed = System.nanoTime() ;
		Random rand = new Random( seed ) ;
		secret = rand.nextInt( upperBound ) ;
		super.setMessage( "I'm thinking of a number between 1 and " + this.upperBound + "." );
	}
	
	/**
     * Evaluate a user's answer to the game.
     * @param answer is the user's answer, as an integer.
     * @return true if correct, false otherwise
     */
	public boolean guess( int number ) {
		if ( number == secret ) {
			super.setMessage( "Right! The secret number is " + secret + "." );
			counter++ ;
			return true ;
		}
		else if ( number > secret ) {
			super.setMessage( "Sorry, too large." );
			counter++ ;
			return false ;
		}
		else if (number < secret ) {
			super.setMessage( "Sorry, too small." );
			counter++ ;
			return false ;
		}
		else {
			super.setMessage( "Sorry, that's over the upperbound." );
			counter++ ;
			return false ;
		}
	}
	
	/** 
	 * Get the largest possible value of the solution for this game. 
	 * For a guessing game, this should be the upper bound of secret.
	 * @return the upperBound value that is the maximum number in game.
	 */
	public int getUpperBound() {
		return this.upperBound ;
	}
	
	/**
     * toString describes the game or problem.
     * @return description of this game or the problem to be solved.
     */
	public String toString() {
		return "Guess a secret number between 1 and " + this.upperBound + ".";
	}
	
	/**
	 * getCount count the number of guessing by users
	 * @return the number that people guessed
	 */
	public int getCount() {
		return counter ;
	}
}
