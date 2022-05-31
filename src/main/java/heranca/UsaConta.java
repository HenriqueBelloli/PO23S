package heranca;

public class UsaConta {
    public static void main(String[] args) {
        ContaPoupanca cp1 = new ContaPoupanca(456, "", 1000, 0.5);
        cp1.setNumero(456);
        cp1.setTitular("Maria Almeida");
        cp1.setRendimento(0.5);
        
        cp1.depositar(100);
        cp1.processar();
        
        System.out.println( cp1.getInformacoes() );
        
        cp1.printExtrato();
    }
}
