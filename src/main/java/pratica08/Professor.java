package pratica08;

public class Professor extends Pessoaex1 {

    private String nome;
    private String cpf;
    private String Rg;
    private double salario;

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getCpf() {
        return cpf;
    }

    @Override
    public String getRg() {
        return Rg;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void setRg(String Rg) {
        this.Rg = Rg;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
