package pratica08;

class AlunoMestrado extends Aluno {

    private double notaDissertacao;
    private int artigosPublicados;

    public AlunoMestrado(String nome, int ra, double notaDisciplinas, double notaDissertacao, int artigosPublicados) {
        this.setNome(nome);
        this.setRa(ra);
        this.setNotaDisciplinas(notaDisciplinas);
        this.notaDissertacao = notaDissertacao;
        this.artigosPublicados = artigosPublicados;
    }

    public double getNotaDissertacao() {
        return notaDissertacao;
    }

    public int getArtigosPublicados() {
        return artigosPublicados;
    }

    public void setNotaDissertacao(double notaDissertacao) {
        this.notaDissertacao = notaDissertacao;
    }

    public void setArtigosPublicados(int artigosPublicados) {
        this.artigosPublicados = artigosPublicados;
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
        if (this.getArtigosPublicados() > 0) {
            return ((this.getNotaDisciplinas() + this.getNotaDissertacao()) / 2);
        }
        return (0);
    }
}
