package uniderp.poo.escola.Dominio;

public class Trabalho extends BaseIdentificador{

    protected Disciplina disciplina;
    protected String descricao;

    public Disciplina getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Trabalho(int codigo, Disciplina disciplina, String descricao){

        super(codigo);
        this.disciplina = disciplina;
        this.descricao = descricao;
    }   
}
