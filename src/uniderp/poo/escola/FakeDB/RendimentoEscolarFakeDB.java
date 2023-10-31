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
        this.tabela.add(new RendimentoEscolar(alunos.get(0), turmas.get(0), 7.0, 6.0, trabs.get(4), 7.0, 7.0));
        this.tabela.add(new RendimentoEscolar(alunos.get(0), turmas.get(0), 8.0, 6.0, trabs.get(8), 8.0, 7.5));
        this.tabela.add(new RendimentoEscolar(alunos.get(0), turmas.get(0), 9.0, 6.0, trabs.get(12), 9.0, 8.0));

        this.tabela.add(new RendimentoEscolar(alunos.get(1), turmas.get(0), 6.0, 6.0, trabs.get(16), 6.0, 6.0));
        this.tabela.add(new RendimentoEscolar(alunos.get(1), turmas.get(0), 7.0, 6.0, trabs.get(20), 7.0, 7.0));
        this.tabela.add(new RendimentoEscolar(alunos.get(1), turmas.get(0), 8.0, 6.0, trabs.get(24), 8.0, 7.5));
        this.tabela.add(new RendimentoEscolar(alunos.get(1), turmas.get(0), 9.0, 6.0, trabs.get(28), 9.0, 8.0));

        this.tabela.add(new RendimentoEscolar(alunos.get(2), turmas.get(0), 6.0, 6.0, trabs.get(32), 6.0, 6.0));
        this.tabela.add(new RendimentoEscolar(alunos.get(2), turmas.get(0), 7.0, 6.0, trabs.get(36), 7.0, 7.0));
        this.tabela.add(new RendimentoEscolar(alunos.get(2), turmas.get(0), 8.0, 6.0, trabs.get(40), 8.0, 7.5));
        this.tabela.add(new RendimentoEscolar(alunos.get(2), turmas.get(0), 9.0, 6.0, trabs.get(44), 9.0, 8.0));





        this.tabela.add(new RendimentoEscolar(alunos.get(3), turmas.get(1), 6.0, 7.0, trabs.get(48), 5.0, 6.0));
        this.tabela.add(new RendimentoEscolar(alunos.get(3), turmas.get(1), 7.0, 6.0, trabs.get(52), 8.0, 7.0));
        this.tabela.add(new RendimentoEscolar(alunos.get(3), turmas.get(1), 8.0, 6.0, trabs.get(56), 8.0, 7.5));
        this.tabela.add(new RendimentoEscolar(alunos.get(3), turmas.get(1), 9.0, 6.0, trabs.get(60), 10.0, 9.0));

        this.tabela.add(new RendimentoEscolar(alunos.get(4), turmas.get(1), 6.0, 7.0, trabs.get(64), 5.0, 6.0));
        this.tabela.add(new RendimentoEscolar(alunos.get(4), turmas.get(1), 7.0, 6.0, trabs.get(68), 8.0, 7.0));
        this.tabela.add(new RendimentoEscolar(alunos.get(4), turmas.get(1), 8.0, 6.0, trabs.get(72), 8.0, 7.5));
        this.tabela.add(new RendimentoEscolar(alunos.get(4), turmas.get(1), 9.0, 6.0, trabs.get(76), 10.0, 9.0));

        this.tabela.add(new RendimentoEscolar(alunos.get(5), turmas.get(1), 6.0, 7.0, trabs.get(80), 5.0, 6.0));
        this.tabela.add(new RendimentoEscolar(alunos.get(5), turmas.get(1), 7.0, 6.0, trabs.get(84), 8.0, 7.0));
        this.tabela.add(new RendimentoEscolar(alunos.get(5), turmas.get(1), 8.0, 6.0, trabs.get(88), 8.0, 7.5));
        this.tabela.add(new RendimentoEscolar(alunos.get(5), turmas.get(1), 9.0, 6.0, trabs.get(92), 10.0, 9.0));





        this.tabela.add(new RendimentoEscolar(alunos.get(6), turmas.get(2), 6.0, 8.0, trabs.get(96), 4.0, 5.5));
        this.tabela.add(new RendimentoEscolar(alunos.get(6), turmas.get(2), 7.0, 6.0, trabs.get(100), 2.0, 4.0));
        this.tabela.add(new RendimentoEscolar(alunos.get(6), turmas.get(2), 8.0, 6.0, trabs.get(104), 8.0, 7.5));
        this.tabela.add(new RendimentoEscolar(alunos.get(6), turmas.get(2), 9.0, 6.0, trabs.get(112), 7.0, 7.5));

        this.tabela.add(new RendimentoEscolar(alunos.get(7), turmas.get(2), 6.0, 8.0, trabs.get(116), 4.0, 5.5));
        this.tabela.add(new RendimentoEscolar(alunos.get(7), turmas.get(2), 7.0, 6.0, trabs.get(120), 2.0, 4.0));
        this.tabela.add(new RendimentoEscolar(alunos.get(7), turmas.get(2), 8.0, 6.0, trabs.get(124), 8.0, 7.5));
        this.tabela.add(new RendimentoEscolar(alunos.get(7), turmas.get(2), 9.0, 6.0, trabs.get(128), 7.0, 7.5));

        this.tabela.add(new RendimentoEscolar(alunos.get(8), turmas.get(2), 6.0, 8.0, trabs.get(132), 4.0, 5.5));
        this.tabela.add(new RendimentoEscolar(alunos.get(8), turmas.get(2), 7.0, 6.0, trabs.get(136), 2.0, 4.0));
        this.tabela.add(new RendimentoEscolar(alunos.get(8), turmas.get(2), 8.0, 6.0, trabs.get(140), 8.0, 7.5));
        this.tabela.add(new RendimentoEscolar(alunos.get(8), turmas.get(2), 9.0, 6.0, trabs.get(144), 7.0, 7.5));




        
        this.tabela.add(new RendimentoEscolar(alunos.get(9), turmas.get(3), 6.0, 9.0, trabs.get(148), 10.0, 9.0));
        this.tabela.add(new RendimentoEscolar(alunos.get(9), turmas.get(3), 7.0, 6.0, trabs.get(152), 6.0, 6.0));
        this.tabela.add(new RendimentoEscolar(alunos.get(9), turmas.get(3), 8.0, 6.0, trabs.get(156), 8.0, 7.5));
        this.tabela.add(new RendimentoEscolar(alunos.get(9), turmas.get(3), 9.0, 6.0, trabs.get(160), 10.0, 9.0));
        
        this.tabela.add(new RendimentoEscolar(alunos.get(10), turmas.get(3), 6.0, 9.0, trabs.get(164), 10.0, 9.0));
        this.tabela.add(new RendimentoEscolar(alunos.get(10), turmas.get(3), 7.0, 6.0, trabs.get(168), 6.0, 6.0));
        this.tabela.add(new RendimentoEscolar(alunos.get(10), turmas.get(3), 8.0, 6.0, trabs.get(172), 8.0, 7.5));
        this.tabela.add(new RendimentoEscolar(alunos.get(10), turmas.get(3), 9.0, 6.0, trabs.get(176), 10.0, 9.0));

        this.tabela.add(new RendimentoEscolar(alunos.get(11), turmas.get(3), 6.0, 9.0, trabs.get(180), 10.0, 9.0));
        this.tabela.add(new RendimentoEscolar(alunos.get(11), turmas.get(3), 7.0, 6.0, trabs.get(184), 6.0, 6.0));
        this.tabela.add(new RendimentoEscolar(alunos.get(11), turmas.get(3), 8.0, 6.0, trabs.get(188), 8.0, 7.5));
        this.tabela.add(new RendimentoEscolar(alunos.get(11), turmas.get(3), 9.0, 6.0, trabs.get(192), 10.0, 9.0));

    }

    
    public RendimentoEscolarFakeDB(){

        super();
    }
}

