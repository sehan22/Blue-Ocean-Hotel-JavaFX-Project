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
import java.util.Optional;

public class RoomReservationFormController {
    public AnchorPane roomReservationFormContext;
    public AnchorPane customerDetailPaneContexct;

    public JFXButton btnClose;
    public AnchorPane reserveaRoomPaneContexct;
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

        btnClose1.setOnAction(event -> {
            Alert alert = new Alert(Alert.AlertType.WARNING , "Do you want to exit from application?" , ButtonType.YES , ButtonType.NO);
            alert.setTitle("Blue Ocean Hotel");
            Optional<ButtonType> buttonType = alert.showAndWait();
            if (buttonType.get() == ButtonType.YES) {
                System.exit(0);
            }
        });
    }

    public void closeOnAction(ActionEvent actionEvent) {
    }

    public void goReserveRoomOnAction(ActionEvent actionEvent) {
        if (true) {
            customerDetailPaneContexct.setVisible(false);
            reserveaRoomPaneContexct.setVisible(true);
        }
    }

    public void customerDetailsOnAction(ActionEvent actionEvent) {
        if (true) {
            reserveaRoomPaneContexct.setVisible(false);
            customerDetailPaneContexct.setVisible(true);
        }
    }

    public void addCustomerOnAction(ActionEvent actionEvent) {
        setNotification("Customer Added Successfully!");
    }

    public void reserveRoomOnAction(ActionEvent actionEvent) {
        setNotification("Reserve Room Successfully!");
    }

    public void goBackOnAction(ActionEvent actionEvent) throws IOException {
        setUi("receptionistLogin");
    }

    private void setUi(String ui) throws IOException {
        Stage stage = (Stage) roomReservationFormContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/" + ui + ".fxml"))));
    }

    private void setNotification(String content) {
        Image image = new Image("/lk/ijse/asset/icons8-ok-96.png");
        Notifications notifications = Notifications.create();
        notifications.graphic(new ImageView(image));
        notifications.text(content);
        notifications.title("Blue Ocean Hotel Login - Receptionist");
        notifications.hideAfter(Duration.seconds(3));
        notifications.darkStyle();
        notifications.show();
    }
}
