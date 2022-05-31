package heranca;

public class UsaBanco {
    public static void main(String[] args) {
        Banco bb = new Banco("Banco do Brasil - DV");
        Banco pan = new Banco("Panamericano - DV");
        
        ContaCorrente novaConta = new ContaCorrente(1, "Ana", 100, 29.5);
        bb.adicionar(novaConta);
        
        bb.adicionar( new ContaPoupanca(2, "Pedro", 200, 0.5) );
        
        bb.listarContas();
        
        bb.getConta(4).depositar(500);
        
        bb.listarContas();
    }
}
