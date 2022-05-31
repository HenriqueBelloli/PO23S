package heranca;

import excecao.SaldoInsuficienteException;
import java.util.ArrayList;

public abstract class ContaBancaria {
    private int numero;
    private String titular;
    private double saldo;
    private ArrayList<String> operacoes = new ArrayList(); 
        
    public ContaBancaria(int numero, String titular, double saldo){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
    
    public abstract void processar();
    
    public void transferir(double valor, ContaBancaria destino){
        try {
            this.sacar(valor);
        } catch (SaldoInsuficienteException ex) {
            System.out.println("Erro" + ex);
        }
        destino.depositar(valor);
    }
    
    public void sacar(double valor) throws SaldoInsuficienteException {
        double saldoTemp = saldo - valor;
        if (saldoTemp < 0){
            throw new SaldoInsuficienteException("Impossível sacar, saldo insuficiente!");
        }
        saldo = saldo - valor;
        operacoes.add("Saque - R$ " + valor);
    }    
    
    public void depositar(double valor){
        if (valor <= 0){
            throw new IllegalArgumentException("Impossível depositar, valor negativo!");
        }
        saldo = saldo + valor;
        operacoes.add("Depositar - R$ " + valor);
    }
    
    public void printExtrato(){
        System.out.println("Extrato: ");
        for(int i=0; i<operacoes.size(); i++){
            System.out.println(operacoes.get(i));
        }
        System.out.println("Saldo Total - R$ " + this.getSaldo());
    }
    
    public String getInformacoes(){
        return "Número: " + numero + ", Titular: " + titular + ", Saldo: R$ " + saldo;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        if (titular.length() > 2)
            this.titular = titular;
    }
    public double getSaldo() {
        return saldo;
    }
}