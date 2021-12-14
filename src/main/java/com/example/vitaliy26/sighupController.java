package com.example.vitaliy26;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;


import java.io.IOException;
import java.time.LocalDate;


public class sighupController {


    @FXML
    private Button authSighinButton;

    @FXML
    private Button GoBackButton;

    @FXML
    private PasswordField password_field;

    @FXML
    private TextField sighUPLastName;

    @FXML
    private TextField login_field;

    @FXML
    private TextField sighUPName;

    @FXML
    private Label dataLabel;

    @FXML
    private TextField SighUpCountry;

    @FXML
    private DatePicker myDatePicker;





    @FXML
    void getDate(ActionEvent event) {
        LocalDate myDate = myDatePicker.getValue();
        System.out.println(myDate.toString());
        dataLabel.setText(myDate.toString());


    }




    @FXML
    void onGoBackButton(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(sighupController.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 400);
        Stage stage = new Stage();
        stage.setTitle("Авторизація");
        stage.setScene(scene);
        stage.show();


    }




    @FXML
    void initialize() {
        authSighinButton.setOnAction(actionEvent -> {
            System.out.println("Реєстрацію заверщено");
        });

}
}



