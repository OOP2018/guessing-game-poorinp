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

public class CounterView extends Stage implements Observer{

	private Counter counter;
	private Label label;
	
	public CounterView(Counter counter) {
		this.counter = counter;
		initComponents();
	}
	
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
	
	@Override
	public void update(Observable arg0, Object arg1) {
		displayCount();		
	}
	
	public void run() {
		this.show();
		displayCount();
	}
	
	public void displayCount() {
		label.setText( String.format("%2d", counter.getCount()) );
	}

}
