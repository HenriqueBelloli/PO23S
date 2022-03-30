/*
Faça um programa em Java que leia um número inteiro N > 1 da entrada padrão, e a seguir leia N valores inteiros e armazene em um vetor. 
Na sequência calcule a média aritmética desses valores e imprima na saída padrão a média calculada (com duas casas decimais) e, nas linhas seguintes, somente os valores maiores que a média calculada.
Imprima os valores maiores que a média calculada na ordem em que foram inseridos no vetor.
 */
package Pratica3;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int tamanho = entrada.nextInt();
        int vetor[] = new int[tamanho];
        
        for(int i=0; i < tamanho; i++){
            vetor[i] = entrada.nextInt();
        }
        
        double media = 0;
        
        for(int i=0; i < tamanho; i++){
            media += vetor[i];
        }
        media = media/tamanho;
        
        System.out.printf("%.2f\n", media);
        for(int i=0; i < tamanho; i++){
            if (vetor[i] >  media){
                System.out.println(vetor[i]);
            }
        }
    }
}