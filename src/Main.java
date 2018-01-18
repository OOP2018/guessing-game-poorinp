
public class Main {
	
	/** create objects and start the game */
	public static void main(String[] args) {
//		NumberGame game = new PoorinGame( 100 ) ;
//		GameConsole ui = new GameConsole() ;
//		int solution = ui.play(game) ;
//		System.out.println( "play() returned "+solution );
//		System.out.println( "You guesses "+game.getCount()+" times" );
		
		NumberGame game = new PoorinGame( 2 ) ;
		GameSolver ui = new GameSolver() ;
		int solution = ui.play(game) ;
		System.out.println( "play() returned "+solution );
		System.out.println( "You guesses "+game.getCount()+" times" );
	}
}
