/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etutorsoftwer;

import static etutorsoftwer.FindTeacher_Rangpur_DistrictController.mithapukur;
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
public class FindTeacher_Dinajpur_DistrictController implements Initializable {

    /**
     * Initializes the controller class.
     */
    public static Stage birgong;
    public static Stage fulbari;
    public static Stage bochagong;
    public static Stage kahrol;
    public static Stage khansama;
    public static Stage chirirbandar;
    public static Stage parbatipur;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void BirganjButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Birgong_TeacherList.fxml"));

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        birgong = stage;//for signup windows

    }

    @FXML
    private void FulbariButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("FulbariTeacherList.fxml"));

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        fulbari = stage;//for signup windows
    }

    @FXML
    private void BochaganjButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("BochagongTeacherList.fxml"));

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        bochagong = stage;//for signup windows
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
    private void KaharolButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("KaharolTeacherList.fxml"));

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        kahrol = stage;//for signup windows
    }

    @FXML
    private void KhanshamaButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("KhansamaTeacherList.fxml"));

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        khansama = stage;//for signup windows
    }

    @FXML
    private void ChirirbandarButton(ActionEvent event) throws IOException {
          Parent root = FXMLLoader.load(getClass().getResource("ChirirbandarTeacherList.fxml"));

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        chirirbandar = stage;//for signup windows
    }

    @FXML
    private void ParbatipurButton(ActionEvent event) throws IOException {
             Parent root = FXMLLoader.load(getClass().getResource("PabatipurTeacherList.fxml"));

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
         parbatipur= stage;//for signup windows
    }

}
