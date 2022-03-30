/*
Defina um método estático (static) chamado maior que receba quatro valores numéricos e retorne o maior deles.
 */
package Pratica4;

public class ex2 {

    public static void main(String[] args) {
        int vetor[] = {1,-2,3,4,-5,6,-7};
        int maior = procuraMaiorValor(vetor);
        System.out.println(maior);
    }
    
    public static int procuraMaiorValor(int vetor[]){

        int maior = vetor[0];
        
        for (int contador = 0; contador < vetor.length; contador++){
            
            if (vetor[contador] > maior){
                maior = vetor[contador];
            }
        }
        
        return maior;
    }
}
