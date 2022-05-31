/*
Faça um programa em Java que leia dois parâmetros da entrada padrão, sendo o primeiro um texto qualquer e o
segundo uma palavra de pesquisa. O programa deve contar quantas vezes a palavra de pesquisa aparece no texto 
e imprimir na saída padrão.
 */
package pratica03;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String texto = entrada.nextLine();
        String palavra  = entrada.next();
        int repeticoes = 0;

         for (int i = 0; i < texto.length(); i++) {
            if (texto.substring(i).startsWith(palavra)) {
                repeticoes ++;
            }
        }
        System.out.println(palavra + "=" + repeticoes);
        
    }
}
