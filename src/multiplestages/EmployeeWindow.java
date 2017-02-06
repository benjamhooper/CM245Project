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
import javafx.stage.Modality;
import javafx.stage.Stage;


public class EmployeeWindow extends Application {

    private TextField tfName = new TextField();
    private TextField tfAge = new TextField();
    private Button btUpdate = new Button("Update");
    private Button btNext = new Button("Next");
    private Button btPrevious = new Button("Previous");
    EmployeeManager mgrEmps = new EmployeeManager();
    Employee emp = null;
    int currentEmp = 0;

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
        gridPane.add(btUpdate, 2, 2);
        gridPane.add(btPrevious, 0, 2);
        gridPane.add(btNext, 1, 2);
        
        
        mgrEmps.load();
        currentEmp = 0;
        updateDisplay();
       
        // Set properties for UI
        gridPane.setAlignment(Pos.CENTER);
        tfName.setEditable(false);
        tfAge.setEditable(false);
        GridPane.setHalignment(btUpdate, HPos.RIGHT);
        // Process events
        btUpdate.setOnAction(e -> update());
        btNext.setOnAction(e -> next());
        btPrevious.setOnAction(e -> previous());
        // Create a scene and place it in the stage
        Scene scene = new Scene(gridPane, 400, 250);
        primaryStage.setTitle("Employee View"); // Set title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    private void update() {
        try {
            EmployeeUpdateWindow win = new EmployeeUpdateWindow(emp);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setOnCloseRequest(e -> updateDisplay());
            win.start(stage);
        } catch (IllegalArgumentException ex) {
            
        }
    }
    private void next() {
        currentEmp++;
        if (currentEmp >= mgrEmps.size()) {
            currentEmp = mgrEmps.size()  - 1;
        }
        updateDisplay();
        
    }
        private void previous() {
        if (currentEmp > 0) {
            currentEmp--;
        }
        updateDisplay();
        
    }
    private void updateDisplay() {
        emp = mgrEmps.get(currentEmp);
        tfName.setText(emp.getName());
        tfAge.setText(String.format("%d",emp.getAge()));
    }

    /**
     * The main method is only needed for the IDE with limited JavaFX support.
     * Not needed for running from the command line.
     */
    public static void main(String[] args) {
        launch(args);
    }
}
