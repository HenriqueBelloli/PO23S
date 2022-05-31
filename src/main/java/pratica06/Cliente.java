
package pratica06;

public class Cliente extends Pessoa{
    private double LimiteCompra;

    public Cliente(String nome, String endereco, double LimiteCompra) {
        super(nome, endereco);
        this.LimiteCompra = LimiteCompra;
    }

    public double getLimiteCompra() {
        return LimiteCompra;
    }

    public void setLimiteCompra(double LimiteCompra) {
        this.LimiteCompra = LimiteCompra;
    }
    
}
