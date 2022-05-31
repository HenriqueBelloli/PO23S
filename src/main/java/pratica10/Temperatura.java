package pratica10;

import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double temperaturas[] = {26.5, 25.3, 22, 20.5, 18, 15, 13.3};
        int indice = entrada.nextInt();
        System.out.println(getTemperatura(temperaturas, indice));
    }

    static String getTemperatura(double temperaturas[], int indice) {
        String retorno;

        try {
            retorno = "Temperatura[" + indice + "]: " + temperaturas[indice];
        } catch (Exception e) {
            retorno = "Erro! Dados da exceção: " + e.getMessage();
        }

        return (retorno);
    }
}
