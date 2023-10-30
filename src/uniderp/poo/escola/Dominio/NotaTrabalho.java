package uniderp.poo.escola.Dominio;

public class NotaTrabalho extends BaseIdentificador{

    protected Aluno aluno;
    protected Trabalho trabalho;
    protected Double nota;

    public Aluno getAluno() {
        return aluno;
    }
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    public Trabalho getTrabalho() {
        return trabalho;
    }
    public void setTrabalho(Trabalho trabalho) {
        this.trabalho = trabalho;
    }
    public Double getNota() {
        return nota;
    }
    public void setNota(Double nota) {
        this.nota = nota;
    }
    
    public NotaTrabalho(int codigo, Aluno aluno, Trabalho trabalho, Double nota){

        super(codigo);
        this.aluno = aluno;
        this.trabalho = trabalho;
        this.nota = nota;
    }
}
