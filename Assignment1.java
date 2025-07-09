package com.practice;

import java.awt.Dialog.ModalityType;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Assignment1 extends Application {
    private Stage stage1,stage2;
    @Override
    public void start(Stage arg0) throws Exception {
        // TODO Auto-generated method stub
        stage1=creatStage1();
        stage2=creatStage2();


        stage1.show();
    }
    private Stage creatStage1(){
        Stage stage=new Stage(StageStyle.DECORATED);
        stage.setTitle("Screen 1");

        VBox root=new VBox(10);
        Button button=new Button("Open second stage");
        button.setOnAction(e->{
            stage2.show();
        });
        root.getChildren().add(button);
        stage.setScene(new Scene(root,500,500));
        return stage;

    }
    private Stage creatStage2(){
         Stage stage=new Stage(StageStyle.DECORATED);
        stage.setTitle("Screen 2");

        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(stage2 );

        VBox root=new VBox(10);
        Button button=new Button("Close second stage");
        button.setOnAction(e->{
            stage2.close();
        });
        root.getChildren().add(button);
        stage.setScene(new Scene(root,500,500));
        return stage;
    }
    
}
