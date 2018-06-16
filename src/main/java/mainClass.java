/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Valenzuela
 */
public class mainClass {
    
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        
        cal.setNum1(2.2);
        cal.setNum2(3.3);
        
        System.out.println(cal.Product());
        System.out.println(cal.Suma());
    }
    
}
