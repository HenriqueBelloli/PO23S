package pratica07_02;

public class Gerente extends Usuario {

    private double salario, bonus;

    public Gerente(String login, String password, double salario, double bonus) {

        setLogin(login);
        setPassword(password);
        this.salario = salario;
        this.bonus = bonus;
    }

    public double getSalario() {
        return salario;
    }

    public double getBonus() {
        return bonus;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

}
