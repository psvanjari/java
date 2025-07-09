package com.practice;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class PageA3 {
    public static Scene createScene(int screenNum,Stage stage,Runnable back){
        BorderPane layout=new BorderPane();
        layout.setStyle("-fx-background-color: " );

         Button label = new Button("Screen " + screenNum);
        label.setDisable(true);
        label.setStyle("-fx-font-size: 16px; -fx-background-color: transparent; -fx-text-fill: white;");
        BorderPane.setAlignment(label, Pos.CENTER);
        BorderPane.setMargin(label, new Insets(20, 0, 0, 0));
        layout.setTop(label);

        // Back button
        Button backBtn = new Button("Back");
        backBtn.setStyle("-fx-font-size: 14px; -fx-background-color: white;");
        backBtn.setOnAction(e -> back.run());
        layout.setBottom(backBtn);
        BorderPane.setAlignment(backBtn, Pos.CENTER);
        BorderPane.setMargin(backBtn, new Insets(0, 0, 20, 0));

        return new Scene(layout, 400, 300);
    }
}
