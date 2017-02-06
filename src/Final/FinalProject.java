package Final;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.io.FileNotFoundException;
import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;

public class FinalProject extends Application {//////////////////////////////////Create a boolean value for each music file to be Qued
    boolean A = false;//1000
    boolean B = false;//2000
    boolean C = false;//3000
    boolean D = false;//4000
    boolean E = false;//0100
    boolean F = false;//0200
    boolean G = false;//0300
    boolean H = false;//0400
    boolean I = false;//0010
    boolean J = false;//0020
    boolean K = false;//0030
    boolean L = false;//0040
    boolean M = false;//0001
    boolean N = false;//0002
    boolean O = false;//0003
    boolean P = false;//0004
    
    Stage stageStop = new Stage();
    /////////////////////////////////////////////////////////////////////////////Add all of the Music Files
      private static final String MEDIA_URL1000 = "‪resources/ComputerProgrammingMusicFiles/0001.mp3";
      //File:/Users/User/Music/ComputerProgramingMusicFiles/
                Media media1000 = new Media(MEDIA_URL1000);
          MediaPlayer mediaPlayer1000 = new MediaPlayer(media1000);
          MediaView mediaView1000 = new MediaView(mediaPlayer1000);
          
      private static final String MEDIA_URL2000 = "audio/2000.mp3";
                Media media2000 = new Media(MEDIA_URL2000);
          MediaPlayer mediaPlayer2000 = new MediaPlayer(media2000);
          MediaView mediaView2000 = new MediaView(mediaPlayer2000);
          
      private static final String MEDIA_URL3000 = "audio/3000.mp3";
                Media media3000 = new Media(MEDIA_URL3000);
          MediaPlayer mediaPlayer3000 = new MediaPlayer(media3000);
          MediaView mediaView3000 = new MediaView(mediaPlayer3000);
          
      private static final String MEDIA_URL4000 = "audio/4000.mp3";
                Media media4000 = new Media(MEDIA_URL4000);
          MediaPlayer mediaPlayer4000 = new MediaPlayer(media4000);
          MediaView mediaView4000 = new MediaView(mediaPlayer4000);
          
      private static final String MEDIA_URL0100 = "audio/0100.mp3";
                Media media0100 = new Media(MEDIA_URL0100);
          MediaPlayer mediaPlayer0100 = new MediaPlayer(media0100);
          MediaView mediaView0100 = new MediaView(mediaPlayer0100);
          
      private static final String MEDIA_URL0200 = "audio/0200.mp3";
                Media media0200 = new Media(MEDIA_URL0200);
          MediaPlayer mediaPlayer0200 = new MediaPlayer(media0200);
          MediaView mediaView0200 = new MediaView(mediaPlayer0200);
          
      private static final String MEDIA_URL0300 = "audio/0300.mp3";
                Media media0300 = new Media(MEDIA_URL0300);
          MediaPlayer mediaPlayer0300 = new MediaPlayer(media0300);
          MediaView mediaView0300 = new MediaView(mediaPlayer0300);
          
      private static final String MEDIA_URL0400 = "audio/0400.mp3";
                Media media0400 = new Media(MEDIA_URL0400);
          MediaPlayer mediaPlayer0400 = new MediaPlayer(media0400);
          MediaView mediaView0400 = new MediaView(mediaPlayer0400);
       
      private static final String MEDIA_URL0010 = "audio/0010.mp3";
                Media media0010 = new Media(MEDIA_URL0010);
          MediaPlayer mediaPlayer0010 = new MediaPlayer(media0010);
          MediaView mediaView0010 = new MediaView(mediaPlayer0010);
          
      private static final String MEDIA_URL0020 = "audio/0020.mp3";
                Media media0020 = new Media(MEDIA_URL0020);
          MediaPlayer mediaPlayer0020 = new MediaPlayer(media0020);
          MediaView mediaView0020 = new MediaView(mediaPlayer0020);
          
      private static final String MEDIA_URL0030 = "audio/0030.mp3";
                Media media0030 = new Media(MEDIA_URL0030);
          MediaPlayer mediaPlayer0030 = new MediaPlayer(media0030);
          MediaView mediaView0030 = new MediaView(mediaPlayer0030);
          
      private static final String MEDIA_URL0040 = "audio/0040.mp3";
                Media media0040 = new Media(MEDIA_URL0040);
          MediaPlayer mediaPlayer0040 = new MediaPlayer(media0040);
          MediaView mediaView0040 = new MediaView(mediaPlayer0040);
          
