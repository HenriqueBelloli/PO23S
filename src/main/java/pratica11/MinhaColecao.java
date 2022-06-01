package pratica11;

import java.util.ArrayList;

public class MinhaColecao {

    private final ArrayList<String> carros = new ArrayList<>();

    public void adicionar(String nome) {

        if (!carros.contains(nome)) {
            this.carros.add(nome);
        }

    }

    public void remover(String nome) {
        this.carros.remove(nome);
    }

    public void imprimir() {
        if (carros.isEmpty()) {
            System.out.println("Lista vazia!");
        } else {

            for (int i = 0; i < carros.size(); i++) {
                System.out.println(i+1 + "-" + this.carros.get(i));
            }
        }
    }
}
