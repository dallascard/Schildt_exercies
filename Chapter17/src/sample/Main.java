package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.paint.Color;
import java.awt.MouseInfo;

public class Main extends Application {

    Label response;

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception{
        System.out.println("Inside start");

        // From IntelliJ:
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //primaryStage.setScene(new Scene(root, 300, 275));

        // Set the title
        primaryStage.setTitle("Hello World");

        Group root = new Group();
        Scene scene = new Scene(root, 600, 330);

        GridPane gridpane = new GridPane();
        gridpane.setPadding(new Insets(5));
        gridpane.setHgap(10);
        gridpane.setVgap(10);

        final ImageView imv = new ImageView();

        imv.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println(event.getSceneX());
                System.out.println(event.getSceneY());
            }
        });

        final Image image2 = new Image(Main.class.getResourceAsStream("IMG_1319.JPG"));
        imv.setImage(image2);

        final HBox pictureRegion = new HBox();

        pictureRegion.getChildren().add(imv);
        gridpane.add(pictureRegion, 1, 1);

        root.getChildren().add(gridpane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
