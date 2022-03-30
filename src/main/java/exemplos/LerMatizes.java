
package exemplos;

import java.util.Scanner;

public class LerMatizes {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int matriz[][] = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = entrada.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf ("%d ",matriz[i][j]);
            }
            System.out.println("");
        }

    }

}
