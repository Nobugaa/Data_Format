/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Data {
    private String phoneNumber;
    private String email;
    private String date;

    public Data(String phoneNumber, String email, String date) {
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.date = date;
    }

    public Data() {
        
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public boolean isPhoneNumberValid() {
        return phoneNumber != null && phoneNumber.matches("^[0-9]{10}$");
    }

    public boolean isEmailValid() {
        return email != null && email.matches("^[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}$");
    }

    public boolean isDateValid() {
        if (date != null) {
            try {
                new SimpleDateFormat("dd/MM/yyyy").parse(date);
                return true;
            } catch (ParseException e) {
                return false;
            }
        }
        return false;
    }
    
}
