package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Six extends Application{

    private final String FIXED_USERNAME = "Core2web";
    private final String FIXED_PASSWORD = "Core2web";

    @Override
    public void start(Stage arg0) throws Exception {
        // TODO Auto-generated method stub
        Label label=new Label("You are Welcome!!!");
        TextField userField=new TextField();
        userField.setFocusTraversable(false);
        userField.setPromptText("Enter user name as Core2web");

        PasswordField pass=new PasswordField();
        pass.setFocusTraversable(false);
        pass.setPromptText("Enter password as Core2web");

        Button button=new Button("Login");
        button.setStyle("-fx-background-Color:BULE; -fx-font-weight: bold;");
        button.setOnAction(e->{
                String inputUsername = userField.getText();
            String inputPassword = pass.getText();

            if(inputUsername.equals(FIXED_USERNAME) && inputPassword.equals(FIXED_PASSWORD)){
                    label.setText("You are Welcome");
            }else{
                label.setText("Invalid");
            }
        });

        VBox vb=new VBox(10,userField,pass,button,label);
        vb.setStyle("-fx-padding: 20; -fx-alignment: center; -fx-background-Color:YELLOW");
        

        Scene myScene=new Scene(vb,500,500);
        arg0.setTitle("Core2web");
        arg0.setScene(myScene);
        arg0.show();
    }
    
}
