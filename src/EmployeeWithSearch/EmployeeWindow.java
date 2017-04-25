/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeWithSearch;

/**
 *
 * @author zzschmid
 */

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class EmployeeWindow extends Application {
  
  private Button btOk;
  private Button btSearch;
  private TextField tfName;
  private TextField tfPhone;
  private EmployeeManager mgr;
  
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a border pane 
    BorderPane bPane = new BorderPane();
    bPane.setBottom(this.getHBox());
    bPane.setCenter(this.getGPane());
    Scene scene = new Scene(bPane);
    mgr = new EmployeeManager();
    primaryStage.setTitle("Employee Window"); // Set the stage title
    primaryStage.setResizable(false);
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  private HBox getHBox() {
    HBox hBox = new HBox(15); 
    hBox.setPadding(new Insets(15, 15, 15, 15));
    //hBox.setStyle("-fx-background-color: blue");
    btOk = new Button("OK");
    
    hBox.getChildren().add(btOk);
    btSearch = new Button("SEARCH");
    btSearch.setOnAction(e->{
        SearchWindow wd = new SearchWindow();
        wd.setMgr(mgr);
        wd.start(new Stage());  
        //System.out.println("search activated");
        tfName.setText(wd.getEmp().getName());
        tfPhone.setText(wd.getEmp().getPhone());
    });
    hBox.getChildren().add(btSearch);
    hBox.setAlignment(Pos.CENTER);
    return hBox;
    
  }
  private GridPane getGPane() {
     
    GridPane gPane = new GridPane();
    gPane.setAlignment(Pos.CENTER);
    gPane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
    gPane.setHgap(5.5);
    gPane.setVgap(5.5);
    
    // Place nodes in the pane in column,row order
    gPane.add(new Label("Name:"), 0, 0);
    tfName = new TextField();
    gPane.add(tfName, 1, 0);        
    gPane.add(new Label("Phone"), 0, 1); 
    tfPhone = new TextField();
    gPane.add(tfPhone, 1, 1);
    return gPane;
  }
  
  
  
   public static void main(String[] args) {
    launch(args);
  }
} 

