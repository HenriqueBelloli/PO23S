package pratica10;

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        try {
            int numero = entrada.nextInt();
            System.out.println(numero*2);
        } catch (Exception e) {
            System.out.println("Entrada Incorreta: informe somente inteiros.");
        }
    }
}