      private static final String MEDIA_URL0001 = "audio/0001.mp3";
                Media media0001 = new Media(MEDIA_URL0001);
          MediaPlayer mediaPlayer0001 = new MediaPlayer(media0001);
          MediaView mediaView0001 = new MediaView(mediaPlayer0001);
          
      private static final String MEDIA_URL0002 = "audio/0002.mp3";
                Media media0002 = new Media(MEDIA_URL0002);
          MediaPlayer mediaPlayer0002 = new MediaPlayer(media0002);
          MediaView mediaView0002 = new MediaView(mediaPlayer0002);
          
      private static final String MEDIA_URL0003 = "audio/0003.mp3";
                Media media0003 = new Media(MEDIA_URL0003);
          MediaPlayer mediaPlayer0003 = new MediaPlayer(media0003);
          MediaView mediaView0003 = new MediaView(mediaPlayer0003);
          
      private static final String MEDIA_URL0004 = "audio/0004.mp3";
                Media media0004 = new Media(MEDIA_URL0004);
          MediaPlayer mediaPlayer0004 = new MediaPlayer(media0004);
          MediaView mediaView0004 = new MediaView(mediaPlayer0004);

  @Override /////////////////////////////////////////////////////////////////////Override the start method in the Application class
  public void start(Stage primaryStage) {
    /////////////////////////////////////////////////////////////////////////////Create a pane and set its properties
    HBox paneH = new HBox(5);
    paneH.setAlignment(Pos.CENTER);
    Button btBass1 = new Button("Bass 1");
    Button btBass2 = new Button("Bass 2");
    Button btBass3 = new Button("Bass 3");
    Button btBass4 = new Button("Bass 4");
    
    Button btSynth1 = new Button("Synth 1");
    Button btSynth2 = new Button("Synth 2");
    Button btSynth3 = new Button("Synth 3");
    Button btSynth4 = new Button("Synth 4");
    
    Button btDrum1 = new Button("Drum 1");
    Button btDrum2 = new Button("Drum 2");
    Button btDrum3 = new Button("Drum 3");
    Button btDrum4 = new Button("Drum 4");
    
    Button btLead1 = new Button("Lead 1");
    Button btLead2 = new Button("Lead 2");
    Button btLead3 = new Button("Lead 3");
    Button btLead4 = new Button("Lead 4");
    
    Button btPlay = new Button("Play");
    Button btReset = new Button("Reset");
    /////////////////////////////////////////////////////////////////////////////Setting font,size,and color of button Text
    btBass1.setStyle("-fx-font: 30 Vijaya; -fx-base: #cc0000;");
        btBass1.setOnAction(e -> bass1());
    
    btBass2.setStyle("-fx-font: 30 Vijaya; -fx-base: #cc0000;");
        btBass2.setOnAction(e-> bass2());
    
    btBass3.setStyle("-fx-font: 30 Vijaya; -fx-base: #cc0000;");    
        btBass3.setOnAction(e-> bass3());
    
    btBass4.setStyle("-fx-font: 30 Vijaya; -fx-base: #cc0000;");
        btBass4.setOnAction(e-> bass4());

    btSynth1.setStyle("-fx-font: 30 Vijaya; -fx-base: #990099;");    
        btSynth1.setOnAction(e-> Synth1());
    
    btSynth2.setStyle("-fx-font: 30 Vijaya; -fx-base: #990099;");        
        btSynth2.setOnAction(e-> Synth2());
            
    btSynth3.setStyle("-fx-font: 30 Vijaya; -fx-base: #990099;");        
        btSynth3.setOnAction(e-> Synth3());
            
    btSynth4.setStyle("-fx-font: 30 Vijaya; -fx-base: #990099;");        
        btSynth4.setOnAction(e-> Synth4());

    btDrum1.setStyle("-fx-font: 30 Vijaya; -fx-base: #33ff66;");        
        btDrum1.setOnAction(e-> Drum1());
            
    btDrum2.setStyle("-fx-font: 30 Vijaya; -fx-base: #33ff66;");    
        btDrum2.setOnAction(e-> Drum2());
    
    btDrum3.setStyle("-fx-font: 30 Vijaya; -fx-base: #33ff66;");
        btDrum3.setOnAction(e-> Drum3());

    btDrum4.setStyle("-fx-font: 30 Vijaya; -fx-base: #33ff66;");    
        btDrum4.setOnAction(e-> Drum4());

    btLead1.setStyle("-fx-font: 30 Vijaya; -fx-base: #0066cc;");    
        btLead1.setOnAction(e-> Lead1());
            
    btLead2.setStyle("-fx-font: 30 Vijaya; -fx-base: #0066cc;");    
        btLead2.setOnAction(e-> Lead2());
    
    btLead3.setStyle("-fx-font: 30 Vijaya; -fx-base: #0066cc;");
        btLead3.setOnAction(e-> Lead3());

    btLead4.setStyle("-fx-font: 30 Vijaya; -fx-base: #0066cc;");
        btLead4.setOnAction(e-> Lead4());

    btPlay.setStyle("-fx-font: 35 TimesNewRoman; -fx-base: #ffff00;");
    btPlay.setOnAction(e -> play());

    btReset.setStyle("-fx-font: 35 TimesNewRoman; -fx-base: #ffff00;");
    btReset.setOnAction(e -> reset());  
/////////////////////////////////////////////////////////////////////////////////Adding buttons to pane
    paneH.getChildren().addAll(btBass1, btBass2, btBass3, btBass4,
            btSynth1, btSynth2, btSynth3, btSynth4,
            btDrum1, btDrum2, btDrum3, btDrum4,
            btLead1, btLead2, btLead3, btLead4,
            btPlay, btReset);
/////////////////////////////////////////////////////////////////////////////////Setting the Background image of the Stage
     Image image = new Image("image/cover.jpg");
     ImageView cover = new ImageView(image);
     cover.setFitHeight(450);
     cover.setFitWidth(800);
     StackPane spane = new StackPane();//////////////////////////////////////////Created a StackPane to be background for the GridPane

    GridPane gpane = new GridPane();/////////////////////////////////////////////Creating GridPane to easily organize buttons
    gpane.setPadding(new Insets(50, 100, 50, 100));
        gpane.setHgap(50);
        gpane.setVgap(10);
        gpane.add(btBass1, 0, 0);
        gpane.add(btBass2, 0, 1);
        gpane.add(btBass3, 0, 2);
        gpane.add(btBass4, 0, 3);
        gpane.add(btSynth1, 1, 0);
        gpane.add(btSynth2, 1, 1);
        gpane.add(btSynth3, 1, 2);
        gpane.add(btSynth4, 1, 3);
        gpane.add(btDrum1, 2, 0);
        gpane.add(btDrum2, 2, 1);
        gpane.add(btDrum3, 2, 2);
        gpane.add(btDrum4, 2, 3);
        gpane.add(btLead1, 3, 0);
        gpane.add(btLead2, 3, 1);
        gpane.add(btLead3, 3, 2);
        gpane.add(btLead4, 3, 3);
        
        gpane.add(btPlay, 1, 5);
        gpane.add(btReset, 2, 5);

    spane.getChildren().addAll(cover, gpane);
    Scene scene3 = new Scene(spane);
    primaryStage.setTitle("Music by: " + Final.FinalIntro.username); ////////////Set the stage title
    primaryStage.setScene(scene3);
    primaryStage.setResizable(false);
    primaryStage.show(); ////////////////////////////////////////////////////////Display the stage
    
/////////////////////////////////////////////////////////////////////////////////Adding Shadows to the Buttons
/////////////////////////////////////////////////////////////////////////////////Adding the shadow when the mouse cursor is on
DropShadow shadow = new DropShadow();
btBass1.addEventHandler(MouseEvent.MOUSE_ENTERED, 
    new EventHandler<MouseEvent>() {
    @Override public void handle(MouseEvent e) {
            btBass1.setEffect(shadow);
        }});
/////////////////////////////////////////////////////////////////////////////////Removing the shadow when the mouse cursor is off
btBass1.addEventHandler(MouseEvent.MOUSE_EXITED, 
    new EventHandler<MouseEvent>() {
    @Override public void handle(MouseEvent e) {
            btBass1.setEffect(null);
        }});

btBass2.addEventHandler(MouseEvent.MOUSE_ENTERED, 
    new EventHandler<MouseEvent>() {
    @Override public void handle(MouseEvent e) {
            btBass2.setEffect(shadow);
        }});
btBass2.addEventHandler(MouseEvent.MOUSE_EXITED, 
    new EventHandler<MouseEvent>() {
    @Override public void handle(MouseEvent e) {
            btBass2.setEffect(null);
        }});

btBass3.addEventHandler(MouseEvent.MOUSE_ENTERED, 
    new EventHandler<MouseEvent>() {
    @Override public void handle(MouseEvent e) {
            btBass3.setEffect(shadow);
        }});
btBass3.addEventHandler(MouseEvent.MOUSE_EXITED, 
    new EventHandler<MouseEvent>() {
    @Override public void handle(MouseEvent e) {
            btBass3.setEffect(null);
        }});

btBass4.addEventHandler(MouseEvent.MOUSE_ENTERED, 
    new EventHandler<MouseEvent>() {
    @Override public void handle(MouseEvent e) {
            btBass4.setEffect(shadow);
        }});
btBass4.addEventHandler(MouseEvent.MOUSE_EXITED, 
    new EventHandler<MouseEvent>() {
    @Override public void handle(MouseEvent e) {
            btBass4.setEffect(null);
        }});

btSynth1.addEventHandler(MouseEvent.MOUSE_ENTERED, 
    new EventHandler<MouseEvent>() {
    @Override public void handle(MouseEvent e) {
            btSynth1.setEffect(shadow);
        }});
btSynth1.addEventHandler(MouseEvent.MOUSE_EXITED, 
    new EventHandler<MouseEvent>() {
    @Override public void handle(MouseEvent e) {
            btSynth1.setEffect(null);
        }});

btSynth2.addEventHandler(MouseEvent.MOUSE_ENTERED, 
    new EventHandler<MouseEvent>() {
    @Override public void handle(MouseEvent e) {
            btSynth2.setEffect(shadow);
        }});
btSynth2.addEventHandler(MouseEvent.MOUSE_EXITED, 
    new EventHandler<MouseEvent>() {
    @Override public void handle(MouseEvent e) {
            btSynth2.setEffect(null);
        }});

btSynth3.addEventHandler(MouseEvent.MOUSE_ENTERED, 
    new EventHandler<MouseEvent>() {
    @Override public void handle(MouseEvent e) {
            btSynth3.setEffect(shadow);
        }});
btSynth3.addEventHandler(MouseEvent.MOUSE_EXITED, 
    new EventHandler<MouseEvent>() {
    @Override public void handle(MouseEvent e) {
            btSynth3.setEffect(null);
        }});

btSynth4.addEventHandler(MouseEvent.MOUSE_ENTERED, 
    new EventHandler<MouseEvent>() {
    @Override public void handle(MouseEvent e) {
            btSynth4.setEffect(shadow);
        }});
btSynth4.addEventHandler(MouseEvent.MOUSE_EXITED, 
    new EventHandler<MouseEvent>() {
    @Override public void handle(MouseEvent e) {
            btSynth4.setEffect(null);
        }});

btDrum1.addEventHandler(MouseEvent.MOUSE_ENTERED, 
    new EventHandler<MouseEvent>() {
    @Override public void handle(MouseEvent e) {
            btDrum1.setEffect(shadow);
        }});
btDrum1.addEventHandler(MouseEvent.MOUSE_EXITED, 
    new EventHandler<MouseEvent>() {
    @Override public void handle(MouseEvent e) {
            btDrum1.setEffect(null);
        }});

btDrum2.addEventHandler(MouseEvent.MOUSE_ENTERED, 
    new EventHandler<MouseEvent>() {
    @Override public void handle(MouseEvent e) {
            btDrum2.setEffect(shadow);
        }});
btDrum2.addEventHandler(MouseEvent.MOUSE_EXITED, 
    new EventHandler<MouseEvent>() {
    @Override public void handle(MouseEvent e) {
            btDrum2.setEffect(null);
        }});

btDrum3.addEventHandler(MouseEvent.MOUSE_ENTERED, 
    new EventHandler<MouseEvent>() {
    @Override public void handle(MouseEvent e) {
            btDrum3.setEffect(shadow);
        }});
btDrum3.addEventHandler(MouseEvent.MOUSE_EXITED, 
    new EventHandler<MouseEvent>() {
    @Override public void handle(MouseEvent e) {
            btDrum3.setEffect(null);
        }});

btDrum4.addEventHandler(MouseEvent.MOUSE_ENTERED, 
    new EventHandler<MouseEvent>() {
    @Override public void handle(MouseEvent e) {
            btDrum4.setEffect(shadow);
        }});
btDrum4.addEventHandler(MouseEvent.MOUSE_EXITED, 
    new EventHandler<MouseEvent>() {
    @Override public void handle(MouseEvent e) {
            btDrum4.setEffect(null);
        }});

btLead1.addEventHandler(MouseEvent.MOUSE_ENTERED, 
    new EventHandler<MouseEvent>() {
    @Override public void handle(MouseEvent e) {
            btLead1.setEffect(shadow);
        }});

btLead1.addEventHandler(MouseEvent.MOUSE_EXITED, 
    new EventHandler<MouseEvent>() {
    @Override public void handle(MouseEvent e) {
            btLead1.setEffect(null);
        }});

btLead2.addEventHandler(MouseEvent.MOUSE_ENTERED, 
    new EventHandler<MouseEvent>() {
    @Override public void handle(MouseEvent e) {
            btLead2.setEffect(shadow);
        }});
btLead2.addEventHandler(MouseEvent.MOUSE_EXITED, 
    new EventHandler<MouseEvent>() {
    @Override public void handle(MouseEvent e) {
            btLead2.setEffect(null);
        }});

btLead3.addEventHandler(MouseEvent.MOUSE_ENTERED, 
    new EventHandler<MouseEvent>() {
    @Override public void handle(MouseEvent e) {
            btLead3.setEffect(shadow);
        }});
btLead3.addEventHandler(MouseEvent.MOUSE_EXITED, 
    new EventHandler<MouseEvent>() {
    @Override public void handle(MouseEvent e) {
            btLead3.setEffect(null);
        }});

btLead4.addEventHandler(MouseEvent.MOUSE_ENTERED, 
    new EventHandler<MouseEvent>() {
    @Override public void handle(MouseEvent e) {
            btLead4.setEffect(shadow);
        }});
btLead4.addEventHandler(MouseEvent.MOUSE_EXITED, 
    new EventHandler<MouseEvent>() {
    @Override public void handle(MouseEvent e) {
            btLead4.setEffect(null);
        }});

btPlay.addEventHandler(MouseEvent.MOUSE_ENTERED, 
    new EventHandler<MouseEvent>() {
    @Override public void handle(MouseEvent e) {
            btPlay.setEffect(shadow);
        }});
btPlay.addEventHandler(MouseEvent.MOUSE_EXITED, 
    new EventHandler<MouseEvent>() {
    @Override public void handle(MouseEvent e) {
            btPlay.setEffect(null);
        }});

btReset.addEventHandler(MouseEvent.MOUSE_ENTERED, 
    new EventHandler<MouseEvent>() {
    @Override public void handle(MouseEvent e) {
            btReset.setEffect(shadow);
        }});
btReset.addEventHandler(MouseEvent.MOUSE_EXITED, 
    new EventHandler<MouseEvent>() {
    @Override public void handle(MouseEvent e) {
            btReset.setEffect(null);
        }});
  } /////////////////////////////////////////////////////////////////////////////Methods called to Que a specific sound file
  public void bass1(){
                       Media media1000 = new Media(MEDIA_URL1000);
          MediaPlayer mediaPlayer1000 = new MediaPlayer(media1000);
          MediaView mediaView1000 = new MediaView(mediaPlayer1000);
         System.out.println("Bass1Qued");
         A = true;
  }
  public void bass2(){
                       Media media2000 = new Media(MEDIA_URL2000);
          MediaPlayer mediaPlayer2000 = new MediaPlayer(media2000);
          MediaView mediaView2000 = new MediaView(mediaPlayer2000);
         System.out.println("Bass2Qued");
         B = true;
  }
  public void bass3(){
                       Media media3000 = new Media(MEDIA_URL3000);
          MediaPlayer mediaPlayer3000 = new MediaPlayer(media3000);
          MediaView mediaView3000 = new MediaView(mediaPlayer3000);
         System.out.println("Bass3Qued");
         C = true;
  }
  public void bass4(){
                       Media media4000 = new Media(MEDIA_URL4000);
          MediaPlayer mediaPlayer4000 = new MediaPlayer(media4000);
          MediaView mediaView4000 = new MediaView(mediaPlayer4000);
         System.out.println("Bass4Qued");
         D = true;
  }
  public void Synth1(){
                       Media media0100 = new Media(MEDIA_URL0100);
          MediaPlayer mediaPlayer0100 = new MediaPlayer(media0100);
          MediaView mediaView0100 = new MediaView(mediaPlayer0100);
         System.out.println("Synth1Qued");
         E = true;
  }
  public void Synth2(){
                       Media media0200 = new Media(MEDIA_URL0200);
          MediaPlayer mediaPlayer0200 = new MediaPlayer(media0200);
          MediaView mediaView0200 = new MediaView(mediaPlayer0200);
         System.out.println("Synth2Qued");
         F = true;
  }
  public void Synth3(){
                       Media media0300 = new Media(MEDIA_URL0300);
          MediaPlayer mediaPlayer0300 = new MediaPlayer(media0300);
          MediaView mediaView0300 = new MediaView(mediaPlayer0300);
         System.out.println("Synth3Qued");
         G = true;
  }
  public void Synth4(){
                       Media media0400 = new Media(MEDIA_URL0400);
          MediaPlayer mediaPlayer0400 = new MediaPlayer(media0400);
          MediaView mediaView0400 = new MediaView(mediaPlayer0400);
         System.out.println("Synth4Qued");
         H = true;
  }
  public void Drum1(){
                       Media media0010 = new Media(MEDIA_URL0010);
          MediaPlayer mediaPlayer0010 = new MediaPlayer(media0010);
          MediaView mediaView0010 = new MediaView(mediaPlayer0010);
         System.out.println("Drum1Qued");
         I = true;
  }
  public void Drum2(){
                       Media media0020 = new Media(MEDIA_URL0020);
          MediaPlayer mediaPlayer0020 = new MediaPlayer(media0020);
          MediaView mediaView0020 = new MediaView(mediaPlayer0020);
         System.out.println("Drum2Qued");
         J = true;
  }
  public void Drum3(){
                       Media media0030 = new Media(MEDIA_URL0030);
          MediaPlayer mediaPlayer0030 = new MediaPlayer(media0030);
          MediaView mediaView0030 = new MediaView(mediaPlayer0030);
         System.out.println("Drum3Qued");
         K = true;
  }
  public void Drum4(){
                       Media media0040 = new Media(MEDIA_URL0040);
          MediaPlayer mediaPlayer0040 = new MediaPlayer(media0040);
          MediaView mediaView0040 = new MediaView(mediaPlayer0040);
         System.out.println("Drum4Qued");
         L = true;
  }
  public void Lead1(){
                       Media media0001 = new Media(MEDIA_URL0001);
          MediaPlayer mediaPlayer0001 = new MediaPlayer(media0001);
          MediaView mediaView0001 = new MediaView(mediaPlayer0001);
         System.out.println("Lead1Qued");
         M = true;
  }
  public void Lead2(){
                       Media media0002 = new Media(MEDIA_URL0002);
          MediaPlayer mediaPlayer0002 = new MediaPlayer(media0002);
          MediaView mediaView0002 = new MediaView(mediaPlayer0002);
         System.out.println("Lead2Qued");
         N = true;
  }
  public void Lead3(){
                       Media media0003 = new Media(MEDIA_URL0003);
          MediaPlayer mediaPlayer0003 = new MediaPlayer(media0003);
          MediaView mediaView0003 = new MediaView(mediaPlayer0003);
         System.out.println("Lead3Qued");
         O = true;
  }
  public void Lead4(){
                       Media media0004 = new Media(MEDIA_URL0004);
          MediaPlayer mediaPlayer0004 = new MediaPlayer(media0004);
          MediaView mediaView0004 = new MediaView(mediaPlayer0004);
         System.out.println("Lead4Qued");
         P = true;
  }
    public void play() {
        System.out.println("PLAYMethodCalled");
                GridPane gridPane = new GridPane();//////////////////////////////setting GUI
/////////////////////////////////////////////////////////////////////////////////this is where multipule windows get created
/////////////////////////////////////////////////////////////////////////////////initModality(Modality.APPLICATION_MODAL)| NONE or WINDOW_MODAL
        Button btStop = new Button("Reset");
        btStop.setStyle("-fx-font: 35 TimesNewRoman; -fx-base: #ffff00");
        gridPane.add(btStop, 5, 14);     
        btStop.setAlignment(Pos.CENTER);
     Image image = new Image("image/cover.jpg");
     ImageView cover = new ImageView(image);
     cover.setFitHeight(450);
     cover.setFitWidth(800);
     StackPane spane = new StackPane();
                        Scene scenePlay = new Scene(spane, 800, 450);
            stageStop.setTitle("Playing Music by: " + Final.FinalIntro.username);
        stageStop.setScene(scenePlay);
    gridPane.setPadding(new Insets(50, 100, 50, 100));
    gridPane.setHgap(48);
    gridPane.setVgap(10);
          spane.getChildren().addAll(cover, gridPane);
        stageStop.show(); ///////////////////////////////////////////////////////Display the stage
        stageStop.setResizable(false);  
         System.out.println("PlayButtonPressed");
    btStop.setOnAction(e -> pause()); 
/////////////////////////////////////////////////////////////////////////////////Setting assignments to set a sound file to play or be silent
    if (A == false && B == false && C == false && D == false && E == false && F == false && G == false && H == false
            && I == false && J == false && K == false && L == false && M == false && N == false && O == false && P == false){
        System.out.println("You have selected nothing");
        fail();
        }
    if (A == true)
        {mediaPlayer1000.play();
        System.out.println("PlayBass1");
        }
    if (B == true)
        {mediaPlayer2000.play();
        System.out.println("PlayBass2");
        }
    if (C == true)
        {mediaPlayer3000.play();
        System.out.println("PlayBass3");
        }
    if (D == true)
        {mediaPlayer4000.play();
        System.out.println("PlayBass4");
        }
    if (E == true)
        {mediaPlayer0100.play();
        System.out.println("PlaySynth1");
        }
    if (F == true)
        {mediaPlayer0200.play();
        System.out.println("PlaySynth2");
        }
    if (G == true)
        {mediaPlayer0300.play();
        System.out.println("PlaySynth3");
        }
    if (H == true)
        {mediaPlayer0400.play();
        System.out.println("PlaySynth4");
        }
    if (I == true)
        {mediaPlayer0010.play();
        System.out.println("PlayDrum1");
        }
    if (J == true)
        {mediaPlayer0020.play();
        System.out.println("PlayDrum2");
        }
    if (K == true)
        {mediaPlayer0030.play();
        System.out.println("PlayDrum3");
        }
    if (L == true)
        {mediaPlayer0040.play();
        System.out.println("PlayDrum4");
        }
    if (M == true)
        {mediaPlayer0001.play();
        System.out.println("PlayLead1");
        }
    if (N == true)
        {mediaPlayer0002.play();
        System.out.println("PlayLead2");
        }
    if (O == true)
        {mediaPlayer0003.play();
        System.out.println("PlayLead3");
        }
    if (P == true)
        {mediaPlayer0004.play();
        System.out.println("PlayLead4");
        }
    }////////////////////////////////////////////////////////////////////////////Method that makes new window if no sound files are selected
   private void fail(){
       System.out.println("FAILMethodCalled");
                GridPane gridPane = new GridPane();
            
    Button btFail1 = new Button("You Have Not Selected Any Music To Play");//////Button prompts user and goes back to main stage
        btFail1.setStyle("-fx-font: 35 TimesNewRoman; -fx-base: #ffff00");
        gridPane.add(btFail1, 1, 10);
        btFail1.setAlignment(Pos.CENTER);
    Button btFail2 = new Button("               Press Here To Go Back                ");//////Button prompts user and goes back to main stage
        btFail2.setStyle("-fx-font: 35 TimesNewRoman; -fx-base: #ffff00");
        gridPane.add(btFail2, 1, 17);
        btFail2.setAlignment(Pos.CENTER);
        
     Image image = new Image("image/cover.jpg");/////////////////////////////////Setting Background of Stage
     ImageView cover = new ImageView(image);
     cover.setFitHeight(450);
     cover.setFitWidth(800);
     StackPane spane = new StackPane();
                        Scene scenePlay = new Scene(spane, 800, 450);
            stageStop.setTitle("**NOT** Playing Music by: " + Final.FinalIntro.username); // Set title
        stageStop.setScene(scenePlay); //////////////////////////////////////////Place the scene in the stage
        
    gridPane.setPadding(new Insets(10, 10, 10, 10));
    gridPane.setHgap(43);
    gridPane.setVgap(10);
        spane.getChildren().addAll(cover, gridPane);
        stageStop.show();
        stageStop.setResizable(false);
         System.out.println("FailButtonPressed");
    btFail1.setOnAction(e -> close());///////////////////////////////////////////Calling a method to close the current window
    btFail2.setOnAction(e -> close());
   } 
   private void pause() {////////////////////////////////////////////////////////Method which stops music and resets all files to silent
    mediaPlayer1000.pause();////////////////////////////////////////////////////////Also closes the current window
    mediaPlayer2000.pause();
    mediaPlayer3000.pause();
    mediaPlayer4000.pause();
    mediaPlayer0100.pause();
    mediaPlayer0200.pause();
    mediaPlayer0300.pause();
    mediaPlayer0400.pause();
    mediaPlayer0010.pause();
    mediaPlayer0020.pause();
    mediaPlayer0030.pause();
    mediaPlayer0040.pause();
    mediaPlayer0001.pause();
    mediaPlayer0002.pause();
    mediaPlayer0003.pause();
    mediaPlayer0004.pause();
    System.out.println("You Have Stopped The Music");
    A = false;
    B = false;
    C = false;
    D = false;
    E = false;
    F = false;
    G = false;
    H = false;
    I = false;
    J = false;
    K = false;
    L = false;
    M = false;
    N = false;
    O = false;
    P = false;
    mediaPlayer1000.seek(Duration.ZERO);
    mediaPlayer2000.seek(Duration.ZERO);
    mediaPlayer3000.seek(Duration.ZERO);
    mediaPlayer4000.seek(Duration.ZERO);
    mediaPlayer0100.seek(Duration.ZERO);
    mediaPlayer0200.seek(Duration.ZERO);
    mediaPlayer0300.seek(Duration.ZERO);
    mediaPlayer0400.seek(Duration.ZERO);
    mediaPlayer0010.seek(Duration.ZERO);
    mediaPlayer0020.seek(Duration.ZERO);
    mediaPlayer0030.seek(Duration.ZERO);
    mediaPlayer0040.seek(Duration.ZERO);
    mediaPlayer0001.seek(Duration.ZERO);
    mediaPlayer0002.seek(Duration.ZERO);
    mediaPlayer0003.seek(Duration.ZERO);
    mediaPlayer0004.seek(Duration.ZERO);
    close();
    }
   private void reset(){/////////////////////////////////////////////////////////Method that resets all selected files without playing them
    A = false;
    B = false;
    C = false;
    D = false;
    E = false;
    F = false;
    G = false;
    H = false;
    I = false;
    J = false;
    K = false;
    L = false;
    M = false;
    N = false;
    O = false;
    P = false;
   }
   private void close(){/////////////////////////////////////////////////////////Method that closes the window
       stageStop.close();
   }
  public static void main(String[] args) throws FileNotFoundException {//////////Throws exception if cover and sound files are not loaded correctly
    launch(args);
  }}
