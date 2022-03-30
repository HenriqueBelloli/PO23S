
package exemplos;

import java.util.Scanner;

public class Iniciais {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome = entrada.nextLine();
        nome = nome.trim();
        
        boolean lImprimeProximaLetra = true;
        
        for(int i = 0; i < nome.length();  i++){
            
            if (nome.charAt(i) == ' '){
                lImprimeProximaLetra = true;
            
            }else if (lImprimeProximaLetra){
                System.out.print(nome.charAt(i));
                lImprimeProximaLetra =  false;
            }
        }

    }
}
