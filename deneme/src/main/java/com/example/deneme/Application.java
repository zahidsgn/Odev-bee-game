package com.example.deneme;
import java.io.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        scene.getStylesheets().add("ApplicationStyle.css");
        stage.show();
    }





    public static void main (String[] args)  {

        launch();
    }

   }















