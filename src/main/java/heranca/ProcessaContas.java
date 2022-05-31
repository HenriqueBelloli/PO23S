package heranca;

public class ProcessaContas {
    private double saldoTotal = 0;
    
    public void bonificar(ContaBancaria conta){
        if (conta instanceof ContaCorrente){
            ContaCorrente contaCorrente = (ContaCorrente) conta;
            if (contaCorrente.getTarifa() < 10){
                conta.depositar( conta.getSaldo() * 0.03  );
            } else {
                conta.depositar( conta.getSaldo() * 0.10  );
            }
        } else if (conta instanceof ContaPoupanca) {
            if (conta.getSaldo() > 1000){
                conta.depositar( conta.getSaldo() * 0.03  );
            } else {
                conta.depositar( conta.getSaldo() * 0.01  );
            }
        }
    }
    
    public void somarSaldos(ContaBancaria conta){
        saldoTotal = saldoTotal + conta.getSaldo();
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }
    
}
