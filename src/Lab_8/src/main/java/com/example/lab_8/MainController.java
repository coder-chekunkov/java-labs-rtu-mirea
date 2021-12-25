package com.example.lab_8;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController {

    public Button buttonAddNewPet;

    @FXML
    public void onClickMethod(){
        System.out.println("Добавлен новый питомец!");
    }

}