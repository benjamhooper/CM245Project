package Lab06;

/**
 * @author Benjamin Hooper
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.geometry.Insets;

public class Matrix extends Application {
	@Override
	public void start(Stage primaryStage) {
		GridPane pane = new GridPane();
		pane.setPadding(new Insets(5, 5, 5, 5));
		pane.setHgap(5);
		pane.setVgap(5);
                
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				TextField text = new TextField();
				text.setPrefColumnCount(1);
				text.setText(String.valueOf((int)(Math.random() * 2)));
				pane.add(text, i, j);
				pane.setHalignment(text, HPos.CENTER);
				pane.setValignment(text, VPos.CENTER);
			}
		}
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Number Matrix");
		primaryStage.setScene(scene);
		primaryStage.show();
                primaryStage.setResizable(false);
        }
    public static void main(String[] args) {
        launch(args);
    }
 }