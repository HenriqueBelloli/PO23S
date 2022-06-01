package pratica11;

import java.util.ArrayList;

public class Loja {

    private final ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionar(Produto produto) {
        this.produtos.add(produto);
    }

    public Produto getProdutoMaisCaro() {
        Produto retorno = produtos.get(0);

        for (Produto produto : produtos) {
            if (produto.getPreco() > retorno.getPreco()) {
                retorno = produto;
            }
        }

        return retorno;
    }

    public Produto getProdutoMenosCaro() {
        Produto retorno = produtos.get(0);

        for (Produto produto : produtos) {
            if (produto.getPreco() < retorno.getPreco()) {
                retorno = produto;
            }
        }
        return retorno;
    }
}
