/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etutorsoftwer;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class ForgetPasswordController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private TextField email;
    @FXML
    private TextField username;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Cancelbutton(ActionEvent event) {
        
        Student_loginController.forget_stage.close();
    }

    @FXML
    private void sendbutton(ActionEvent event) {
        
        String name=username.getText();
        String em=email.getText();
        if(name.equals("")||em.equals(""))
        {
            label.setText(" please enter your username and email ");
        }
        else 
        {
            label.setText("we will send password after  some time in your email");
        }
    }
    
}
