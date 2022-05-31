/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplos;

/**
 *
 * @author hbel
 */
public class TesteConta {
    
    public static void main(String[] args) {
        Conta oobj1 = new Conta();
        Conta oobj2 = new Conta();
        oobj1.dono ="henrique";
        oobj2.dono ="henrique";
        
        oobj1.saldo = 10;
        oobj2.saldo = 10;
        
        if (oobj1.equals(oobj2)){
            System.out.println("São iguais");
        }else{
            System.out.println("Não são");
        }
    }
}
