package hellofx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class HelloFX extends Application {

    @Override
    public void start(Stage stage) {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");

        stage.initStyle(StageStyle.TRANSPARENT);



        Text l = new Text("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        l.setFill(Color.RED);
        l.setFont(Font.font ("Verdana", 20));

        StackPane sp = new StackPane();
        sp.getChildren().add(l);
        sp.setAlignment(l, Pos.TOP_LEFT);
        sp.setStyle("-fx-background-color: black; -fx-background-radius: 15 15 15 15");

        final Scene scene = new Scene(sp, 640, 480);
        scene.setFill(null);


        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }

}