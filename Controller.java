package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    public Button btnClear;
    @FXML
    public Button btnSend;
    @FXML
    private TextArea textArea;
    @FXML
    private TextField textField;

    @FXML
    public void clickBtnSend(ActionEvent actionEvent) {
        textArea.appendText(textField.getText()+"\n");
        textField.clear();
        textField.requestFocus();
    }

    @FXML
    public void clickBtnClear(ActionEvent actionEvent) {
        textArea.clear();
    }

}
