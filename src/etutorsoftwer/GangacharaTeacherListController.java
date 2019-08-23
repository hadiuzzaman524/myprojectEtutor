/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etutorsoftwer;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class GangacharaTeacherListController implements Initializable {

    @FXML
    private ListView<String> Tablelist;
    ObservableList list = FXCollections.observableArrayList();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
                All_Teacher_Information_DataBase obj = new All_Teacher_Information_DataBase();
        String queary = "select *from gongachora";
        ResultSet rs;
        try {
            rs = obj.getAllTeacher(queary);
            while (rs.next()) {
                String name = rs.getString("name");
                String address = rs.getString("address");
                String email = rs.getString("email");
                String mobile = rs.getString("mobile");
                String sub = rs.getString("sub");
                String education = rs.getString("education");
                String salary = rs.getString("salary");
                list.add("Name:   " + name);
                list.add("Address:   " + address);
                list.add("Email Address:   " + email);
                list.add("Mobile Number:   " + mobile);
                list.add("Interested Subject:   " + sub);
                list.add("Educational Qualification:   " + education);
                list.add("Expected Salary:   " + salary);
                list.add("");
                list.add("");

            }
            Tablelist.setItems(list);
        } catch (SQLException ex) {
            Logger.getLogger(RangpurSadarTeacherListController.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO
    }    

    @FXML
    private void BackButton(ActionEvent event) {
         FindTeacher_Rangpur_DistrictController.gangachorastage.close();
    }
    
}