class Bass1HandlerClass implements EventHandler<ActionEvent> {///////////////////Prints to the terminal which buttons are pressed
  @Override/////////////////////////////////////////////////////////////////////////Only for troubleshooting purpouses
  public void handle(ActionEvent e) {
    System.out.println("Bass 1 Qued"); 
  }}
class Bass2HandlerClass implements EventHandler<ActionEvent> {
  @Override
  public void handle(ActionEvent e) {
    System.out.println("Bass 2 Qued"); 
  }}
class Bass3HandlerClass implements EventHandler<ActionEvent> {
  @Override
  public void handle(ActionEvent e) {
    System.out.println("Bass 3 Qued"); 
  }}
class Bass4HandlerClass implements EventHandler<ActionEvent> {
  @Override
  public void handle(ActionEvent e) {
    System.out.println("Bass 4 Qued"); 
  }}
class Synth1HandlerClass implements EventHandler<ActionEvent> {
  @Override
  public void handle(ActionEvent e) {
    System.out.println("Synth 1 Qued");
  }}
class Synth2HandlerClass implements EventHandler<ActionEvent> {
  @Override
  public void handle(ActionEvent e) {
    System.out.println("Synth 2 Qued");
  }}
class Synth3HandlerClass implements EventHandler<ActionEvent> {
  @Override
  public void handle(ActionEvent e) {
    System.out.println("Synth 3 Qued");
  }}
