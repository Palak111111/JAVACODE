
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class StudentInfo implements Serializable{
    String StudentName,Fname,MName,Address,PhoneNumber,EmailAdr,Roll,Password;

    public StudentInfo(String StudentName, String Fname, String MName, String Address, String PhoneNumber, String EmailAdr, String Roll, String Password) {
        this.StudentName = StudentName;
        this.Fname = Fname;
        this.MName = MName;
        this.Address = Address;
        this.PhoneNumber = PhoneNumber;
        this.EmailAdr = EmailAdr;
        this.Roll = Roll;
        this.Password = Password;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getMName() {
        return MName;
    }

    public void setMName(String MName) {
        this.MName = MName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getEmailAdr() {
        return EmailAdr;
    }

    public void setEmailAdr(String EmailAdr) {
        this.EmailAdr = EmailAdr;
    }

    public String getRoll() {
        return Roll;
    }

    public void setRoll(String Roll) {
        this.Roll = Roll;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    
    
}
