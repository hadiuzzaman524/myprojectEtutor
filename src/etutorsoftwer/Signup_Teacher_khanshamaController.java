/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etutorsoftwer;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class Signup_Teacher_khanshamaController implements Initializable {

    @FXML
    private TextField name;
    @FXML
    private TextField address;
    @FXML
    private TextField email;
    @FXML
    private TextField mobile;
    @FXML
    private TextField educationalqualification;
    @FXML
    private Label label;
    @FXML
    private TextField interestedsubject;
    @FXML
    private TextField Salary;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void submit(ActionEvent event) throws SQLException {
                String nam = name.getText();
        String add = address.getText();
        String emai = email.getText();
        String mob = mobile.getText();
        String edu = educationalqualification.getText();
        String sub = interestedsubject.getText();
        String salar = Salary.getText();

        //fixed for every district
        All_Teacher_Information_Geter obj = new All_Teacher_Information_Geter(nam, add, emai, mob, edu, sub, salar);

        //class name vary for every district 
        All_Teacher_Information_DinajpurDatabase teacher = new All_Teacher_Information_DinajpurDatabase();

        String queary = "insert into khanshama values('" + obj.getName() + "','" + obj.getAddress() + "','" + obj.getEmail() + "','" + obj.getMobile() + "','" + obj.getInterestedsubject() + "','" + obj.getEducation() + "','" + obj.getSalary() + "')";

        if (!nam.equals("") && !add.equals("") && !emai.equals("") && !mob.equals("") && !edu.equals("") && !sub.equals("") && !salar.equals("")) {
            boolean m = false;
            m = teacher.addTeacher(obj, queary);
            if (m == true) {
                label.setText("Added account successfully");
            }
        } else {
            label.setText("Empty from.Please fillup it");
        }
    }

    @FXML
    private void close(ActionEvent event) throws IOException {
           Parent root = FXMLLoader.load(getClass().getResource("Teacher_Dinajpur_District.fxml"));

        Scene scene = new Scene(root);
        Stage stage2 = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage2.setScene(scene);
        stage2.show();
    }

    @FXML
    private void home(ActionEvent event) throws IOException {
             Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

        Scene scene = new Scene(root);
        Stage stage2 = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage2.setScene(scene);
        stage2.show();
    }
    
}
