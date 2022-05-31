package pratica05;

import java.text.DecimalFormat;

public class Financeiro {

    private double saldo;

    void processarLancamento(Lancamento objLancamento) {
        DecimalFormat fmt = new DecimalFormat("0.00"); 
        
        System.out.println("Lançamento: " + (objLancamento.getTipo() == 1 ? "Receber" : "Pagar") + " - " + objLancamento.getDescricao() + " - " + fmt.format(objLancamento.getValor()));
        AlterarSaldo(objLancamento.getTipo(), objLancamento.getValor());
    }

    public void AlterarSaldo(int tipo, double valor) {
        if (tipo == 1) {
            this.saldo += valor;

        } else {
            this.saldo -= valor;

        }
    }

    public void printSaldo() {
        DecimalFormat fmt = new DecimalFormat("0.00"); 

        System.out.println("Saldo = " + fmt.format(this.saldo));
    }
}
