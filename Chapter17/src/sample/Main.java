package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.event.*;
import javafx.geometry.*;

public class Main extends Application {

    Label response;

    public static void main(String[] args) {
        launch(args);
    }

    public void init() {
        System.out.println("In init.");
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        System.out.println("Inside start");

        // From IntelliJ:
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //primaryStage.setScene(new Scene(root, 300, 275));

        // Set the title
        primaryStage.setTitle("Hello World");

        // Createa a root node (for a flow layout)
        FlowPane rootNode = new FlowPane(10, 10);
        rootNode.setAlignment(Pos.CENTER);

        // Create a scene
        Scene myScene = new Scene(rootNode, 300, 100);

        // Set the scene on the stage
        primaryStage.setScene(myScene);

        // Create a label
        response = new Label("Push a button");

        // Create two push buttons
        Button btnUp = new Button("Up");
        Button btnDown = new Button("Down");

        // event handler using anonymous inner class
        btnUp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                response.setText("You pressed Up.");
            }
        });

        // event handler using lambda expression
        btnDown.setOnAction( (ae) -> response.setText("You pressed Down."));

        // Add the label ot the scene graph
        rootNode.getChildren().addAll(btnUp, btnDown, response);

        // Show the stage and its scene;
        primaryStage.show();
    }

    public void stop() {
        System.out.println("Stopping");
    }


}
