package ui;

import java.util.Observable;
import java.util.Observer;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * Create the UI for count the number that users guessed the number.
 * @author Poorin Pichayamongkol
 */
public class CounterView extends Stage implements Observer{

	private Counter counter;
	private Label label;
	
	/**
	 * Initialize the UI from Counter.
	 * @param counter that count the number of times that users guessed
	 */
	public CounterView(Counter counter) {
		this.counter = counter;
		initComponents();
	}
	
	/**
	 * Create the UI for Counter.
	 */
	public void initComponents() {
		HBox root = new HBox();
		root.setPadding(new Insets(10));
		root.setAlignment(Pos.CENTER);
		label = new Label("   ");
		label.setPrefWidth(144);
		label.setFont(new Font("Arial", 80.0));
		label.setAlignment(Pos.CENTER);
		root.getChildren().add(label);
		Scene scene = new Scene(root);
		this.setScene(scene);
		this.setTitle("Count");
		this.sizeToScene();
	}
	
	/**
	 * Update and display in UI window of Counter.
	 */
	@Override
	public void update(Observable arg0, Object arg1) {
		displayCount();		
	}
	
	/**
	 * Show the UI of Counter.
	 */
	public void run() {
		this.show();
		displayCount();
	}
	
	/**
	 * Display the number that users guessed.
	 */
	public void displayCount() {
		label.setText( String.format("%2d", counter.getCount()) );
	}

}
