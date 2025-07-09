package com.example;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Third extends Application{

    @Override
    public void start(Stage arg0) throws Exception {
        // TODO Auto-generated method stub

        Label label=new Label();
        TextField userField=new TextField();
        userField.setPromptText("Enter the number");
        userField.setFocusTraversable(false);
        userField.setMaxWidth(125);

        Button button=new Button("Square");
        button.setStyle("-fx-background-Color: Blue; -fx-font-weight: bold;");
        Button button2=new Button("Square Root");
        button2.setStyle("-fx-background-Color: Blue; -fx-font-weight: bold;");

        button.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                // TODO Auto-generated method stub
                try{int number=Integer.parseInt(userField.getText());
                label.setText("Square of number is "+(number*number));
                }catch(Exception e){
                    label.setText("You enter invalid details");
                }
            }
            
        });
        button2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                // TODO Auto-generated method stub
                try{int number=Integer.parseInt(userField.getText());
                if(number<0){
                    label.setText("Cannot find the square");
                }else{
                    double squrt=Math.sqrt(number);
                    label.setText("Square root of number is "+squrt);
                }}catch(Exception e){
                    label.setText("You enter invalid details");

                }
            }
            
        });

        VBox vb=new VBox(10,userField,button,button2,label);
        vb.setStyle( "-fx-background-Color:YELLOW");
        vb.setAlignment(Pos.CENTER);
        Scene myScene=new Scene(vb,800,500);
        arg0.setScene(myScene);
        arg0.setTitle("Core2web");

        arg0.show();
    }
    
}
