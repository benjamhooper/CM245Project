package Lab06;

/**
 * @author Benjamin Hooper
 */

import java.util.ArrayList;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class RandomDeck extends Application {
    @Override
    public void start(Stage primaryStage) {
        ArrayList<Integer> card = getCards();
        HBox pane = new HBox(6);
        pane.setPadding(new Insets(15,15,15,15));

        for (int i = 0; i < 3; i++) {
            pane.getChildren().add(new ImageView(new Image("image/card/"
                    + card.get(i) + ".png")));
        }

        Scene scene = new Scene(pane);
        primaryStage.setTitle("RandomDeck");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setResizable(false);
    }

    private ArrayList<Integer> getCards() {
        ArrayList<Integer> card = new ArrayList<>();
        for (int i = 0; i < 52; i++) {
            card.add(i + 1);
        }
        java.util.Collections.shuffle(card);
        return card;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
