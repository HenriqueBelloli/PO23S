/*
Faça um programa em Java que leia dois conjuntos de número de tamanho N>1 e imprima no console a interseção dos
dois conjuntos, ou seja, quais números estão em ambos os conjuntos.
 */
package Pratica3;

import java.util.Scanner;

public class ex2 {

    public static boolean estaContido(int valor, int matriz[]){ 
        
        for (int elemento : matriz){
            
            if(elemento == valor){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int tamanho = entrada.nextInt();
        int vetor1[] = new int[tamanho];
        int vetor2[] = new int[tamanho];
        
        for(int i=0; i < tamanho; i++){
            vetor1[i] = entrada.nextInt();
        }

        for(int i=0; i < tamanho; i++){
            vetor2[i] = entrada.nextInt();
        }    
        
        for (int valor : vetor1){
            
            if (estaContido(valor, vetor2)){
                System.out.println(valor);
            }
        }
        
    }

    
}
