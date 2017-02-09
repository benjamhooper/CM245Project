import java.util.ArrayList;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class QuizCalcWindow extends Application {

    private TextField tfScore = new TextField();
    private TextField tfMessage = new TextField();
    private TextField tfPercentage = new TextField();
    private Button btCalculate = new Button("Calculate");

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create UI
        GridPane gridPane = new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.add(new Label("Score:"), 0, 0);
        gridPane.add(tfScore, 1, 0);
        gridPane.add(new Label("Percentage:"), 0, 1);
        gridPane.add(tfPercentage, 1, 1);
        gridPane.add(new Label("Message:"), 0, 2);
        gridPane.add(tfMessage, 1, 2);

        gridPane.add(btCalculate, 1, 5);

        // Set properties for UI
        gridPane.setAlignment(Pos.CENTER);
        tfScore.setAlignment(Pos.BOTTOM_RIGHT);
        tfMessage.setAlignment(Pos.BOTTOM_RIGHT);
        tfPercentage.setAlignment(Pos.BOTTOM_RIGHT);
        tfPercentage.setEditable(false);
        GridPane.setHalignment(btCalculate, HPos.RIGHT);

          
        // Create a scene and place it in the stage
        Scene scene = new Scene(gridPane, 400, 250);
        primaryStage.setTitle("Quiz Window"); // Set title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    public static void main(String[] args) {
        launch(args);
    } 
}
class Quiz {
    private double score = 0;
    private static final double MAX = 10;
    public Quiz() { score = 0; }
    public Quiz(double score) { this.setScore(score); }
    public void setScore(double score) {
        if (score < 0 || score > MAX) 
            throw new IllegalArgumentException("Invalid score.");
        this.score = score;
    }
    public double getScore() { return score;}
    public double getPercentage() { return score/MAX * 100; }
    
}

class SongManager {
    private ArrayList<Song> list;
    public SongManager() { this.list = new ArrayList<>(); }
    
        public void add(Song s){
        list.add(s);
    }
    
    public void remove(Song s){
        list.remove(s);
    }
    
//    public Song get (String title){
//        for (int i = 0; i < list.size(); i++)
//            //if (list.get(i) == )
//                 return list.get(i);
//            //else return null;
//    }
    
    //public double getAvgLength(){
        
    //}
}

class Song {
    private String title;
    private int length; //in seconds
    public Song(String title, int length) {
        setTitle(title);
        setLength(length);
        
    }
    private void setTitle(String title ) {
        this.title = title; 
    }
    private void setLength(int length) {
        this.length = length;
    }
    public String getTitle() { return title; }
    public int getLength() { return length; }  
    
    
}

class RightCone
{
    public double height;
    public double radius;
    public double length;
    
    public RightCone(double height, double radius, double length) {
    setHeight(height);
    setRadius(radius);
    setLength(length);
    }
    
    RightCone f = new RightCone(height, radius, length);
    double volume = calcVolume(f);
    
    public double getHeight()
    {
        return height;
    }
    
        public double getRadius()
    {
        return height;
    }
        
        public double getLength()
    {
        return height;
    }
        
    public void setHeight(double h)
    {   
        if (h <= 0){
            throw new IllegalArgumentException();
        }
        try {
            this.height = h;}
        catch (IllegalArgumentException ex) {
            this.height = 1;
        }
    }
    
    public void setRadius(double r)
    {
        if (r <= 0){
            throw new IllegalArgumentException();
        }
        try {
            this.radius = r;}
        catch (IllegalArgumentException ex) {
            this.radius = 1;
        }
    }
        
    public void setLength(double l)
    {
        if (l <= 0) {
            throw new IllegalArgumentException();
        }
        try {
        this.length = l; }
        catch (IllegalArgumentException ex) {
            this.length = 1;
        }
    }
    
    public double calcVolume(RightCone t){
        double vol = 1 / 3 * Math.PI * Math.pow(t.getRadius(), 2) * t.getHeight();
        return vol;
    }
    
}

