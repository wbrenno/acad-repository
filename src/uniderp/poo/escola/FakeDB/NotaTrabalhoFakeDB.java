package uniderp.poo.escola.FakeDB;

import uniderp.poo.escola.Dominio.NotaTrabalho;
import uniderp.poo.escola.Dominio.Aluno;
import uniderp.poo.escola.Dominio.Trabalho;

import java.util.ArrayList;

public class NotaTrabalhoFakeDB extends BaseGenericaFakeDB<NotaTrabalho>{

     @Override
    protected void CarregarDados(){

     AlunoFakeDB alunoDB = new AlunoFakeDB();
     TrabalhoFakeDB trabalhoDB = new TrabalhoFakeDB();

         ArrayList<Aluno> alunos = alunoDB.getTabela();

         ArrayList<Trabalho> trabalhos = trabalhoDB.getTabela();
        
        this.tabela = new ArrayList<NotaTrabalho>();


         NotaTrabalho allanp = new NotaTrabalho(0, alunos.get(0), trabalhos.get(0), 6.0);
         NotaTrabalho allan2 = new NotaTrabalho(1, alunos.get(0), trabalhos.get(1), 7.0);
         NotaTrabalho allan3 = new NotaTrabalho(2, alunos.get(0), trabalhos.get(2), 8.0);
         NotaTrabalho allan4 = new NotaTrabalho(3, alunos.get(0), trabalhos.get(3), 9.0);

         tabela.add(allanp);
         tabela.add(allan2);
         tabela.add(allan3);
         tabela.add(allan4);
        

        NotaTrabalho breno1 = new NotaTrabalho(4, alunos.get(1), trabalhos.get(0), 5.0);
        NotaTrabalho breno2 = new NotaTrabalho(5, alunos.get(1), trabalhos.get(1), 8.0);
        NotaTrabalho breno3 = new NotaTrabalho(6, alunos.get(1), trabalhos.get(2), 8.0);
        NotaTrabalho breno4 = new NotaTrabalho(7, alunos.get(1), trabalhos.get(3), 10.0);

        tabela.add(breno1);
        tabela.add(breno2);
        tabela.add(breno3);
        tabela.add(breno4);

        NotaTrabalho jose1 = new NotaTrabalho(8, alunos.get(2), trabalhos.get(0), 4.0);
        NotaTrabalho jose2 =new NotaTrabalho(9, alunos.get(2), trabalhos.get(1), 2.0);
        NotaTrabalho jose3 =new NotaTrabalho(10, alunos.get(2), trabalhos.get(2), 8.0);
        NotaTrabalho jose4 =new NotaTrabalho(11, alunos.get(2), trabalhos.get(3), 7.0);

        tabela.add(jose1);
        tabela.add(jose2);
        tabela.add(jose3);
        tabela.add(jose4);


        NotaTrabalho chaves1 = new NotaTrabalho(12, alunos.get(3), trabalhos.get(0), 10.0);
        NotaTrabalho chaves2 = new NotaTrabalho(13, alunos.get(3), trabalhos.get(1), 6.0);
        NotaTrabalho chaves3 = new NotaTrabalho(14, alunos.get(3), trabalhos.get(2), 8.0);
        NotaTrabalho chaves4 = new NotaTrabalho(15, alunos.get(3), trabalhos.get(3), 10.0);

        tabela.add(chaves1);
        tabela.add(chaves2);
        tabela.add(chaves3);
        tabela.add(chaves4);

     }

    public NotaTrabalhoFakeDB(){

        super();
    }
}
