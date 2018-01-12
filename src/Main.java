
public class Main {
	public static void main(String[] args) {
		NumberGame game = new PoorinGame( 100 ) ;
		GameConsole ui = new GameConsole() ;
		int solution = ui.play(game) ;
		System.out.println( "play() returned "+game.guess(solution) );
	}
}
