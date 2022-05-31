
package pratica06;

public class Gerente extends Funcionario{

    private String Departamento;

    public Gerente(String nome, String endereco, double Salario, String Departamento) {
        super(nome, endereco, Salario);
        this.Departamento = Departamento;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

}
