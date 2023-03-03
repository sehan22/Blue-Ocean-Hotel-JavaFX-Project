package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

public class IncomeReportFormController {
    public AnchorPane incomeReportForm;
    public AnchorPane viewAnnuallyPaneContext;
    public AnchorPane viewMonthlyPaneContext;

    public JFXButton btnClose;
    public JFXButton btnClose1;

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


    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        setUi("AdminLogin");
    }

    private void setUi(String location) throws IOException {
        Stage stage = (Stage) incomeReportForm.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/" + location + ".fxml"))));
    }

    public void viewMonthlyOnAction(ActionEvent actionEvent) {
        if (true) {
            viewAnnuallyPaneContext.setVisible(false);
            viewMonthlyPaneContext.setVisible(true);
        }
    }

    public void viewAnnuallyOnAction(ActionEvent actionEvent) {
        if (true) {
            viewMonthlyPaneContext.setVisible(false);
            viewAnnuallyPaneContext.setVisible(true);
        }
    }

    public void closeOnAction(ActionEvent actionEvent) {
        System.exit(0);
    }
}
