/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplestages;

/**
 *
 * @author Cecil Schmidt
 */
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class EmployeeUpdateWindow extends Application {

    private TextField tfName = new TextField();
    private TextField tfAge = new TextField();
    private Button btUpdate = new Button("Update");
    private Employee emp;
    public EmployeeUpdateWindow(Employee emp) {
        //super();
        this.emp = emp;
    } 

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create UI
        GridPane gridPane = new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.add(new Label("Name:"), 0, 0);
        gridPane.add(tfName, 1, 0);
        gridPane.add(new Label("Age:"), 0, 1);
        gridPane.add(tfAge, 1, 1);
        gridPane.add(btUpdate, 1, 2);
        
        tfName.setText(emp.getName());
        tfAge.setText(String.format("%d",emp.getAge()));

        // Set properties for UI
        gridPane.setAlignment(Pos.CENTER);
        //tfName.setEditable(false);
        //tfAge.setEditable(false);
        GridPane.setHalignment(btUpdate, HPos.RIGHT);
        // Process events
        btUpdate.setOnAction(e -> update());

        // Create a scene and place it in the stage
        Scene scene = new Scene(gridPane, 400, 250);
        primaryStage.setTitle("Employee Update"); // Set title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    private void update() {
        try {
            int age = Integer.parseInt(tfAge.getText());
            String name = tfName.getText().trim();
            emp.setAge(age);
            emp.setName(name);
        } catch (IllegalArgumentException ex) {
            //do nothing
        }
    }
}