class Synth4HandlerClass implements EventHandler<ActionEvent> {
  @Override
  public void handle(ActionEvent e) {
    System.out.println("Synth 4 Qued");
  }}
class Drum1HandlerClass implements EventHandler<ActionEvent> {
  @Override
  public void handle(ActionEvent e) {
    System.out.println("Drum 1 Qued");
  }}
class Drum2HandlerClass implements EventHandler<ActionEvent> {
  @Override
  public void handle(ActionEvent e) {
    System.out.println("Drum 2 Qued");
  }}
class Drum3HandlerClass implements EventHandler<ActionEvent> {
  @Override
  public void handle(ActionEvent e) {
    System.out.println("Drum 3 Qued");
  }}
class Drum4HandlerClass implements EventHandler<ActionEvent> {
  @Override
  public void handle(ActionEvent e) {
    System.out.println("Drum 4 Qued");
  }}
class Lead1HandlerClass implements EventHandler<ActionEvent> {
  @Override
  public void handle(ActionEvent e) {
    System.out.println("Lead 1 Qued");
  }}
class Lead2HandlerClass implements EventHandler<ActionEvent> {
  @Override
  public void handle(ActionEvent e) {
    System.out.println("Lead 2 Qued");
  }}
class Lead3HandlerClass implements EventHandler<ActionEvent> {
  @Override
  public void handle(ActionEvent e) {
    System.out.println("Lead 3 Qued");
  }}
class Lead4HandlerClass implements EventHandler<ActionEvent> {
  @Override
  public void handle(ActionEvent e) {
    System.out.println("Lead 4 Qued");
  }}