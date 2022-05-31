/*
Faça um programa em Java que receba uma frase (string) da entrada padrão e imprima essa frase invertida.
Na próxima linha imprima o comprimento dessa frase (número de caracteres).
 */
package pratica03;

import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String frase = entrada.nextLine();
        
        for (int n = frase.length()-1; n >= 0; n--){
            System.out.print(frase.charAt(n));
        }
        
        System.out.println("\n"+frase.length());
    }
    
}
