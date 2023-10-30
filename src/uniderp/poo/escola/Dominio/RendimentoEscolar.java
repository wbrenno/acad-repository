package uniderp.poo.escola.Dominio;

public class RendimentoEscolar {

    protected Aluno aluno;
    protected Turma turma;
    protected Double primeiraP;
    protected Double segundaP;
    protected NotaTrabalho trabalhos;
    protected Double mediaTrab;
    protected Double mediaGeral;

    public Turma getTurma() {
        return turma;
    }
    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    public Double getPrimeiraP() {
        return primeiraP;
    }
    public void setPrimeiraP(Double primeiraP) {
        this.primeiraP = primeiraP;
    }
    public Double getSegundaP() {
        return segundaP;
    }
    public void setSegundaP(Double segundaP) {
        this.segundaP = segundaP;
    }
    public NotaTrabalho getTrabalhos() {
        return trabalhos;
    }
    public void setTrabalhos(NotaTrabalho trabalhos) {
        this.trabalhos = trabalhos;
    }
    public Double getMediaTrab() {
        return mediaTrab;
    }
    public void setMediaTrab(Double mediaTrab) {
        this.mediaTrab = mediaTrab;
    }
    public Double getMediaGeral() {
        return mediaGeral;
    }
    public void setMediaGeral(Double mediaGeral) {
        this.mediaGeral = mediaGeral;
    }

    public RendimentoEscolar(Aluno aluno, Turma turma, Double primeiraP, Double segundaP, NotaTrabalho trabalhos, Double mediaTrab, Double mediaGeral){

        this.aluno = aluno;
        this.turma = turma;
        this.primeiraP = primeiraP;
        this.segundaP = segundaP;
        this.trabalhos = trabalhos;
        this.mediaTrab = mediaTrab;
        this.mediaGeral = mediaGeral;
    }
}
