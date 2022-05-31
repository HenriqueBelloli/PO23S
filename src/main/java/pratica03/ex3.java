/*
    Faça um programa em Java para ler um número arbitrário de strings (frases compostas por palavras e espaços em branco) da
    entrada padrão. A entrada não deve usar acentuação nas palavras! A leitura deve ser encerrada ao ler a string "FIM" 
    (todas as letras maiúsculas). Na sequência, conte e imprima o número de vogais contidas nas strings recebidas da 
    entrada padrão.
 */
package pratica03;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String frase;
        int vogais[] = new int[5];

        do{
            frase = entrada.nextLine();

            for (int n = 0; n < frase.length(); n++){
                char letra = frase.toLowerCase().charAt(n);

                switch (letra) {
                    case 'a':
                        vogais[0]++;
                        break;
                    case 'e':
                        vogais[1]++;
                        break;
                    case 'i':
                        vogais[2]++;
                        break;
                    case 'o':
                        vogais[3]++;
                        break;
                    case 'u':
                        vogais[4]++;
                        break;
                }
            }

        }while(!frase.equals("FIM"));

        System.out.println("a=" + vogais[0]);
        System.out.println("e=" + vogais[1]);
        System.out.println("i=" + vogais[2]);
        System.out.println("o=" + vogais[3]);
        System.out.println("u=" + vogais[4]);
  
    }
}