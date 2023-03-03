package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;

import java.io.IOException;
import java.util.Objects;
import java.util.Optional;

public class AdminLoginController {
    public AnchorPane adminFormcontext;
    public JFXButton btnClose;

    public void initialize(){
        btnClose.setOnAction(event -> {
            Alert alert = new Alert(Alert.AlertType.WARNING , "Do you want to exit from application?" , ButtonType.YES , ButtonType.NO);
            alert.setTitle("Blue Ocean Hotel");
            Optional<ButtonType> buttonType = alert.showAndWait();
            if (buttonType.get() == ButtonType.YES) {
                System.exit(0);
            }
        });
    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        setUi("LoginForm");
        setNotification("Admin");
    }

    public void roomManagementOnAction(ActionEvent actionEvent) throws IOException {
        setUi("RoomManagementForm1");
    }

    public void meelsPackageOnAction(ActionEvent actionEvent) throws IOException {
        setUi("MeelPackageForm");
    }

    public void incomeReportOnAction(ActionEvent actionEvent) throws IOException {
        setUi("IncomeReportForm");
    }

    public void closeOnAction(ActionEvent actionEvent) {
    }

    private void setUi(String location) throws IOException {
        Stage stage = (Stage) adminFormcontext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/" + location + ".fxml"))));
    }

    private void setNotification(String post) {
        Image image = new Image("/lk/ijse/asset/icons8-ok-96.png");
        Notifications notifications = Notifications.create();
        notifications.graphic(new ImageView(image));
        notifications.text("Logout Succsessfully!");
        notifications.title("Blue Ocean Hotel Login - " + post);
        notifications.hideAfter(Duration.seconds(5));
        notifications.darkStyle();
        notifications.show();
    }
}
