/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etutorsoftwer;

import static etutorsoftwer.FindTeacher_Nilphamari_DistrictController.domar;
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
public class FindTeacher_Panchogor_DistrictController implements Initializable {

    /**
     * Initializes the controller class.
     */
    public static Stage atwari;
    public static Stage tatulia;
    public static Stage dabigang;
    public static Stage boda;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void AtwariButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AtwariTeacherList.fxml"));

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        atwari = stage;//for signup windows
    }

    @FXML
    private void TetuliaButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("TatuliaTeacherList.fxml"));

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        tatulia = stage;//for signup windows

    }

    @FXML
    private void Back(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("FindTeacher_Rangpur_Division.fxml"));

        Scene scene = new Scene(root);
        Stage stage2 = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage2.setScene(scene);
        stage2.show();
    }

    @FXML
    private void DebiganjButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("DabigongTeacherList.fxml"));

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        dabigang = stage;//for signup windows
    }

    @FXML
    private void BodaButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("BodaTeacherList.fxml"));

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        boda = stage;//for signup windows
    }

}
