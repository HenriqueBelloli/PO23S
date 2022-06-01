package pratica11;

public class testaLoja {

    public static void main(String[] args) {
        Loja loja = new Loja();
        loja.adicionar(new Produto("calça", 150.50));
        loja.adicionar(new Produto("camisa", 990.50));
        loja.adicionar(new Produto("gravata", 950.50));
        loja.adicionar(new Produto("jaqueta", 350.50));
        System.out.println("Produto mais caro: " + loja.getProdutoMaisCaro().getNome());
        System.out.println("Produto menos caro: " + loja.getProdutoMenosCaro().getNome());
    }
}
