package com.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Seven extends Application {

    @Override
    public void start(Stage arg0) throws Exception {
        // TODO Auto-generated method stub
        Label label=new Label();
        TextField userField=new TextField();
        userField.setPromptText("Enter the  string");
        userField.setFocusTraversable(false);

        Button button=new Button("Check");
        button.setStyle("-fx-background-Color:BLUE; -fx-font-weight: bold;");
                button.setFont(new Font(20));

        button.setOnAction(e->{
            String input = userField.getText().replaceAll("\\s+", "").toLowerCase();

            if (input.isEmpty()) {
                label.setText("Please enter a valid string.");
                return;
            }

            if (isPalindrome(input)) {
                label.setText(" It is a palindrome!");
            } else {
                label.setText(" Not a palindrome.");
            }
        });

        VBox vb=new VBox(10,userField,button,label);
        vb.setAlignment(Pos.CENTER);
        vb.setPadding(new Insets(20));
        vb.setStyle("-fx-background-Color:RED");


        Scene scene = new Scene(vb, 500, 500);
        arg0.setTitle("Palindrome Checker");
        arg0.setScene(scene);
        arg0.show();

    }
    private boolean isPalindrome(String str){
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
    
}
