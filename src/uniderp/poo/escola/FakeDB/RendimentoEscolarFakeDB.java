package uniderp.poo.escola.FakeDB;

import java.util.ArrayList;

import uniderp.poo.escola.Dominio.Aluno;
import uniderp.poo.escola.Dominio.NotaTrabalho;
import uniderp.poo.escola.Dominio.RendimentoEscolar;
import uniderp.poo.escola.Dominio.Turma;

public class RendimentoEscolarFakeDB extends BaseGenericaFakeDB<RendimentoEscolar>{

    @Override
    protected void CarregarDados() {

        AlunoFakeDB alunoDB = new AlunoFakeDB();
        NotaTrabalhoFakeDB trabsDB = new NotaTrabalhoFakeDB();
        TurmaFakeDB turmaDB = new TurmaFakeDB();

        ArrayList<Aluno> alunos = alunoDB.getTabela();

        ArrayList<Turma> turmas = turmaDB.getTabela();

        ArrayList<NotaTrabalho> trabs = trabsDB.getTabela();
           
        this.tabela = new ArrayList<RendimentoEscolar>();

        this.tabela.add(new RendimentoEscolar(alunos.get(0), turmas.get(0), 6.0, 6.0, trabs.get(0), 6.0, 6.0));
        this.tabela.add(new RendimentoEscolar(alunos.get(0), turmas.get(0), 7.0, 6.0, trabs.get(1), 7.0, 6.75));
        this.tabela.add(new RendimentoEscolar(alunos.get(0), turmas.get(0), 8.0, 6.0, trabs.get(2), 8.0, 7.5));
        this.tabela.add(new RendimentoEscolar(alunos.get(0), turmas.get(0), 9.0, 6.0, trabs.get(3), 9.0, 8.));

        this.tabela.add(new RendimentoEscolar(alunos.get(1), turmas.get(0), 6.0, 6.0, trabs.get(0), 6.0, 6.0));
        this.tabela.add(new RendimentoEscolar(alunos.get(1), turmas.get(0), 7.0, 6.0, trabs.get(1), 7.0, 6.75));
        this.tabela.add(new RendimentoEscolar(alunos.get(1), turmas.get(0), 8.0, 6.0, trabs.get(2), 8.0, 7.5));
        this.tabela.add(new RendimentoEscolar(alunos.get(1), turmas.get(0), 9.0, 6.0, trabs.get(3), 9.0, 8.0));

        this.tabela.add(new RendimentoEscolar(alunos.get(2), turmas.get(0), 6.0, 6.0, trabs.get(0), 6.0, 6.0));
        this.tabela.add(new RendimentoEscolar(alunos.get(2), turmas.get(0), 7.0, 6.0, trabs.get(1), 7.0, 6.75));
        this.tabela.add(new RendimentoEscolar(alunos.get(2), turmas.get(0), 8.0, 6.0, trabs.get(2), 8.0, 7.5));
        this.tabela.add(new RendimentoEscolar(alunos.get(2), turmas.get(0), 9.0, 6.0, trabs.get(3), 9.0, 8.0));





        this.tabela.add(new RendimentoEscolar(alunos.get(3), turmas.get(1), 6.0, 7.0, trabs.get(4), 5.0, 5.75));
        this.tabela.add(new RendimentoEscolar(alunos.get(3), turmas.get(1), 7.0, 6.0, trabs.get(5), 8.0, 7.0));
        this.tabela.add(new RendimentoEscolar(alunos.get(3), turmas.get(1), 8.0, 6.0, trabs.get(6), 8.0, 7.5));
        this.tabela.add(new RendimentoEscolar(alunos.get(3), turmas.get(1), 9.0, 6.0, trabs.get(7), 10.0, 8.75));

        this.tabela.add(new RendimentoEscolar(alunos.get(4), turmas.get(1), 6.0, 7.0, trabs.get(4), 5.0, 5.75));
        this.tabela.add(new RendimentoEscolar(alunos.get(4), turmas.get(1), 7.0, 6.0, trabs.get(5), 8.0, 7.0));
        this.tabela.add(new RendimentoEscolar(alunos.get(4), turmas.get(1), 8.0, 6.0, trabs.get(6), 8.0, 7.5));
        this.tabela.add(new RendimentoEscolar(alunos.get(4), turmas.get(1), 9.0, 6.0, trabs.get(7), 10.0, 8.75));

        this.tabela.add(new RendimentoEscolar(alunos.get(5), turmas.get(1), 6.0, 7.0, trabs.get(4), 5.0, 5.75));
        this.tabela.add(new RendimentoEscolar(alunos.get(5), turmas.get(1), 7.0, 6.0, trabs.get(5), 8.0, 7.0));
        this.tabela.add(new RendimentoEscolar(alunos.get(5), turmas.get(1), 8.0, 6.0, trabs.get(6), 8.0, 7.5));
        this.tabela.add(new RendimentoEscolar(alunos.get(5), turmas.get(1), 9.0, 6.0, trabs.get(7), 10.0, 8.75));





        this.tabela.add(new RendimentoEscolar(alunos.get(6), turmas.get(2), 6.0, 8.0, trabs.get(8), 4.0, 5.5));
        this.tabela.add(new RendimentoEscolar(alunos.get(6), turmas.get(2), 7.0, 6.0, trabs.get(9), 2.0, 4.0));
        this.tabela.add(new RendimentoEscolar(alunos.get(6), turmas.get(2), 8.0, 6.0, trabs.get(10), 8.0, 7.5));
        this.tabela.add(new RendimentoEscolar(alunos.get(6), turmas.get(2), 9.0, 6.0, trabs.get(11), 7.0, 7.5));

        this.tabela.add(new RendimentoEscolar(alunos.get(7), turmas.get(2), 6.0, 8.0, trabs.get(8), 4.0, 5.5));
        this.tabela.add(new RendimentoEscolar(alunos.get(7), turmas.get(2), 7.0, 6.0, trabs.get(9), 2.0, 4.0));
        this.tabela.add(new RendimentoEscolar(alunos.get(7), turmas.get(2), 8.0, 6.0, trabs.get(10), 8.0, 7.5));
        this.tabela.add(new RendimentoEscolar(alunos.get(7), turmas.get(2), 9.0, 6.0, trabs.get(11), 7.0, 7.5));

        this.tabela.add(new RendimentoEscolar(alunos.get(8), turmas.get(2), 6.0, 8.0, trabs.get(8), 4.0, 5.5));
        this.tabela.add(new RendimentoEscolar(alunos.get(8), turmas.get(2), 7.0, 6.0, trabs.get(9), 2.0, 4.0));
        this.tabela.add(new RendimentoEscolar(alunos.get(8), turmas.get(2), 8.0, 6.0, trabs.get(10), 8.0, 7.5));
        this.tabela.add(new RendimentoEscolar(alunos.get(8), turmas.get(2), 9.0, 6.0, trabs.get(11), 7.0, 7.5));




        
        this.tabela.add(new RendimentoEscolar(alunos.get(9), turmas.get(3), 6.0, 9.0, trabs.get(12), 10.0, 8.75));
        this.tabela.add(new RendimentoEscolar(alunos.get(9), turmas.get(3), 7.0, 6.0, trabs.get(13), 6.0, 6.0));
        this.tabela.add(new RendimentoEscolar(alunos.get(9), turmas.get(3), 8.0, 6.0, trabs.get(14), 8.0, 7.5));
        this.tabela.add(new RendimentoEscolar(alunos.get(9), turmas.get(3), 9.0, 6.0, trabs.get(15), 10.0, 8.75));
        
        this.tabela.add(new RendimentoEscolar(alunos.get(10), turmas.get(3), 6.0, 9.0, trabs.get(12), 10.0, 8.75));
        this.tabela.add(new RendimentoEscolar(alunos.get(10), turmas.get(3), 7.0, 6.0, trabs.get(13), 6.0, 6.0));
        this.tabela.add(new RendimentoEscolar(alunos.get(10), turmas.get(3), 8.0, 6.0, trabs.get(14), 8.0, 7.5));
        this.tabela.add(new RendimentoEscolar(alunos.get(10), turmas.get(3), 9.0, 6.0, trabs.get(15), 10.0, 8.75));

        this.tabela.add(new RendimentoEscolar(alunos.get(11), turmas.get(3), 6.0, 9.0, trabs.get(12), 10.0, 8.75));
        this.tabela.add(new RendimentoEscolar(alunos.get(11), turmas.get(3), 7.0, 6.0, trabs.get(13), 6.0, 6.0));
        this.tabela.add(new RendimentoEscolar(alunos.get(11), turmas.get(3), 8.0, 6.0, trabs.get(14), 8.0, 7.5));
        this.tabela.add(new RendimentoEscolar(alunos.get(11), turmas.get(3), 9.0, 6.0, trabs.get(15), 10.0, 8.75));

    }

    
    public RendimentoEscolarFakeDB(){

        super();
    }
}

