/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etutorsoftwer;


public class Information_signup {
    
   
    private String name;
 
    private String instute;
  
    private String studentclass;
   
    private String email;

    private String mobile;
  
    private String password;

    public Information_signup(String name, String instute, String studentclass, String email, String mobile, String password) {
        this.name = name;
        
        this.instute = instute;
        
        this.studentclass = studentclass;
        
        this.email = email;
        
        this.mobile = mobile;
        
        this.password = password;
    }

    public Information_signup() {
    }

    public String getName() {
        return name;
    }

    public String getInstute() {
        return instute;
    }

    public String getStudentclass() {
        return studentclass;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInstute(String instute) {
        this.instute = instute;
    }

    public void setStudentclass(String studentclass) {
        this.studentclass = studentclass;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Information_signup{" + "name=" + name + ", instute=" + instute + ", studentclass=" + studentclass + ", email=" + email + ", mobile=" + mobile + ", password=" + password + '}';
    }
    
}
