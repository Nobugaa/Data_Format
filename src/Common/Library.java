/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import Model.Data;

public class Library {
   
    Scanner sc = new Scanner(System.in);
    private String PHONE_VALID = "^[0-9]{10}$";
    private String EMAIL_VALID = "^[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}$";
    
    Data d = new Data();
    
    public int inputIntLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }

    public  String checkInputString() {
        //loop until user input true value
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty.");
            } else {
                return result;
            }
        }
    }

    public String checkInputPhone() {
        while (true) {
            try {
                int phoneCheck = Integer.parseInt(sc.nextLine());
                String resultCheck = String.valueOf(phoneCheck);
                if (!resultCheck.matches(PHONE_VALID)) {
                    System.err.println("Phone number must be 10 digits!");
                } else {
                    System.out.println("Phone number is valid!");
                    return resultCheck;
                }
            } catch (NumberFormatException ex) {
                System.out.print("Phone number: ");
                System.err.println("Phone number must be number!");
            }
        }
    }

    public String checkInputDate() {
        while (true) {
            try {
                String dateCheck = checkInputString();
                Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dateCheck);
                return dateCheck;
            } catch (ParseException ex) {
                System.out.print("Date: ");
                System.err.println("Date to correct format(dd/MM/yyyy)");
            }
            System.out.println("Date is valid!");
        }
    }

    public String checkInputEmail() {
        while (true) {
            String emailCheck = checkInputString();
            if (!emailCheck.matches(EMAIL_VALID)) {
                System.err.println("Email must be correct format");
                System.out.print("Email: ");
            } else {
                System.out.println("Email is valid!");
                return emailCheck;
            }
        }
    }
  
}

