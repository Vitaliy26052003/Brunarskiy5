package com.example.vitaliy26;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class HelloController {

    @FXML
    private PasswordField password_field;


    @FXML
    private TextField login_field;

    @FXML
    private Button loginSighUpButton;

    @FXML
    private VBox scenePane1;

    @FXML
    private Button authSighButton;

    @FXML
    private Button OthersLab;

    @FXML
    private Button Exit;




    @FXML
    void initialize() {
        authSighButton.setOnAction(event -> {
            String loginText = login_field.getText().trim();
            String loginPassword = password_field.getText().trim();
            if (!loginText.equals("") && !loginPassword.equals(""))
                loginUser(loginText, loginPassword);
            else
                System.out.println("Login and password is empty");
            authSighButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("app.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();


        });
        loginSighUpButton.setOnAction(this::handle);

    }




    private void loginUser(String loginText, String loginPassword) {
    }

    private void handle(ActionEvent actionEvent) {
        loginSighUpButton.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("sighnup.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.showAndWait();
    }



       @FXML
       public void ExitButton (ActionEvent event){
           Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
           alert.setTitle("Вихід з програми");
           alert.setContentText("Ви дійсно бажаєте вийти ? ");
           if (alert.showAndWait().get() == ButtonType.OK) {
               Stage stage = (Stage) scenePane1.getScene().getWindow();
               System.out.println("Ви успішно вийшли з програми");
               stage.close();

           }


       }




    public void OthersLab(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(sighupController.class.getResource("box.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1035, 500);
        Stage stage = new Stage();
        stage.setTitle("Інші лабораторні");
        stage.setScene(scene);
        stage.show();


    }



    





}

