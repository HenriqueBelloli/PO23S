package pratica08;

public class AlunoGraduacao extends Aluno{
    private double notaTCC;

    public AlunoGraduacao(String nome, int ra, double notaDisciplinas, double notaTCC) {
        this.setNome(nome);
        this.setRa(ra);
        this.setNotaDisciplinas(notaDisciplinas);
        this.notaTCC = notaTCC;
    }

    public double getNotaTCC() {
        return notaTCC;
    }

    public void setNotaTCC(double notaTCC) {
        this.notaTCC = notaTCC;
    }

    @Override
    public void setNotaDisciplinas(double notaDisciplinas) {
        super.setNotaDisciplinas(notaDisciplinas);
    }

    @Override
    public double getNotaDisciplinas() {
        return super.getNotaDisciplinas();
    }

    @Override
    public void setRa(int ra) {
        super.setRa(ra);
    }

    @Override
    public int getRa() {
        return super.getRa();
    }
    
    @Override
    public double getNotaFinal() {
        return((this.getNotaDisciplinas()+this.getNotaTCC())/2);
    }
    
}
