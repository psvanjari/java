package com.example;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Second extends Application {

    @Override
    public void start(Stage myStage) throws Exception {

        Label label=new Label();


        TextField userField=new TextField();
        userField.setFocusTraversable(false);

        
        Button button=new Button("Print Text");
        button.setStyle("-fx-background-Color:BLUE; -fx-font-weight: bold;");
        button.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                // TODO Auto-generated method stub
                label.setText(userField.getText());
            }
            
        });



        VBox vb=new VBox(10,userField,button,label);
        vb.setStyle("-fx-background-Color:YELLOW");

        vb.setPadding(new Insets(10));
        vb.setAlignment(Pos.CENTER);

        Scene myScene=new Scene(vb,500,500);
        myStage.setScene(myScene);
       myStage.show();

       
    }
    
}
