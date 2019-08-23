/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etutorsoftwer;

/**
 *
 * @author ASUS
 */
public class All_Teacher_Information_Geter {
   
    private String name;
    private String address;
    private String email;
    private String mobile;
    private String education;
    private String interestedsubject;
    private String salary;

    public All_Teacher_Information_Geter(String name, String address, String email, String mobile, String education, String interestedsubject, String salary) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.mobile = mobile;
        this.education = education;
        this.interestedsubject = interestedsubject;
        this.salary = salary;
    }

    public All_Teacher_Information_Geter() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void setInterestedsubject(String interestedsubject) {
        this.interestedsubject = interestedsubject;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEducation() {
        return education;
    }

    public String getInterestedsubject() {
        return interestedsubject;
    }

    public String getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "All_Teacher_Information_Geter{" + "name=" + name + ", address=" + address + ", email=" + email + ", mobile=" + mobile + ", education=" + education + ", interestedsubject=" + interestedsubject + ", salary=" + salary + '}';
    }
    
   
                
               
                
    
}
