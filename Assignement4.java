package com.practice;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Stack;

public class Assignement4 extends Application {

    private Stage primaryStage;
    private Stack<Scene> sceneStack = new Stack<>();

    @Override
    public void start(Stage stage) {
        primaryStage = stage;
        showMainScreen();
    }

    private void showMainScreen() {
        BorderPane layout = new BorderPane();
        

        Text title = new Text("Main Screen");
        layout.setTop(title);
        BorderPane.setAlignment(title, javafx.geometry.Pos.CENTER);

        Button next = new Button("Go to Level 1");
        layout.setCenter(next);
        next.setOnAction(e -> showLevel("Level 1", "Go to Level 2"));

        Scene scene = new Scene(layout, 400, 300);
        sceneStack.clear();  
        sceneStack.push(scene);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Multi-Level Navigation");
        primaryStage.show();
    }

    private void showLevel(String levelName, String nextLabel) {
        BorderPane layout = new BorderPane();
        

        Text title = new Text(levelName);
        layout.setTop(title);
        BorderPane.setAlignment(title, javafx.geometry.Pos.CENTER);

        Button next = new Button(nextLabel);
        layout.setCenter(next);

        Button back = new Button("Back");
        layout.setBottom(back);
        BorderPane.setAlignment(back, javafx.geometry.Pos.CENTER);

        
        next.setOnAction(e -> {
            if (levelName.equals("Level 1")) {
                showLevel("Level 2", "Go to Level 3");
            } else if (levelName.equals("Level 2")) {
                showLevel("Level 3",  "Go to Main Screen");
            } else if (levelName.equals("Level 3")) {
                showMainScreen();  
            }
        });

        // Handle Back button
        back.setOnAction(e -> {
            if (sceneStack.size() > 1) {
                sceneStack.pop();  // Remove current
                primaryStage.setScene(sceneStack.peek());  // Show previous
            }
        });

        Scene scene = new Scene(layout, 400, 300);
        sceneStack.push(scene);
        primaryStage.setScene(scene);
    }

    
}
