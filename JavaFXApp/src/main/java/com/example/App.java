package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        TextField textField = new TextField();
        textField.setPromptText("Введіть текст: ");

        Button displayButton = new Button("Вивести текст");
        displayButton.setOnAction(e -> {
            String inputText = textField.getText();
            System.out.println("Введений текст: " + inputText);
        });

        VBox root = new VBox(20, textField, displayButton);
        root.setStyle("-fx-padding: 15; -fx-alignment: center;");

        Scene scene = new Scene(root, 400, 300);

        primaryStage.setTitle("JavaFX TextField Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}