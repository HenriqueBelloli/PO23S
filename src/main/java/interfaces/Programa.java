/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author evand
 */
public class Programa {
    public static void main(String[] args) {
        
        A obj1 = new A();
        
        MinhaPrimeiraInterface obj2 = new A();
        
        A objTemp = (A) obj2;
        
        objTemp.m4(5);
        
    }
}
