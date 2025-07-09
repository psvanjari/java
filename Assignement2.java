package com.practice;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Assignement2 extends Application {
    Scene page1Scene,page2Scene;
    Stage primaryStage;

    @Override
    public void start(Stage myStage) throws Exception {
        // TODO Auto-generated method stub

        Text tex=new Text("Welcome");

        tex.setFont(new Font(26));


        Text user=new Text("Username:");
        TextField userField=new TextField();
        userField.setFocusTraversable(false);
        userField.setPromptText("Enter Username");
        userField.setMaxWidth(150);
        
        Text pass=new Text("Password:");
        PasswordField passwordField=new PasswordField();
        passwordField.setFocusTraversable(false);
        passwordField.setPromptText("Enter Password");
        passwordField.setMaxWidth(150);

        Label messageLable=new Label();
        
        
        HBox hb=new HBox(10,user,userField);
        HBox hb2=new HBox(10,pass,passwordField);

        Button button=new Button("Sign in");
        button.setPadding(new Insets(10));
        button.setAlignment(Pos.BASELINE_RIGHT);
        button.setOnAction(new EventHandler<ActionEvent>() {

            private String prefix;

            @Override
            public void handle(ActionEvent arg0) {
                // TODO Auto-generated method stub
                String userName=userField.getText();
                String passs=passwordField.getText();

                 if(userName.length()>=8 && passs.equals("c2w") ){
                    messageLable.setText("Login Successfully");
                }else{
                    messageLable.setText("Invalid Credentials");
                }

                initializePage2();
                primaryStage.setScene(page2Scene);
            }
            
        });

        VBox vb=new VBox(10,tex,hb,hb2,button,messageLable);
        vb.setAlignment(Pos.TOP_LEFT);
        vb.setPadding(new Insets(100));
        Scene myScene=new Scene(vb,500,500);
        myStage.setScene(myScene);
        page1Scene=myScene;
        primaryStage=myStage;
        
        myStage.show();
    }
    private void initializePage2(){
        Page2 page2=new Page2();
        page2.setStage(primaryStage);
        page2Scene=new Scene(page2.createScene(this::handleBackButton),1000,800);
        page2.setScene(page2Scene);

        }

        private void handleBackButton(){
        primaryStage.setScene(page1Scene);
    }
    
}
