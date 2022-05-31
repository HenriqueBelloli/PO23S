/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

/**
 *
 * @author evand
 */
public class UsaConta3 {
    public static void main(String[] args) {
        
        ContaBancaria contas[] = new ContaBancaria[4];
        
        contas[0] = new ContaCorrente(1, "Fulano da Silva", 1200, 29.80);
        contas[1] = new ContaPoupanca(2, "Beltrano da Silva", 100, 0.5);
        contas[2] = new ContaCorrente(3, "Fulano da Silva", 12000, 29.80);
        contas[3] = new ContaPoupanca(4, "Beltrano da Silva", 100, 0.5);
        
        for (int i=0; i<contas.length; i++){
            contas[i].processar();
        }
        
        for (int i=0; i<contas.length; i++){
            System.out.println( contas[i].getInformacoes() );
        }
        
        
    }
    
}
