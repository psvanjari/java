package com.example;

import java.util.Random;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Eight extends Application {

    @Override
    public void start(Stage arg0) throws Exception {
        // TODO Auto-generated method stub
        Button button=new Button("Click me!");
       // button.setFont(new Font(20));
        button.setStyle(" -fx-font-weight: bold; -fx-border-style:solid; -fx-border-Color:GREEN;");


        button.setOnAction(e->{
            Color randomColor = getRandomColor();
            button.setBackground(new Background(new BackgroundFill(randomColor, CornerRadii.EMPTY, Insets.EMPTY)));
        });
        

        Scene myScene=new Scene(button,500,400);
        arg0.setTitle("C2w creative window");
        arg0.setScene(myScene);
        arg0.show();


    }
    private Color getRandomColor() {
        Random random = new Random();
        return Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256));
    }
    
}
