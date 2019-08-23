/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etutorsoftwer;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
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
public class Signup_pageController implements Initializable {

    @FXML
    private TextField name;
    @FXML
    private TextField instute;
    @FXML
    private TextField studentclass;
    @FXML
    private TextField email;
    @FXML
    private TextField mobile;
    @FXML
    private TextField password;
    @FXML
    private Label label;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void close(ActionEvent event) throws IOException {
       
      Student_loginController.stage.close();
    }

    @FXML
    private void createButton(ActionEvent event) throws SQLException {
        
        DatabaseSignup_connection ob=new DatabaseSignup_connection();
        
       // List<Information_signup> list=ob.getAllStudent();
       
       String na=name.getText();
       String ins=instute.getText();
       String stdclass=studentclass.getText();
       String em=email.getText();
       String mob=mobile.getText();
       String pass=password.getText();
       
       boolean flag=false; 
       if(!na.equals("")&&!ins.equals("")&&!stdclass.equals("")&&!em.equals("")&&!mob.equals("")&&!pass.equals(""))
       {
        Information_signup obj=new Information_signup(na,ins,stdclass,em,mob,pass);
        flag=ob.addStudent(obj);
       }   
     
       
       if(flag==true)
       {
           label.setText("Added Successfully");
       }
       else 
       {
           label.setText("Please fill those information");
       }
        
        
    }
    
}
