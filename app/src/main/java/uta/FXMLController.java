package uta;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.scene.text.Font;

public class FXMLController {

    @FXML
    private Text title;

    @FXML
    private Label label;

    public void initialize() {
        Font poppinsBold = Font.loadFont(getClass().getResourceAsStream("/uta/Poppins-Bold.ttf"), 30);
        title.setFont(poppinsBold);
    }
}