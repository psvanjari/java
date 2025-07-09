package com.example;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class First extends Application {

    @Override
    public void start(Stage arg0) throws Exception {
        // TODO Auto-generated method stub
        TextField userField=new TextField();
        userField.setFocusTraversable(false);
        userField.setPromptText("Enter any text to print on console");
        

        Button button=new Button("Print Text");
        
        button.setStyle("-fx-background-Color:BLUE; -fx-font-weight: bold;");
        button.setAlignment(Pos.TOP_LEFT);

        button.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                // TODO Auto-generated method stub
                System.out.println(userField);
            }
            
        });

        VBox vb=new VBox(20,userField,button);
        
        vb.setAlignment(Pos.CENTER);

        vb.setStyle("-fx-background-Color:YELLOW");
        

        Scene myScene=new Scene(vb,500,500);
    
        arg0.setScene(myScene);
        arg0.show();
    }
    
}
