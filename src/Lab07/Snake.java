/**
 * @author Benjamin Hooper
 */

package Lab07;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Polyline;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Snake extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		BorderPane pane = new BorderPane();

		Polyline polyline = new Polyline(new Double(200.0), new Double(200.0));
		polyline.setStroke(Color.BLACK);
		pane.getChildren().add(polyline);
		ObservableList<Double> list = polyline.getPoints();
                
                BorderPane buttonPane = new BorderPane();
                buttonPane.setPrefSize(50,50);
                Button bleft = new Button("Left");
                BorderPane.setAlignment(bleft, Pos.CENTER);
                Button bright = new Button("Right");
                BorderPane.setAlignment(bright, Pos.CENTER);
                Button bup = new Button("UP");
                BorderPane.setAlignment(bup, Pos.CENTER);
                Button bdown = new Button("Down");
                BorderPane.setAlignment(bdown, Pos.CENTER);
                
                buttonPane.setTop(bup);
                buttonPane.setCenter(bdown);
                buttonPane.setLeft(bleft);
                buttonPane.setRight(bright);
                pane.setBottom(buttonPane);
                
                
		pane.setOnKeyPressed(e -> {
			double x = 0, y = 0;
			double length = 10;
			switch (e.getCode()) {
				case DOWN: x = list.get(list.size() - 2);
							  y = list.get(list.size() - 1) + length; break;
				case UP: x = list.get(list.size() - 2);
							y = list.get(list.size() - 1) - length; break;
				case RIGHT: x = list.get(list.size() - 2) + length;
							  y = list.get(list.size() - 1); break;
				case LEFT: x = list.get(list.size() - 2) - length;
							  y = list.get(list.size() - 1); break;
			}
			list.add(x);
			list.add(y); 
		});
                
                bup.setOnAction(e -> {
                       double x = 0, y = 0;
			double length = 10;{
			x = list.get(list.size() - 2);
			y = list.get(list.size() - 1) - length;
                        }
                        list.add(x);
                        list.add(y);
                });
                
                
                bdown.setOnAction(e -> {
                       double x = 0, y = 0;
			double length = 10;{
			x = list.get(list.size() - 2);
			y = list.get(list.size() - 1) + length;
                        }
                        list.add(x);
                        list.add(y);
                });
                
                
                bleft.setOnAction(e -> {
                       double x = 0, y = 0;
			double length = 10;{
			x = list.get(list.size() - 2) - length;
			y = list.get(list.size() - 1); 
                        }
                        list.add(x);
                        list.add(y);
                });
                
                
                bright.setOnAction(e -> {
                       double x = 0, y = 0;
			double length = 10;{
			x = list.get(list.size() - 2) + length;
			y = list.get(list.size() - 1); 
                        }
                        list.add(x);
                        list.add(y);
                });
		
                // Create a scene and place it in the stage
		Scene scene = new Scene(pane, 400, 400);
		primaryStage.setTitle("Snake"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
                primaryStage.setResizable(false);
		pane.requestFocus(); 
	}
        public static void main(String[] args) {
        launch(args);
    }
}
