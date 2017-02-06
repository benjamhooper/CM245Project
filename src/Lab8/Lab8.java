package Lab8;


import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.stage.Stage;

public class Lab8 extends Application {
  private TextField tfDiameter = new TextField();
  private TextField tfHeight = new TextField();
  private TextField tfLiters = new TextField();
  private TextField tfQuarts = new TextField();
  private TextField tfGallons = new TextField();
  private Text txtInches = new Text("Height of common volumes in inches: ");
  private TextField tf1Gal = new TextField();
  private TextField tf5Gal = new TextField();
  private TextField tf55Gal = new TextField();
  private TextField tf65Gal = new TextField();
  private Button btCalculate = new Button("Calculate");
  
  @Override
  public void start(Stage primaryStage) {
    GridPane gridPane = new GridPane();
    gridPane.setHgap(5);
    gridPane.setVgap(5);
    gridPane.add(new Label("Diameter:"), 0, 0);
    gridPane.add(tfDiameter, 1, 0);
    gridPane.add(new Label("Height:"), 0, 1);
    gridPane.add(tfHeight, 1, 1);
    gridPane.add(new Text("Total Volume:"), 1, 2);
    gridPane.add(new Label("Liters:"), 0, 3);
    gridPane.add(tfLiters, 1, 3);
    gridPane.add(new Label("Quarts:"), 0, 4);
    gridPane.add(tfQuarts, 1, 4);
    gridPane.add(new Label("Gallons:"), 0, 5);
    gridPane.add(tfGallons, 1, 5);
    gridPane.add(txtInches, 1, 6);
    gridPane.add(new Label("1.0 Gal"), 0, 7);
    gridPane.add(tf1Gal, 1, 7);
    gridPane.add(new Label("5.0 Gal"), 0, 8);
    gridPane.add(tf5Gal, 1, 8);
    gridPane.add(new Label("5.5 Gal"), 0, 9);
    gridPane.add(tf55Gal, 1, 9);
    gridPane.add(new Label("6.5 Gal"), 0, 10);
    gridPane.add(tf65Gal, 1, 10);
    gridPane.add(btCalculate, 1, 11);

    // Set properties for UI
    gridPane.setAlignment(Pos.CENTER);
    tfDiameter.setAlignment(Pos.BOTTOM_RIGHT);
    tfHeight.setAlignment(Pos.BOTTOM_RIGHT);
    tfLiters.setAlignment(Pos.BOTTOM_RIGHT);
    tfQuarts.setAlignment(Pos.BOTTOM_RIGHT);
    tfGallons.setAlignment(Pos.BOTTOM_RIGHT);
    tf1Gal.setAlignment(Pos.BOTTOM_RIGHT);
    tf5Gal.setAlignment(Pos.BOTTOM_RIGHT);
    tf55Gal.setAlignment(Pos.BOTTOM_RIGHT);
    tf65Gal.setAlignment(Pos.BOTTOM_RIGHT);
    tfLiters.setEditable(false);
    tfQuarts.setEditable(false);
    tfGallons.setEditable(false);
    tf1Gal.setEditable(false);
    tf5Gal.setEditable(false);
    tf55Gal.setEditable(false);
    tf65Gal.setEditable(false);
    
    GridPane.setHalignment(btCalculate, HPos.RIGHT);


    btCalculate.setOnAction(e ->displayAns());

    Scene scene = new Scene(gridPane, 400, 600);
    primaryStage.setTitle("Kettle Calculator"); 
    primaryStage.setScene(scene); 
    primaryStage.show();
  }
  
  private double calculateLiters() {
    double diameter =
      Double.parseDouble(tfDiameter.getText());
    double height = Double.parseDouble(tfHeight.getText());
    double diameterCM = diameter * 2.54;
    double heightCM = height * 2.54;
    double radius = diameterCM / 2;
    double liters = (3.142*(radius*radius)*heightCM)/1000;
    return liters;
  }
  
  
  private double calculateQuarts() {
    double diameter =
      Double.parseDouble(tfDiameter.getText());
    double height = Double.parseDouble(tfHeight.getText());
    double diameterCM = diameter * 2.54;
    double heightCM = height * 2.54;
    double radius = diameterCM / 2;
    double liters = (3.142*(radius*radius)*heightCM)/1000;
    //liters=(Math.round(liters * 100))/100;
    double Quarts = liters * 1.05668821;
    return Quarts;
  }
  
    private double calculateGallons() {
    // Get values from text fields
    double diameter =
      Double.parseDouble(tfDiameter.getText());
    double height = Double.parseDouble(tfHeight.getText());
    double diameterCM = diameter * 2.54;
    double heightCM = height * 2.54;
    double radius = diameterCM / 2;
    double liters = (3.142*(radius*radius)*heightCM)/1000;
    double gallons = (liters * 1.05668821)/4;
    return gallons;
  }
  
      private double calculate1Gal() {
    double diameter =
      Double.parseDouble(tfDiameter.getText());
    double height = Double.parseDouble(tfHeight.getText());
        double diameterCM = diameter * 2.54;
    double heightCM = height * 2.54;
    double radius = diameterCM / 2;
    double liters = (3.142*(radius*radius)*heightCM)/1000;
    double gallons = (liters * 1.05668821)/4;
    double oneGal = ((height)/gallons);
    return oneGal;
  }
      
      private double calculate5Gal() {
    double diameter =
    Double.parseDouble(tfDiameter.getText());
    double height = Double.parseDouble(tfHeight.getText());
        double diameterCM = diameter * 2.54;
    double heightCM = height * 2.54;
    double radius = diameterCM / 2;
    double liters = (3.142*(radius*radius)*heightCM)/1000;
    double gallons = (liters * 1.05668821)/4;
    double fiveGal = ((height)/gallons)*5;
    return fiveGal;    
  }
  
      private double calculate55Gal() {
    double diameter =
      Double.parseDouble(tfDiameter.getText());
    double height = Double.parseDouble(tfHeight.getText());
            double diameterCM = diameter * 2.54;
    double heightCM = height * 2.54;
    double radius = diameterCM / 2;
    double liters = (3.142*(radius*radius)*heightCM)/1000;
    double gallons = (liters * 1.05668821)/4;
    double fiveFiveGal = ((height)/gallons)*5.5;
    return fiveFiveGal;
  }
      
      private double calculate65Gal() {
    double diameter =
      Double.parseDouble(tfDiameter.getText());
    double height = Double.parseDouble(tfHeight.getText());
    double Gallons =
      Double.parseDouble(tfGallons.getText());
             double diameterCM = diameter * 2.54;
    double heightCM = height * 2.54;
    double radius = diameterCM / 2;
    double liters = (3.142*(radius*radius)*heightCM)/1000;
    double gallons = (liters * 1.05668821)/4;
    double sixFiveGal = ((height)/gallons)*6.5;
    return sixFiveGal;
  }
    public void displayAns()
    {
        tfLiters.setText(String.format("%5.2f",calculateLiters()));
        tfQuarts.setText(String.format("%5.2f",calculateQuarts()));
        tfGallons.setText(String.format("%5.2f",calculateGallons()));
        tf1Gal.setText(String.format("%5.2f",calculate1Gal()));
        tf5Gal.setText(String.format("%5.2f",calculate5Gal()));
        tf55Gal.setText(String.format("%5.2f",calculate55Gal()));
        tf65Gal.setText(String.format("%5.2f",calculate65Gal()));
    }
    
  public static void main(String[] args) {
    launch(args);
  }
}