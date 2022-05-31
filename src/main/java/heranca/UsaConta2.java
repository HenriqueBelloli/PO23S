package heranca;

public class UsaConta2 {

    public static void main(String[] args) {
        
        ContaBancaria contas[] = new ContaBancaria[4];
        
        contas[0] = new ContaCorrente(1, "Fulano da Silva", 1200, 29.80);
        contas[1] = new ContaPoupanca(2, "Beltrano da Silva", 100, 0.5);
        contas[2] = new ContaCorrente(3, "Fulano da Silva", 12000, 29.80);
        contas[3] = new ContaPoupanca(4, "Beltrano da Silva", 100, 0.5);
        
        for (int i=0; i<contas.length; i++){
            System.out.println( contas[i].getInformacoes() );
        }
        
        ProcessaContas proc = new ProcessaContas();
        for (int i=0; i<contas.length; i++){
            proc.bonificar(contas[i]);;
        }
        System.out.println("");
        
        for (int i=0; i<contas.length; i++){
            proc.somarSaldos(contas[i]);;
        }
        
        for (int i=0; i<contas.length; i++){
            System.out.println( contas[i].getInformacoes() );
        }
        System.out.println("");
        
        System.out.println("Saldo total do nosso banco: R$ " + proc.getSaldoTotal());
    
    }
    
    public static ContaBancaria maiorSaldo(ContaBancaria contas[]){
        int index = 0;
        double maior = contas[0].getSaldo();
        for (int i=0; i<contas.length; i++){
            if (maior < contas[i].getSaldo()){
                maior = contas[i].getSaldo();
                index = i;
            }
        }
        return contas[index];
    }
    
}
