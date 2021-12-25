package com.example.lab_8;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Scene scene = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("main-view.fxml")));
        stage.setResizable(false);
        stage.getIcons().add(new Image("D:\\IntelliJ IDEA Projects\\Lab_8\\src\\main\\resources\\images\\icon.png"));
        stage.setTitle("Lab_8 - \"Мои питомцы\" by Alexandr Chekunkov.");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        System.out.println("start");
        launch();
    }
}