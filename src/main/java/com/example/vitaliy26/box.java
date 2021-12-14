package com.example.vitaliy26;


import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import java.lang.String;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Label;
public class box<string> implements Initializable {

    @FXML
    private CheckBox ChBSklad;

    @FXML
    private CheckBox ChBGnuch;

    @FXML
    private Button choiceBoxAnswer;

    @FXML
    private VBox scenePane;
    @FXML
    private Button RadioAnswer;

    @FXML
    private Label lblTrueAnswer;

    @FXML
    private Label sliderLabel;
    @FXML
    private int score;

    @FXML
    private RadioButton radioLay;

    @FXML
    private RadioButton radioCode;

    @FXML
    private CheckBox ChBDruz;

    @FXML
    private RadioButton radioHier;

    @FXML
    private ChoiceBox<String> choiceB;

    @FXML
    private ColorPicker myColorPicker;

    @FXML
    private CheckBox ChBPogod;

    @FXML
    private Label lblAnwerCombo;

    @FXML
    private RadioButton radioProp;

    @FXML
    private Button checkBoxAnswer;

    @FXML
    private Slider mySlider;

    @FXML
    private Label lblRadio;

    @FXML
    private ComboBox<String> comboBox;

    @FXML
    private Label lblAnswerChoice;

    private ToggleGroup radiotoggleGroup;



    public void initialize(URL url, ResourceBundle resourceBundle) {
        //Slider
        mySlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number
                    oldValue, Number newValue) {
                score = (int) mySlider.getValue();
                sliderLabel.setText(score + " балів");
            }
        });
        {
            //checkBox
            lblTrueAnswer.setText("");
            //choiceBox
            lblAnswerChoice.setText("");
            choiceB.getItems().addAll("Правильно","Неправильно");
            //comboBox
            lblAnwerCombo.setText("");
            comboBox.getItems().addAll("BorderPane", "AncorePane","VBox", "HBox");
            //Radio
            lblRadio.setText("");
            lblRadio.setText("");
            radiotoggleGroup = new ToggleGroup();
            this.radioProp.setToggleGroup(radiotoggleGroup);
            this.radioLay.setToggleGroup(radiotoggleGroup);
            this.radioHier.setToggleGroup(radiotoggleGroup);
            this.radioCode.setToggleGroup(radiotoggleGroup);

        }
    }



    @FXML
    void checkBoxAnswer(ActionEvent event) {
        String answer = "Ваша відповідь:";
        if (ChBPogod.isSelected())
            answer += "\nпогодженість";
        if (ChBGnuch.isSelected())
            answer += "\nгнучкість";
        if (ChBDruz.isSelected())
            answer += "\nдружність";
        if (ChBSklad.isSelected())
            answer += "\nскладність";

        this.lblTrueAnswer.setText(answer);
    }
    @FXML
    void choiceBoxAnswer(ActionEvent event) {
        lblAnswerChoice.setText(choiceB.getValue().toString());
    }
    @FXML
    void comboBoxPressed(ActionEvent event) {
        lblAnwerCombo.setText("Відповідь: "+comboBox.getValue().toString());
    }

    @FXML
    void RadioAnswer(ActionEvent event) {
        if (this.radiotoggleGroup.getSelectedToggle().equals(this.radioCode))
            lblRadio.setText("Відповідь: Code");
        if (this.radiotoggleGroup.getSelectedToggle().equals(this.radioHier))
            lblRadio.setText("Відповідь: Hierarchy");
        if (this.radiotoggleGroup.getSelectedToggle().equals(this.radioLay))
            lblRadio.setText("Відповідь: Layout");
        if (this.radiotoggleGroup.getSelectedToggle().equals(this.radioProp))
            lblRadio.setText("Відповідь: Properties");
    }



    @FXML
    void changeColor(ActionEvent event) {

        Color myColor = myColorPicker.getValue();
        scenePane.setBackground(new Background(new BackgroundFill(myColor,null, null)));

    }


}
