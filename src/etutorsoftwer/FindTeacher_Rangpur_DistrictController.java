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
public class FindTeacher_Rangpur_DistrictController implements Initializable {

    /**
     * Initializes the controller class.
     */
    public static Stage stage;
    public static Stage gangachorastage;
    public static Stage kaunia;
    public static Stage mithapukur;
    public static Stage pirgacha;
    public static Stage pirgang;
    public static Stage badargang;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void Rangpursadarbutton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("RangpurSadarTeacherList.fxml"));

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        this.stage = stage;//for signup windows

    }

    @FXML
    private void Badarganjbutton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("BadargangTeacherList.fxml"));

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        badargang = stage;

    }

    @FXML
    private void Mithapukurbutton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("MithapukurTeacherList.fxml"));

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        mithapukur = stage;//for signup windows

    }

    @FXML
    private void prirgachabutton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("PirgachaTeacherList.fxml"));

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        pirgacha = stage;//for signup windows

    }

    @FXML
    private void Pirganjbutton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("PirgangTeacherList.fxml"));

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        pirgang = stage;//for signup windows

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
    private void Kauniabutton(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("KauniaTeacherList.fxml"));

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        kaunia = stage;//for signup windows
    }

    @FXML
    private void Gangacharabutton(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("GangacharaTeacherList.fxml"));

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        gangachorastage = stage;//for signup windows
    }

}
