package com.example.vitaliy26;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;



public class appp implements Initializable {
    @FXML
    private Button pauseButton;
    private File file;
    private Media media;
    private MediaPlayer mediaPlayer;

    @FXML
    private MediaView mediaView;

    @FXML
    private Button playButton;

    @FXML
    private Button GobackButton1;

    @FXML
    private Button resetButton;

    @FXML
    void onGobackButton1(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(sighupController.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 400);
        Stage stage = new Stage();
        stage.setTitle("Авторизація");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void playButton_method(ActionEvent event) {
        mediaPlayer.play();

    }

    @FXML
    void pauseButton_method(ActionEvent event) {
        mediaPlayer.pause();

    }

    @FXML
    void resetButton_method(ActionEvent event) {
        if (mediaPlayer.getStatus() != MediaPlayer.Status.READY) {
            mediaPlayer.seek(Duration.seconds(0.0));
            mediaPlayer.play();

        }
    }

        @Override
        public void initialize (URL url, ResourceBundle resourceBundle)
        {
            file = new File("D:\\vitaliy26\\src\\Інформація про професію Програміст.mp4");
            media = new Media(file.toURI().toString());
            mediaPlayer = new MediaPlayer(media);
            mediaView.setMediaPlayer(mediaPlayer);
        }
    }




