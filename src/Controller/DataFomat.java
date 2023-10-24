/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Common.Library;
import Model.Data;
import View.Menu;

public class DataFomat extends Menu<String>{
    static String[] mc = {"Phone number", "Email", "Date", "Exit"};
    
    private Library library;
    
    public DataFomat(Data d) {
        super("====== Validate Progaram ======", mc);
        library = new Library();
    }    
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                System.out.print("Phone number: ");
                library.checkInputPhone();
                break;
            case 2:
                System.out.print("Email: ");
                library.checkInputEmail();
                break;
            case 3:
                System.out.print("Date: ");
                library.checkInputDate();
                break;
            case 4:
                System.out.println("Exit the program successfully!");
                System.exit(0);
                break;
        }
    }   

}
