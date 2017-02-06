package Final;

import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.geometry.Pos;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class FinalIntro extends Application {////////////////////////////////////Start method creating TextFields for the Username
   private TextField tfUser = new TextField();
   private Button btEnter = new Button("Enter");
   public static String username = "";
   
  @Override
  public void start(Stage primaryStage) {////////////////////////////////////////Creating the stage for the scene
    StackPane sPane = new StackPane();
    GridPane pane = new GridPane();
    pane.setHgap(5);
    pane.setVgap(5);

    Image image = new Image("image/cover.jpg");//////////////////////////////////Setting background Image
    Label lbIntro = new Label("Please create a username:");//////////////////////Prompting or a Username
    lbIntro.setFont(Font.font("Vijaya", FontWeight.BOLD, FontPosture.ITALIC, 40));//Setting font,size,and text of the message displayed
    lbIntro.setTextFill(Color.RED);
    ImageView cover = new ImageView(image);
    cover.setFitHeight(450);
    cover.setFitWidth(800);
    
    pane.setAlignment(Pos.CENTER);///////////////////////////////////////////////Setting alignment of the text field
    lbIntro.setAlignment(Pos.BOTTOM_RIGHT);
    tfUser.setAlignment(Pos.BOTTOM_RIGHT);
    btEnter.setAlignment(Pos.CENTER);
    
    pane.add(lbIntro, 0, 1);
    pane.add(tfUser, 0, 2);
    pane.add(btEnter,0, 3);  
    
    btEnter.setOnAction(e ->nextPart());
    
    sPane.getChildren().addAll(cover,pane);
    Scene scene1 = new Scene(sPane, 800, 450);
    primaryStage.setResizable(false);
    primaryStage.setTitle("Music");
    primaryStage.setScene(scene1);
    primaryStage.show();
  }
  public void nextPart() {///////////////////////////////////////////////////////Method which runs FinalProject
    username = tfUser.getText();
    FinalProject object = new FinalProject();
    Stage stage = new Stage();
    object.start(stage);
}
  public static void main(String[] args) {///////////////////////////////////////Main Method
    launch(args);
  }
}