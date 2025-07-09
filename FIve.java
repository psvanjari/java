package com.example;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FIve extends Application{

    @Override
    public void start(Stage arg0) throws Exception {
        // TODO Auto-generated method stub
        PasswordField pass=new PasswordField();
        pass.setPromptText("Enter password");
        pass.setFocusTraversable(false);

        Button button=new Button("Print Passwprd");
        button.setStyle("-fx-background-Color:BLUE; -fx-font-weight: bold;");
        button.setMaxWidth(100);
        button.setOnAction(e->{
                String password=pass.getText();
                System.out.println("Enter password "+ password);
        }
        );

        VBox vb=new VBox(10,pass,button);
        vb.setStyle("-fx-padding: 20; -fx-alignment: center; -fx-background-Color:YELLOW");

        vb.setAlignment(Pos.CENTER);

        Scene myScene=new Scene(vb,500,500);
        arg0.setScene(myScene);
        arg0.setTitle("Core2web");
        arg0.show();
    }
    
}
