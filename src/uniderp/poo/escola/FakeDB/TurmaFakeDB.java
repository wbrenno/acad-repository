package uniderp.poo.escola.FakeDB;

import java.util.ArrayList;

import uniderp.poo.escola.Dominio.Disciplina;
import uniderp.poo.escola.Dominio.Professor;
import uniderp.poo.escola.Dominio.Turma;

public class TurmaFakeDB extends BaseGenericaFakeDB<Turma>{

     @Override
    protected void CarregarDados() {

         DisciplinaFakeDB disciplinaDB = new DisciplinaFakeDB();
         ProfessorFakeDB professorDB = new ProfessorFakeDB();

         ArrayList<Disciplina> disciplinas = disciplinaDB.getTabela();

         ArrayList<Professor> professores = professorDB.getTabela();

        this.tabela = new ArrayList<Turma>();

        Turma dez = new Turma(10, disciplinas, professores,  30);
        Turma onze = new Turma(11, disciplinas, professores, 30);
        Turma doze = new Turma(12, disciplinas, professores, 30);
        Turma treze = new Turma(13, disciplinas, professores, 30);

        tabela.add(dez);
        tabela.add(onze);
        tabela.add(doze);
        tabela.add(treze);
    }

    public TurmaFakeDB(){
        super();
    }
}
