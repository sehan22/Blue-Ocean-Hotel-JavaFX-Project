package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import lk.ijse.db.Database;
import lk.ijse.model.Admin;
import org.controlsfx.control.Notifications;

import javax.management.Notification;
import java.io.IOException;
import java.util.Optional;

public class LoginFormController {
    public JFXTextField txtuserName;
    public JFXPasswordField txtPassword;
    public ImageView loginFormContext;
    public JFXButton btnClose;
    public AnchorPane pnCreateAccContext;
    public JFXTextField txtRegPassword;
    public JFXPasswordField txtRegUserName;
    public JFXButton btnClose1;

    public void initialize() {

        btnClose.setOnAction(event -> {
            Alert alert = new Alert(Alert.AlertType.WARNING , "Do you want to exit from application?" , ButtonType.YES , ButtonType.NO);
            alert.setTitle("Blue Ocean Hotel");
            Optional<ButtonType> buttonType = alert.showAndWait();
            if (buttonType.get() == ButtonType.YES) {
                System.exit(0);
            }
        });
    }



    public void btnLoginOnAction(ActionEvent actionEvent) throws IOException {
        String usName = txtuserName.getText();
        String psw = txtPassword.getText();

        if(usName.equals("admin") && psw.equals("1234")) {
            setUi("AdminLogin");
            setNotification("Administrator");
        }
        else if (usName.equals("resp") && psw.equals("1234")) {
            setUi("receptionistLogin");
            setNotification("Receptionist");
        }else {
            new Alert(Alert.AlertType.ERROR , "Login Failed!").showAndWait();
            txtuserName.requestFocus();
        }
    }

    public void cancelOnAction(ActionEvent actionEvent) {

    }


    public void userNameEnterOnAction(ActionEvent actionEvent) {
        txtPassword.requestFocus();
    }

    public void passwordEnterOnAction(ActionEvent actionEvent) throws IOException {
        String usName = txtuserName.getText();
        String psw = txtPassword.getText();

        if(usName.equals("admin") && psw.equals("1234")) {
            setUi("AdminLogin");
            setNotification("Administrator");
        }
        else if (usName.equals("resp") && psw.equals("1234")) {
            setUi("receptionistLogin");
            setNotification("Receptionist");
        }else {
            new Alert(Alert.AlertType.ERROR , "Login Failed!").showAndWait();
            txtuserName.requestFocus();
        }
    }

    public void createAcountOnAction(ActionEvent actionEvent) {
        pnCreateAccContext.setVisible(true);
    }

    public void backToLoginOnAction(ActionEvent actionEvent) {
        pnCreateAccContext.setVisible(false);
    }

    private void setUi(String location) throws IOException {
        Stage stage = (Stage) loginFormContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/" + location + ".fxml"))));
    }

    private void setNotification(String post) {
        Image image = new Image("/lk/ijse/asset/icons8-ok-96.png");
        Notifications notifications = Notifications.create();
        notifications.graphic(new ImageView(image));
        notifications.text("Login Succsessfully!");
        notifications.title("Blue Ocean Hotel Login - " + post);
        notifications.hideAfter(Duration.seconds(5));
        notifications.darkStyle();
        notifications.show();
    }


    public void userNmaeEnterOnAction(ActionEvent actionEvent) {
    }

    public void createAccountOnAction(ActionEvent actionEvent) {
    }
}
