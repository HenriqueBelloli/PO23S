package pratica05;

public class Aluno {

    String nome;
    int idade;
    char genero;
    long ra;

    public Aluno() {
        this.nome = "Aluno";
        this.idade = 18;
        this.genero = 'M';
        this.ra = 123456789;
    }

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.genero = 'M';
        this.ra = 123456789;
    }

    public Aluno(String nome, char genero, long ra) {
        this.nome = nome;
        this.idade = 18;
        this.genero = genero;
        this.ra = ra;
    }

    public void print() {
        System.out.println(this.nome + " - " + this.idade + " - " + this.genero + " - " + this.ra);
    }
}
