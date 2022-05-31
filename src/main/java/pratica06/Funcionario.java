
package pratica06;

public class Funcionario extends Pessoa{

    private double Salario;

    public Funcionario(String nome, String endereco, double Salario) {
        super(nome, endereco);
        this.Salario = Salario;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }
        
        
}
