/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Controller.DataFomat;
import Model.Data;


public class Main {
    public static void main(String[] args) {
        Data d = new Data();
        new DataFomat(d).run();
    }
    
}
