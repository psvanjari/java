package com.practice;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Page2 {
    Scene p2Scene;
    Stage p2Stage;
    protected Object userField;
    
    public void setScene(Scene scene){
        this.p2Scene=scene;
    }

    public void setStage(Stage stage){
        this.p2Stage=stage;
    }
    
    public VBox createScene(Runnable back){
        Text login=new Text("Welcome, user");
        Button but=new Button("Log out");
        but.setOnAction(e-> back.run());
        VBox vb=new VBox(100,login,but);
        vb.setAlignment(Pos.CENTER);
        
        return vb;
        
    }
    
   
}
