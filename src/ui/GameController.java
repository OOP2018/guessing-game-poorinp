package ui;
import src.NumberGame;
import src.PoorinGame;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * Handle the events that come from the users.
 * @author Poorin Pichayamongkol
 */
public class GameController {
	
	NumberGame game = new PoorinGame(100);
	@FXML
	Label botmessage;
	@FXML
	TextField textf;
	
	private Counter counter;
	
	/**
	 * When the users enter the textfield then pressed ENTER it will execute the Game.
	 * Then let the Game calculate that the input is correct or not.
	 * @param event occur when users enter number in textfield and pressed ENTER 
	 */
	@FXML
	public void handleGuess(ActionEvent event) {
		String text = textf.getText().trim();
		int value = 0;
		value = Integer.parseInt(text);
		System.out.println(""+text);
		botmessage.setText(" ");
		textf.setText(" ");
		try {
			boolean end = game.guess(value);
			if (!end ) {
				game.guess(value);
				botmessage.setText(game.getMessage());
				counter.add(1);
				return ;
			}
			else {
				botmessage.setText(game.getMessage());
				counter.add(1);
				textf.setVisible(false);
			} 
		}catch (Exception e) {
			textf.setText("enter the number only");
		}
	}
	
	/**
	 * Set the counter that use to count the number of times that users guess.
	 * @param counter from Counter that can count the number of times that users guessed.
	 */
	public void setCounter(Counter counter) {
		this.counter = counter;
	}
	
}
