package ui;
import application.NumberGame;
import application.PoorinGame;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class GameController {
	
	NumberGame game = new PoorinGame(100);
	@FXML
	Label botmessage;
	@FXML
	TextField textf;
	
	private Counter counter;
	
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
	
	public void setCounter(Counter counter) {
		this.counter = counter;
	}
	
}
