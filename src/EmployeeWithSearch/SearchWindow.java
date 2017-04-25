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
import javafx.stage.Modality;
import javafx.stage.Stage;

public class SearchWindow extends Application {
  
  private Button btOk;
  private Button btSearch;
  private TextField tfName;
  private String name = "";
  private EmployeeManager mgr;
  private Employee emp;
  
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a border pane 
    BorderPane bPane = new BorderPane();
    bPane.setBottom(this.getHBox());
    bPane.setCenter(this.getGPane());
    Scene scene = new Scene(bPane);
    primaryStage.setTitle("Search Window"); // Set the stage title
    primaryStage.initModality(Modality.APPLICATION_MODAL);
    primaryStage.setResizable(false);
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.showAndWait(); // Display the stage
  }
  private HBox getHBox() {
    HBox hBox = new HBox(15); 
    hBox.setPadding(new Insets(15, 15, 15, 15));
    //hBox.setStyle("-fx-background-color: blue");
    btOk = new Button("OK");
    btOk.setOnAction(e -> {
        ((Node)(e.getSource())).getScene().getWindow().hide();
    });
    hBox.getChildren().add(btOk);
    btSearch = new Button("SEARCH");
    btSearch.setOnAction(e->{
        String sName = tfName.getText();
        emp = mgr.searchByName(sName);
        if (emp != null) {
            tfName.setText("Employee Found");
        } else {
            tfName.setText("Employee not found");
        }
        //System.out.println("search activated");
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
    tfName.setText(mgr.get(0).getName());
    gPane.add(tfName, 1, 0);        
    return gPane;
  }
  
  
  
   public static void main(String[] args) {
    launch(args);
  }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the mgr
     */
    public EmployeeManager getMgr() {
        return mgr;
    }

    /**
     * @param mgr the mgr to set
     */
    public void setMgr(EmployeeManager mgr) {
        this.mgr = mgr;
    }

    /**
     * @return the emp
     */
    public Employee getEmp() {
        return emp;
    }

    /**
     * @param emp the emp to set
     */
    public void setEmp(Employee emp) {
        this.emp = emp;
    }
} 

