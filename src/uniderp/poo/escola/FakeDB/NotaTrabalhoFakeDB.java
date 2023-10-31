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


         this.tabela.add(new NotaTrabalho(0, alunos.get(0), trabalhos.get(0), 6.0));
         this.tabela.add(new NotaTrabalho(0, alunos.get(0), trabalhos.get(0), 6.0));
         this.tabela.add(new NotaTrabalho(0, alunos.get(0), trabalhos.get(0), 6.0));
         this.tabela.add(new NotaTrabalho(0, alunos.get(0), trabalhos.get(0), 6.0));

         this.tabela.add(new NotaTrabalho(1, alunos.get(0), trabalhos.get(1), 7.0));
         this.tabela.add(new NotaTrabalho(1, alunos.get(0), trabalhos.get(1), 7.0));
         this.tabela.add(new NotaTrabalho(1, alunos.get(0), trabalhos.get(1), 7.0));
         this.tabela.add(new NotaTrabalho(1, alunos.get(0), trabalhos.get(1), 7.0));

         this.tabela.add(new NotaTrabalho(2, alunos.get(0), trabalhos.get(2), 8.0));
         this.tabela.add(new NotaTrabalho(2, alunos.get(0), trabalhos.get(2), 8.0));
         this.tabela.add(new NotaTrabalho(2, alunos.get(0), trabalhos.get(2), 8.0));
         this.tabela.add(new NotaTrabalho(2, alunos.get(0), trabalhos.get(2), 8.0));

        this.tabela.add(new NotaTrabalho(3, alunos.get(0), trabalhos.get(3), 9.0));
        this.tabela.add(new NotaTrabalho(3, alunos.get(0), trabalhos.get(3), 9.0));
        this.tabela.add(new NotaTrabalho(3, alunos.get(0), trabalhos.get(3), 9.0));
        this.tabela.add(new NotaTrabalho(3, alunos.get(0), trabalhos.get(3), 9.0));


        

         this.tabela.add(new NotaTrabalho(0, alunos.get(1), trabalhos.get(0), 6.0));
         this.tabela.add(new NotaTrabalho(0, alunos.get(1), trabalhos.get(0), 6.0));
         this.tabela.add(new NotaTrabalho(0, alunos.get(1), trabalhos.get(0), 6.0));
         this.tabela.add(new NotaTrabalho(0, alunos.get(1), trabalhos.get(0), 6.0));

         this.tabela.add(new NotaTrabalho(1, alunos.get(1), trabalhos.get(1), 7.0));
         this.tabela.add(new NotaTrabalho(1, alunos.get(1), trabalhos.get(1), 7.0));
         this.tabela.add(new NotaTrabalho(1, alunos.get(1), trabalhos.get(1), 7.0));
         this.tabela.add(new NotaTrabalho(1, alunos.get(1), trabalhos.get(1), 7.0));

         this.tabela.add(new NotaTrabalho(2, alunos.get(1), trabalhos.get(2), 8.0));
         this.tabela.add(new NotaTrabalho(2, alunos.get(1), trabalhos.get(2), 8.0));
         this.tabela.add(new NotaTrabalho(2, alunos.get(1), trabalhos.get(2), 8.0));
         this.tabela.add(new NotaTrabalho(2, alunos.get(1), trabalhos.get(2), 8.0));

        this.tabela.add(new NotaTrabalho(3, alunos.get(1), trabalhos.get(3), 9.0));
        this.tabela.add(new NotaTrabalho(3, alunos.get(1), trabalhos.get(3), 9.0));
        this.tabela.add(new NotaTrabalho(3, alunos.get(1), trabalhos.get(3), 9.0));
        this.tabela.add(new NotaTrabalho(3, alunos.get(1), trabalhos.get(3), 9.0));




         this.tabela.add(new NotaTrabalho(0, alunos.get(2), trabalhos.get(0), 6.0));
         this.tabela.add(new NotaTrabalho(0, alunos.get(2), trabalhos.get(0), 6.0));
         this.tabela.add(new NotaTrabalho(0, alunos.get(2), trabalhos.get(0), 6.0));
         this.tabela.add(new NotaTrabalho(0, alunos.get(2), trabalhos.get(0), 6.0));

         this.tabela.add(new NotaTrabalho(1, alunos.get(2), trabalhos.get(1), 7.0));
         this.tabela.add(new NotaTrabalho(1, alunos.get(2), trabalhos.get(1), 7.0));
         this.tabela.add(new NotaTrabalho(1, alunos.get(2), trabalhos.get(1), 7.0));
         this.tabela.add(new NotaTrabalho(1, alunos.get(2), trabalhos.get(1), 7.0));

         this.tabela.add(new NotaTrabalho(2, alunos.get(2), trabalhos.get(2), 8.0));
         this.tabela.add(new NotaTrabalho(2, alunos.get(2), trabalhos.get(2), 8.0));
         this.tabela.add(new NotaTrabalho(2, alunos.get(2), trabalhos.get(2), 8.0));
         this.tabela.add(new NotaTrabalho(2, alunos.get(2), trabalhos.get(2), 8.0));

        this.tabela.add(new NotaTrabalho(3, alunos.get(2), trabalhos.get(3), 9.0));
        this.tabela.add(new NotaTrabalho(3, alunos.get(2), trabalhos.get(3), 9.0));
         this.tabela.add(new NotaTrabalho(3, alunos.get(2), trabalhos.get(3), 9.0));
         this.tabela.add(new NotaTrabalho(3, alunos.get(2), trabalhos.get(3), 9.0));




         this.tabela.add(new NotaTrabalho(0, alunos.get(3), trabalhos.get(0), 6.0));
         this.tabela.add(new NotaTrabalho(0, alunos.get(3), trabalhos.get(0), 6.0));
         this.tabela.add(new NotaTrabalho(0, alunos.get(3), trabalhos.get(0), 6.0));
         this.tabela.add(new NotaTrabalho(0, alunos.get(3), trabalhos.get(0), 6.0));

         this.tabela.add(new NotaTrabalho(1, alunos.get(3), trabalhos.get(1), 7.0));
         this.tabela.add(new NotaTrabalho(1, alunos.get(3), trabalhos.get(1), 7.0));
         this.tabela.add(new NotaTrabalho(1, alunos.get(3), trabalhos.get(1), 7.0));
         this.tabela.add(new NotaTrabalho(1, alunos.get(3), trabalhos.get(1), 7.0));

         this.tabela.add(new NotaTrabalho(2, alunos.get(3), trabalhos.get(2), 8.0));
         this.tabela.add(new NotaTrabalho(2, alunos.get(3), trabalhos.get(2), 8.0));
         this.tabela.add(new NotaTrabalho(2, alunos.get(3), trabalhos.get(2), 8.0));
         this.tabela.add(new NotaTrabalho(2, alunos.get(3), trabalhos.get(2), 8.0));

        this.tabela.add(new NotaTrabalho(3, alunos.get(3), trabalhos.get(3), 9.0));
        this.tabela.add(new NotaTrabalho(3, alunos.get(3), trabalhos.get(3), 9.0));
        this.tabela.add(new NotaTrabalho(3, alunos.get(3), trabalhos.get(3), 9.0));
        this.tabela.add(new NotaTrabalho(3, alunos.get(3), trabalhos.get(3), 9.0));




         this.tabela.add(new NotaTrabalho(0, alunos.get(4), trabalhos.get(0), 6.0));
         this.tabela.add(new NotaTrabalho(0, alunos.get(4), trabalhos.get(0), 6.0));
         this.tabela.add(new NotaTrabalho(0, alunos.get(4), trabalhos.get(0), 6.0));
         this.tabela.add(new NotaTrabalho(0, alunos.get(4), trabalhos.get(0), 6.0));
         

         this.tabela.add(new NotaTrabalho(1, alunos.get(4), trabalhos.get(1), 7.0));
         this.tabela.add(new NotaTrabalho(1, alunos.get(4), trabalhos.get(1), 7.0));
         this.tabela.add(new NotaTrabalho(1, alunos.get(4), trabalhos.get(1), 7.0));
         this.tabela.add(new NotaTrabalho(1, alunos.get(4), trabalhos.get(1), 7.0));
     
         this.tabela.add(new NotaTrabalho(2, alunos.get(4), trabalhos.get(2), 8.0));
         this.tabela.add(new NotaTrabalho(2, alunos.get(4), trabalhos.get(2), 8.0));
         this.tabela.add(new NotaTrabalho(2, alunos.get(4), trabalhos.get(2), 8.0));
         this.tabela.add(new NotaTrabalho(2, alunos.get(4), trabalhos.get(2), 8.0));

        this.tabela.add(new NotaTrabalho(3, alunos.get(4), trabalhos.get(3), 9.0));
        this.tabela.add(new NotaTrabalho(3, alunos.get(4), trabalhos.get(3), 9.0));
        this.tabela.add(new NotaTrabalho(3, alunos.get(4), trabalhos.get(3), 9.0));
        this.tabela.add(new NotaTrabalho(3, alunos.get(4), trabalhos.get(3), 9.0));



         this.tabela.add(new NotaTrabalho(0, alunos.get(5), trabalhos.get(0), 6.0));
         this.tabela.add(new NotaTrabalho(0, alunos.get(5), trabalhos.get(0), 6.0));
         this.tabela.add(new NotaTrabalho(0, alunos.get(5), trabalhos.get(0), 6.0));
         this.tabela.add(new NotaTrabalho(0, alunos.get(5), trabalhos.get(0), 6.0));

         this.tabela.add(new NotaTrabalho(1, alunos.get(5), trabalhos.get(1), 7.0));
         this.tabela.add(new NotaTrabalho(1, alunos.get(5), trabalhos.get(1), 7.0));
         this.tabela.add(new NotaTrabalho(1, alunos.get(5), trabalhos.get(1), 7.0));
         this.tabela.add(new NotaTrabalho(1, alunos.get(5), trabalhos.get(1), 7.0));

         this.tabela.add(new NotaTrabalho(2, alunos.get(5), trabalhos.get(2), 8.0));
         this.tabela.add(new NotaTrabalho(2, alunos.get(5), trabalhos.get(2), 8.0));
         this.tabela.add(new NotaTrabalho(2, alunos.get(5), trabalhos.get(2), 8.0));
         this.tabela.add(new NotaTrabalho(2, alunos.get(5), trabalhos.get(2), 8.0));

        this.tabela.add(new NotaTrabalho(3, alunos.get(5), trabalhos.get(3), 9.0));
        this.tabela.add(new NotaTrabalho(3, alunos.get(5), trabalhos.get(3), 9.0));
          this.tabela.add(new NotaTrabalho(3, alunos.get(5), trabalhos.get(3), 9.0));
          this.tabela.add(new NotaTrabalho(3, alunos.get(5), trabalhos.get(3), 9.0));



         this.tabela.add(new NotaTrabalho(0, alunos.get(6), trabalhos.get(0), 6.0));
         this.tabela.add(new NotaTrabalho(0, alunos.get(6), trabalhos.get(0), 6.0));
         this.tabela.add(new NotaTrabalho(0, alunos.get(6), trabalhos.get(0), 6.0));
         this.tabela.add(new NotaTrabalho(0, alunos.get(6), trabalhos.get(0), 6.0));

         
         this.tabela.add(new NotaTrabalho(1, alunos.get(6), trabalhos.get(1), 7.0));
         this.tabela.add(new NotaTrabalho(1, alunos.get(6), trabalhos.get(1), 7.0));
         this.tabela.add(new NotaTrabalho(1, alunos.get(6), trabalhos.get(1), 7.0));
         this.tabela.add(new NotaTrabalho(1, alunos.get(6), trabalhos.get(1), 7.0));
         

         this.tabela.add(new NotaTrabalho(22, alunos.get(6), trabalhos.get(2), 8.0));
         this.tabela.add(new NotaTrabalho(2, alunos.get(6), trabalhos.get(2), 8.0));
         this.tabela.add(new NotaTrabalho(2, alunos.get(6), trabalhos.get(2), 8.0));
         this.tabela.add(new NotaTrabalho(2, alunos.get(6), trabalhos.get(2), 8.0));

        this.tabela.add(new NotaTrabalho(3, alunos.get(6), trabalhos.get(3), 9.0));
        this.tabela.add(new NotaTrabalho(3, alunos.get(6), trabalhos.get(3), 9.0));
         this.tabela.add(new NotaTrabalho(3, alunos.get(6), trabalhos.get(3), 9.0));
         this.tabela.add(new NotaTrabalho(3, alunos.get(6), trabalhos.get(3), 9.0));



         this.tabela.add(new NotaTrabalho(0, alunos.get(7), trabalhos.get(0), 6.0));
         this.tabela.add(new NotaTrabalho(0, alunos.get(7), trabalhos.get(0), 6.0));
         this.tabela.add(new NotaTrabalho(0, alunos.get(7), trabalhos.get(0), 6.0));
         this.tabela.add(new NotaTrabalho(0, alunos.get(7), trabalhos.get(0), 6.0));

         this.tabela.add(new NotaTrabalho(1, alunos.get(7), trabalhos.get(1), 7.0));
         this.tabela.add(new NotaTrabalho(1, alunos.get(7), trabalhos.get(1), 7.0));
         this.tabela.add(new NotaTrabalho(1, alunos.get(7), trabalhos.get(1), 7.0));
         this.tabela.add(new NotaTrabalho(1, alunos.get(7), trabalhos.get(1), 7.0));

         this.tabela.add(new NotaTrabalho(2, alunos.get(7), trabalhos.get(2), 8.0));
         this.tabela.add(new NotaTrabalho(2, alunos.get(7), trabalhos.get(2), 8.0));
         this.tabela.add(new NotaTrabalho(2, alunos.get(7), trabalhos.get(2), 8.0));
         this.tabela.add(new NotaTrabalho(2, alunos.get(7), trabalhos.get(2), 8.0));

        this.tabela.add(new NotaTrabalho(3, alunos.get(7), trabalhos.get(3), 9.0));
        this.tabela.add(new NotaTrabalho(3, alunos.get(7), trabalhos.get(3), 9.0));
         this.tabela.add(new NotaTrabalho(3, alunos.get(7), trabalhos.get(3), 9.0));
         this.tabela.add(new NotaTrabalho(3, alunos.get(7), trabalhos.get(3), 9.0));




         this.tabela.add(new NotaTrabalho(0, alunos.get(8), trabalhos.get(0), 6.0));
         this.tabela.add(new NotaTrabalho(0, alunos.get(8), trabalhos.get(0), 6.0));
         this.tabela.add(new NotaTrabalho(0, alunos.get(8), trabalhos.get(0), 6.0));
         this.tabela.add(new NotaTrabalho(0, alunos.get(8), trabalhos.get(0), 6.0));

         this.tabela.add(new NotaTrabalho(1, alunos.get(8), trabalhos.get(1), 7.0));
         this.tabela.add(new NotaTrabalho(1, alunos.get(8), trabalhos.get(1), 7.0));
         this.tabela.add(new NotaTrabalho(1, alunos.get(8), trabalhos.get(1), 7.0));
         this.tabela.add(new NotaTrabalho(1, alunos.get(8), trabalhos.get(1), 7.0));

         this.tabela.add(new NotaTrabalho(2, alunos.get(8), trabalhos.get(2), 8.0));
         this.tabela.add(new NotaTrabalho(2, alunos.get(8), trabalhos.get(2), 8.0));
         this.tabela.add(new NotaTrabalho(2, alunos.get(8), trabalhos.get(2), 8.0));
         this.tabela.add(new NotaTrabalho(2, alunos.get(8), trabalhos.get(2), 8.0));

         
        this.tabela.add(new NotaTrabalho(3, alunos.get(8), trabalhos.get(3), 9.0));
        this.tabela.add(new NotaTrabalho(3, alunos.get(8), trabalhos.get(3), 9.0));
         this.tabela.add(new NotaTrabalho(3, alunos.get(8), trabalhos.get(3), 9.0));
         this.tabela.add(new NotaTrabalho(3, alunos.get(8), trabalhos.get(3), 9.0));



         this.tabela.add(new NotaTrabalho(0, alunos.get(9), trabalhos.get(0), 6.0));
         this.tabela.add(new NotaTrabalho(0, alunos.get(9), trabalhos.get(0), 6.0));
         this.tabela.add(new NotaTrabalho(0, alunos.get(9), trabalhos.get(0), 6.0));
         this.tabela.add(new NotaTrabalho(0, alunos.get(9), trabalhos.get(0), 6.0));

         this.tabela.add(new NotaTrabalho(1, alunos.get(9), trabalhos.get(1), 7.0));
         this.tabela.add(new NotaTrabalho(1, alunos.get(9), trabalhos.get(1), 7.0));
         this.tabela.add(new NotaTrabalho(1, alunos.get(9), trabalhos.get(1), 7.0));
         this.tabela.add(new NotaTrabalho(1, alunos.get(9), trabalhos.get(1), 7.0));

         this.tabela.add(new NotaTrabalho(2, alunos.get(9), trabalhos.get(2), 8.0));
         this.tabela.add(new NotaTrabalho(2, alunos.get(9), trabalhos.get(2), 8.0));
         this.tabela.add(new NotaTrabalho(2, alunos.get(9), trabalhos.get(2), 8.0));
         this.tabela.add(new NotaTrabalho(2, alunos.get(9), trabalhos.get(2), 8.0));

        this.tabela.add(new NotaTrabalho(3, alunos.get(9), trabalhos.get(3), 9.0));
        this.tabela.add(new NotaTrabalho(3, alunos.get(9), trabalhos.get(3), 9.0));
         this.tabela.add(new NotaTrabalho(3, alunos.get(9), trabalhos.get(3), 9.0));
         this.tabela.add(new NotaTrabalho(3, alunos.get(9), trabalhos.get(3), 9.0));




        this.tabela.add(new NotaTrabalho(0, alunos.get(10), trabalhos.get(0), 6.0));
         this.tabela.add(new NotaTrabalho(0, alunos.get(10), trabalhos.get(0), 6.0));
         this.tabela.add(new NotaTrabalho(0, alunos.get(10), trabalhos.get(0), 6.0));
         this.tabela.add(new NotaTrabalho(0, alunos.get(10), trabalhos.get(0), 6.0));

         this.tabela.add(new NotaTrabalho(1, alunos.get(10), trabalhos.get(1), 7.0));
         this.tabela.add(new NotaTrabalho(1, alunos.get(10), trabalhos.get(1), 7.0));
         this.tabela.add(new NotaTrabalho(1, alunos.get(10), trabalhos.get(1), 7.0));
         this.tabela.add(new NotaTrabalho(1, alunos.get(10), trabalhos.get(1), 7.0));

         this.tabela.add(new NotaTrabalho(2, alunos.get(10), trabalhos.get(2), 8.0));
         this.tabela.add(new NotaTrabalho(2, alunos.get(10), trabalhos.get(2), 8.0));
         this.tabela.add(new NotaTrabalho(2, alunos.get(10), trabalhos.get(2), 8.0));
         this.tabela.add(new NotaTrabalho(2, alunos.get(10), trabalhos.get(2), 8.0));

        this.tabela.add(new NotaTrabalho(3, alunos.get(10), trabalhos.get(3), 9.0));
        this.tabela.add(new NotaTrabalho(3, alunos.get(10), trabalhos.get(3), 9.0));
         this.tabela.add(new NotaTrabalho(3, alunos.get(10), trabalhos.get(3), 9.0));
         this.tabela.add(new NotaTrabalho(3, alunos.get(10), trabalhos.get(3), 9.0));



         this.tabela.add(new NotaTrabalho(0, alunos.get(11), trabalhos.get(0), 6.0));
         this.tabela.add(new NotaTrabalho(0, alunos.get(11), trabalhos.get(0), 6.0));
         this.tabela.add(new NotaTrabalho(0, alunos.get(11), trabalhos.get(0), 6.0));
         this.tabela.add(new NotaTrabalho(0, alunos.get(11), trabalhos.get(0), 6.0));

         this.tabela.add(new NotaTrabalho(1, alunos.get(11), trabalhos.get(1), 7.0));
         this.tabela.add(new NotaTrabalho(1, alunos.get(11), trabalhos.get(1), 7.0));
         this.tabela.add(new NotaTrabalho(1, alunos.get(11), trabalhos.get(1), 7.0));
         this.tabela.add(new NotaTrabalho(1, alunos.get(11), trabalhos.get(1), 7.0));

         this.tabela.add(new NotaTrabalho(2, alunos.get(11), trabalhos.get(2), 8.0));
         this.tabela.add(new NotaTrabalho(2, alunos.get(11), trabalhos.get(2), 8.0));
         this.tabela.add(new NotaTrabalho(2, alunos.get(11), trabalhos.get(2), 8.0));
         this.tabela.add(new NotaTrabalho(2, alunos.get(11), trabalhos.get(2), 8.0));

        this.tabela.add(new NotaTrabalho(3, alunos.get(11), trabalhos.get(3), 9.0));
        this.tabela.add(new NotaTrabalho(3, alunos.get(11), trabalhos.get(3), 9.0));
        this.tabela.add(new NotaTrabalho(3, alunos.get(11), trabalhos.get(3), 9.0));
        this.tabela.add(new NotaTrabalho(3, alunos.get(11), trabalhos.get(3), 9.0));

     }

    public NotaTrabalhoFakeDB(){

        super();
    }
}

