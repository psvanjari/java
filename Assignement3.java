package com.practice;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Assignement3 extends Application {

    Stage primaryStage;
    @Override
    public void start(Stage arg0) throws Exception {
        // TODO Auto-generated method stub
       
        primaryStage=arg0;

        VBox mainL=new VBox(15);
        mainL.setAlignment(Pos.CENTER);
        
        for(int i=1;i<=5;i++){
            int screenNum=i;
            Button btn=new Button("Screen "+screenNum);
            btn.setPrefHeight(200);
            btn.setStyle("-fx-font-size: 14px;");
            btn.setOnAction(e -> {
                Scene screen = PageA3.createScene(screenNum, primaryStage, () -> {
                    try {
                        showMainMenu();
                    } catch (Exception e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                });
                primaryStage.setScene(screen);
            });
            mainL.getChildren().add(btn);
        }

        Scene myScene=new Scene(mainL,500,400);
        primaryStage.setTitle("5 screen");
        primaryStage.setScene(myScene);
        primaryStage.show();


    }
    void showMainMenu() throws Exception{
        start(primaryStage);
    }
    
}
