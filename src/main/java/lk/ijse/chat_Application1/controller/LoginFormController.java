package lk.ijse.chat_Application1.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {
    @FXML
    private TextField txtUserName;
    public void logInOnAction(ActionEvent event) throws IOException {
        if (!txtUserName.getText().isEmpty()&&txtUserName.getText().matches("[A-Za-z0-9][3]+")){
            Stage stage = new Stage();
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/client_form.fxml"))));
            stage.setTitle(txtUserName.getText());
            stage.setResizable(false);
            stage.centerOnScreen();
            stage.getIcons().add(new javafx.scene.image.Image("images/icon/icons8-whatsapp-48.png"));
            stage.show();
            txtUserName.clear();
        }else{
            new Alert(Alert.AlertType.ERROR, "Please enter your name").show();
        }
    }
}
