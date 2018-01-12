import java.util.Random;

/**
 * Game of guessing a secret number.
 * @author Poorin Pichayamongkol
 */
public class PoorinGame extends NumberGame {
	/* properties of a guessing game	 */
	private int secret ;
	private int upperBound ;
	
	/**
	 * Initialize a new Game.
	 * @param upperbound is the max value for the secret number (>1).
	 */
	public PoorinGame( int upperbound ) {
		this.upperBound = upperbound ;
		long seed = System.nanoTime() ;
		Random rand = new Random( seed ) ;
		secret = rand.nextInt( upperBound ) ;
		super.setMessage( "I'm thinking of a number between 1 and " + this.upperBound + "." );
	}
	
	public boolean guess( int number ) {
		if ( number == secret ) {
			super.setMessage( "Right! The secret number is " + secret + "." );
			return true ;
		}
		else if ( number > secret ) {
			super.setMessage( "Sorry, too large." );
			return false ;
		}
		else if (number < secret ) {
			super.setMessage( "Sorry, too small." );
			return false ;
		}
		else {
			super.setMessage( "Sorry, that's over the upperbound." );
			return false ;
		}
	}
	
	public int getUpperBound() {
		return this.upperBound ;
	}
	
	public String toString() {
		return "Guess a secret number between 1 and " + this.upperBound + ".";
	}
}
