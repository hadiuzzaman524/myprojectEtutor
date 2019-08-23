/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etutorsoftwer;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class FindTeacher_Nilphamari_DistrictController implements Initializable {

    /**
     * Initializes the controller class.
     */
    public static Stage domar;
    public static Stage dimla;
    public static Stage saidpur;
    public static Stage kishorgong;
    public static Stage jaldhaka;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void DomarButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("DomerTeacherList.fxml"));

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        domar = stage;//for signup windows
    }

    @FXML
    private void SaidpurButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("SaidpurTeacherList.fxml"));

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        saidpur = stage;//for signup windows
    }

    @FXML
    private void Backbutton(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("FindTeacher_Rangpur_Division.fxml"));

        Scene scene = new Scene(root);
        Stage stage2 = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage2.setScene(scene);
        stage2.show();
    }

    @FXML
    private void JaldhakaButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("JaldhakaTeacherList.fxml"));

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        jaldhaka = stage;//for signup windows
    }

    @FXML
    private void DimlaButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("DimlaTeacherList.fxml"));

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        dimla = stage;//for signup windows
    }

    @FXML
    private void KishoreganjButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("KishorgongTeacherList.fxml"));

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        kishorgong = stage;//for signup windows
    }

}
