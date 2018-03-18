package ui;
	
import java.net.URL;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		Counter counter = new Counter();
		try {
			URL url = getClass().getResource("UI.fxml");
			if (url == null) {
				System.out.println("Couldn't find file: UI.fxml");
				Platform.exit();
			}
			FXMLLoader loader = new FXMLLoader(url);
			Parent root = loader.load();
			GameController controller = loader.getController();
			controller.setCounter(counter);
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.sizeToScene();
			stage.show();
		} catch(Exception e) {
			System.out.println("Exception creating scene: " + e.getMessage());
		}
		ConsoleView view = new ConsoleView(counter);
		counter.addObserver(view);
		CounterView view2 = new CounterView(counter);
		counter.addObserver(view2);
		view2.run();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
