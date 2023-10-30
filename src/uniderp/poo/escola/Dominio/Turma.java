package uniderp.poo.escola.Dominio;

import java.util.ArrayList;

public class Turma extends BaseIdentificador{

    protected ArrayList<Disciplina> disciplinas;
    protected ArrayList<Professor> professores;
    protected int capTurma;

    public ArrayList<Disciplina> getDisciplina() {
        return disciplinas;
    }
    public void setDisciplina(ArrayList<Disciplina> disciplina) {
        this.disciplinas = disciplina;
    }
    public ArrayList<Professor> getProfessor() {
        return professores;
    }
    public void setProfessor(ArrayList<Professor> professores) {
        this.professores = professores;
    }
    public int getCapTurma() {
        return capTurma;
    }
    public void setCapTurma(int capTurma) {
        this.capTurma = capTurma;
    }
    
    public Turma(int codigo, ArrayList<Disciplina> disciplina, ArrayList<Professor> professores, int capTurma){

        super(codigo);
        this.disciplinas = disciplina;
        this.professores = professores;
        this.capTurma = capTurma;
    }
}
