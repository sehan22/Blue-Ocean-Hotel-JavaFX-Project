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
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;

import java.io.IOException;
import java.util.Optional;

public class RoomManagementForm1Controller {
    public AnchorPane roomManagementFormContext;
    public AnchorPane addRoomPaneContext;
    public AnchorPane searchRoomPaneContext;
    public AnchorPane updateRoomPaneContext;
    public JFXTextField txtRoomAddRoomType;
    public JFXPasswordField txtRoomAddRoomCode;
    public JFXButton btnClose;
    public JFXTextField txtRoomSearchType;
    public JFXPasswordField txtRoomSearch;
    public JFXButton btnClose1;
    public JFXButton btnClose2;
    public JFXButton btnDeleteRoom;
    public JFXButton btnUpdateRoom;
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
                System.exit(0);
            }
        });

        btnDelete.setOnAction(event -> {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION , "Are you sure? Do you want to delete room data?" , ButtonType.YES , ButtonType.NO);
            alert.setTitle("Blue Ocean Hotel");
            Optional<ButtonType> buttonType = alert.showAndWait();
            if (buttonType.get() == ButtonType.YES) {
            }
        });

        btnUpdateRoom.setOnAction(event -> {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION , "Are you sure? Do you want to update room data?" , ButtonType.YES , ButtonType.NO);
            alert.setTitle("Blue Ocean Hotel");
            Optional<ButtonType> buttonType = alert.showAndWait();
            if (buttonType.get() == ButtonType.YES) {
                setNotification("Room Data Updated Succesfully!");
            }
        });


    }

    public void addRoomOnAction(ActionEvent actionEvent) {
        if (true) {
            searchRoomPaneContext.setVisible(false);
            updateRoomPaneContext.setVisible(false);
            addRoomPaneContext.setVisible(true);
        }

    }

    public void searchRoomOnAcion(ActionEvent actionEvent) {
        if (true) {
            addRoomPaneContext.setVisible(false);
            updateRoomPaneContext.setVisible(false);
            searchRoomPaneContext.setVisible(true);
        }
    }

    public void updateRoomOnAction(ActionEvent actionEvent) {
        if (true) {
            addRoomPaneContext.setVisible(false);
            searchRoomPaneContext.setVisible(false);
            updateRoomPaneContext.setVisible(true);
        }
    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        setUi("AdminLogin");
    }

    private void setUi(String location) throws IOException {
        Stage stage = (Stage) roomManagementFormContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/" + location + ".fxml"))));
    }

    public void userNameEnterOnAction(ActionEvent actionEvent) {
    }

    public void closeOnAction(ActionEvent actionEvent) {
    }

    public void btnSearchRoomOnAction(ActionEvent actionEvent) {
    }

    public void goBackAdminLoginOnAction(MouseEvent mouseEvent) {
    }

    public void btnAddRoomOnAction(ActionEvent actionEvent) {
        setNotification("Room Added Successfully!");
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
