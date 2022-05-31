package excecao;

import heranca.ContaCorrente;

public class TestaConta {
    public static void main(String[] args) throws SaldoInsuficienteException {
        ContaCorrente cc = new ContaCorrente(1, "Aguiar", 100, 29.9);
        
        cc.sacar(150);
        
        cc.depositar(10);
        
        System.out.println(cc.getInformacoes());
    }
}
