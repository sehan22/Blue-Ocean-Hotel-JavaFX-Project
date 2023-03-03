package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
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

public class MeelPackageFormController {
    public AnchorPane meelPackageFormContext;
    public AnchorPane addMeelPackagePaneContext;
    public AnchorPane searchMeelPackagePaneContext;
    public AnchorPane updateMeelPackagePaneContext;
    public JFXButton btnClose;
    public JFXButton btnClose1;
    public JFXButton btnClose2;
    public JFXButton btnDelete;

    public void initialize(){
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

        btnClose2.setOnAction(event -> {
            Alert alert = new Alert(Alert.AlertType.WARNING , "Do you want to exit from application?" , ButtonType.YES , ButtonType.NO);
            alert.setTitle("Blue Ocean Hotel");
            Optional<ButtonType> buttonType = alert.showAndWait();
            if (buttonType.get() == ButtonType.YES) {

            }
        });

        btnDelete.setOnAction(event -> {
            Alert alert = new Alert(Alert.AlertType.WARNING , "Do you want to exit from application?" , ButtonType.YES , ButtonType.NO);
            alert.setTitle("Blue Ocean Hotel");
            Optional<ButtonType> buttonType = alert.showAndWait();
            if (buttonType.get() == ButtonType.YES) {
                setNotification("Meel Package Delete Successfully!");
            }
        });
    }

    public void addMeelPackageOnAction(ActionEvent actionEvent) {
        if (true) {
            searchMeelPackagePaneContext.setVisible(false);
            updateMeelPackagePaneContext.setVisible(false);
            addMeelPackagePaneContext.setVisible(true);
        }
    }

    public void searchMeelPackageOnAction(ActionEvent actionEvent) {
        if (true) {
            updateMeelPackagePaneContext.setVisible(false);
            addMeelPackagePaneContext.setVisible(false);
            searchMeelPackagePaneContext.setVisible(true);
        }
    }

    public void updateMeelPackageOnAction(ActionEvent actionEvent) {
        if (true) {
            searchMeelPackagePaneContext.setVisible(false);
            addMeelPackagePaneContext.setVisible(false);
            updateMeelPackagePaneContext.setVisible(true);
        }
    }

    public void btnAddMeelPackageOnAction(ActionEvent actionEvent) {
        setNotification("Room Added Succesfully!");
    }

    public void btnupdateMeelPackageOnAction(ActionEvent actionEvent) {
        setNotification("Update Room Successfully");
    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        setUi("AdminLogin");
    }

    private void setUi(String location) throws IOException {
        Stage stage = (Stage) meelPackageFormContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/" + location + ".fxml"))));
    }

    public void closeOnAction(ActionEvent actionEvent) {
        System.exit(0);
    }

    private void setNotification(String content) {
        Image image = new Image("/lk/ijse/asset/icons8-ok-96.png");
        Notifications notifications = Notifications.create();
        notifications.graphic(new ImageView(image));
        notifications.text(content);
        notifications.title("Blue Ocean Hotel Login - admin");
        notifications.hideAfter(Duration.seconds(3));
        notifications.darkStyle();
        notifications.show();
    }
}
