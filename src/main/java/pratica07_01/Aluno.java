package pratica07_01;

public class Aluno extends Pessoa {

    private int ra;
    private String disciplinas;

    public Aluno(String nome, int idade, int ra, String disciplinas) {
        super(nome, idade);
        this.ra = ra;
        this.disciplinas = disciplinas;
    }

    public int getRa() {
        return ra;
    }

    public String getDisciplinas() {
        return disciplinas;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public void setDisciplinas(String disciplinas) {
        this.disciplinas = disciplinas;
    }

    public String retornaDados() {
        return super.retornaDados() + " -- " + this.ra + " -- " + this.disciplinas;
    }

}
