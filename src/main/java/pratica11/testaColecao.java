package pratica11;

public class testaColecao {

    public static void main(String[] args) {
        MinhaColecao colecao = new MinhaColecao();

        colecao.adicionar("Fusca");
        colecao.adicionar("Gol");
        colecao.adicionar("Corsa");
        colecao.adicionar("Fusca");
        colecao.remover("Fusca");
        colecao.imprimir();
    }

}
