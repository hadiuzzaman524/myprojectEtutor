/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etutorsoftwer;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class DatabaseSignup_connection {
    
        Connection getConnection() throws SQLException
    {
        Connection conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/createaccount", "root", "");
     
        return conn;
    }
    
    ResultSet getAllStudent() throws SQLException
    {
       // List <Information_signup> list=new ArrayList();
        
        Connection conn=getConnection();
        Statement statement=(Statement) conn.createStatement();
        
        ResultSet rs=statement.executeQuery("select *from student");
        
       /* while(rs.next())
        {
          String name=rs.getString("name");
          String instute=rs.getString("instute");
          String studentclass=rs.getString("class");
          String  email=rs.getString("email");
          String mobile=rs.getString("mobile");
          String password=rs.getString("password");
          
          Information_signup ob=new Information_signup(name,instute,studentclass,email,mobile,password);
          list.add(ob);
        }
            
        return list;*/
       return rs; 
    }

   boolean addStudent(Information_signup std) throws SQLException {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   Connection connection=getConnection();
   Statement statement=(Statement) connection.createStatement();
   String queary="insert into student values('"+std.getName()+"','"+std.getInstute() +"','"+std.getStudentclass() +"','"+std.getEmail() +"','"+std.getMobile()+"','"+std.getPassword()+"')";
   
   
   return statement.executeUpdate(queary)>0; 
    
}
   
   
}
