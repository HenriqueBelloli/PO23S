package pratica10;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {

        int aceitas = 0;
        float numero, soma = 0, media;
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            try {
                numero = entrada.nextFloat();
                aceitas++;
            } catch (Exception e) {
                numero = 0;
                entrada.next();
            }

            soma += numero;
        }
        media = (soma / 10);
        System.out.printf("Entradas aceitas: %d, média: %.2f", aceitas, media);
    }
}
