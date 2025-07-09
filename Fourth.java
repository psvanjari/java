package com.example;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Fourth extends Application{

    private TextField textField=new TextField();
    private long num1=0;
    private String op="";
    private boolean start=true;

    @Override
    public void start(Stage arg0) throws Exception {
        // TODO Auto-generated method stub
        textField.setFont(Font.font(20));
        textField.setPrefHeight(50);
        textField.setAlignment(Pos.CENTER_RIGHT);
        textField.setEditable(false);

         StackPane stackPane=new StackPane();
         stackPane.setPadding(new Insets(10));
         stackPane.getChildren().add(textField);

         TilePane tp=new TilePane();
         tp.setHgap(10);
         tp.setVgap(10);
         tp.setAlignment(Pos.TOP_CENTER);
         tp.getChildren().addAll (
            createButtonForNumber("7"),
            createButtonForNumber("8"),
            createButtonForNumber("9"),
            createButtonForOperation("/"),

            createButtonForNumber("4"),
            createButtonForNumber("5"),
            createButtonForNumber("6"),
            createButtonForOperation("*"),

            createButtonForNumber("1"),
            createButtonForNumber("2"),
            createButtonForNumber("3"),
            createButtonForOperation("-"),

            createButtonForNumber("0"),
            createButtonForClear("C"),
            createButtonForOperation("="),
            createButtonForOperation("+")


         );

        BorderPane root =new BorderPane();
        root.setTop(stackPane);

        root.setCenter(tp);
        root.setPadding(new Insets(2));
        Scene myScene=new Scene(root,250,300);
        arg0.setScene(myScene);
        arg0.setResizable(false);
        arg0.setTitle("Simple calcultor");
        arg0.show();

    }
    private Button createButtonForNumber(String ch){
        Button button =new Button(ch);
        button.setPrefSize(50, 50);
        button.setFont(Font.font(18));
        button.setOnAction(this::processNumbers);
        return button;
    }
    private Button createButtonForOperation(String ch){
        Button button =new Button(ch);
        button.setPrefSize(50, 50);
        button.setFont(Font.font(18));
        button.setOnAction(this::processOperators);
        return button;
    }
    private Button createButtonForClear(String ch){
        Button button =new Button(ch);
        button.setPrefSize(50, 50);
        button.setFont(Font.font(18));
        button.setOnAction(e->{
            textField.setText("");
            op="";
            start=true;
        });
        return button;
    }
    private void processNumbers(ActionEvent e){
        if(start){
            textField.setText("");
            start=false;
        }
        String value=((Button)e.getSource()).getText();
        textField.setText(textField.getText()+value);
    }
     private void processOperators(ActionEvent e){
        String value=((Button)e.getSource()).getText();
        if(!value.equals("=")){
            if(!op.isEmpty())
                return;
            num1=Long.parseLong(textField.getText());
            op=value;
            textField.setText("");
            }else{
                if(op.isEmpty())
                return;
            long num2=Long.parseLong(textField.getText());
            float result =calculate(num1,num2,op);
            textField.setText(String.valueOf(result));
            start=true;
            op="";
            }
        }
        private float calculate(long num1,long num2,String operator){
            switch(operator){
                case "+": return num1+num2;
                case "-": return num1-num2;
                case "*": return num1*num2;
                case "/": if(num2==0)
                    return 0;
                    return num1/num2;
                
                default: return 0;

            }
        }

    
    
}
