package pratica11;

import java.util.ArrayList;

public class RemoverValores {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(13);
        numeros.add(3);
        numeros.add(17);
        numeros.add(5);
        numeros = removerImpares(numeros);
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }
    }

    public static ArrayList<Integer> removerImpares(ArrayList<Integer> valores) {
        ArrayList<Integer> retorno = new ArrayList<>();

        for (Integer val : valores) {
            if ((val % 2) == 0) {
                retorno.add(val);
            }
        }

        return retorno;
    }
}
