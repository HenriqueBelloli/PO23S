package pratica07_02;

public class Vendedor extends Usuario {

    private double comissao;

    public Vendedor(String login, String password, double comissao) {
        setLogin(login);
        setPassword(password);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

}
