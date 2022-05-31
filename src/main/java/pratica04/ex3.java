/*
Defina um método estático (static) chamado maior que receba quatro valores numéricos e retorne o maior deles.
 */
package pratica04;

import java.util.Random;
import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        int tam = entrada.nextInt();
        int matriz[][] = new int[tam][tam];

        for (int i=0; i<tam; i++){
            for (int j=0; j<tam; j++){
                matriz[i][j] = entrada.nextInt();
            }
        }
        printDiagonalPrincipal(matriz);
    }
    
    public static void printDiagonalPrincipal(int matriz[][]){
     
        for (int contador = 0; contador < matriz.length; contador++){
            System.out.print(matriz[contador][contador] + " ");
        }
    }
}
