package GUI;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class EmployeeWindow extends Application {

    private TextField tfName;
    private TextField tfAge;
    private Button btOk;
    private Button btApply;
    private Button btCancel;

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a border pane 
        BorderPane basePane = new BorderPane();
        GridPane dataPane = new GridPane();
        dataPane.setAlignment(Pos.CENTER);
        dataPane.setPadding(new Insets(5, 5, 5, 5));
        dataPane.setHgap(5);
        dataPane.setVgap(5);
        dataPane.add(new Label("Name:"), 0, 0);
        tfName = new TextField();
        dataPane.add(tfName, 1, 0);
        dataPane.add(new Label("Age:"), 0, 1);
        tfAge = new TextField();
        dataPane.add(tfAge, 1, 1);
        dataPane.setStyle("-fx-border-color: black");
        basePane.setCenter(dataPane);

        FlowPane actionPane = new FlowPane();
        actionPane.setPadding(new Insets(5, 5, 5, 5));
        actionPane.setHgap(5);
        actionPane.setVgap(5);
        actionPane.setStyle("-fx-border-color: red");
        btOk = new Button("OK");
        btApply = new Button("Apply");
        btCancel = new Button("Cancel");
        actionPane.setAlignment(Pos.CENTER);
        actionPane.getChildren().addAll(btOk, btApply, btCancel);
        basePane.setBottom(actionPane);

        // Create a scene and place it in the stage
        Scene mainScene = new Scene(basePane, 200, 100);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Employee Window"); // Set the stage title
        primaryStage.setScene(mainScene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    public static void main(String[] args) {
        launch(args);
    }

}
