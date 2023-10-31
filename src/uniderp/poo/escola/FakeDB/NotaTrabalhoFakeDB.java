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
         this.tabela.add(new NotaTrabalho(1, alunos.get(0), trabalhos.get(0), 6.0));

         this.tabela.add(new NotaTrabalho(2, alunos.get(0), trabalhos.get(1), 7.0));
         this.tabela.add(new NotaTrabalho(3, alunos.get(0), trabalhos.get(1), 7.0));

         this.tabela.add(new NotaTrabalho(4, alunos.get(0), trabalhos.get(2), 8.0));
         this.tabela.add(new NotaTrabalho(5, alunos.get(0), trabalhos.get(2), 8.0));

        this.tabela.add(new NotaTrabalho(6, alunos.get(0), trabalhos.get(3), 9.0));
        this.tabela.add(new NotaTrabalho(7, alunos.get(0), trabalhos.get(3), 9.0));


        

         this.tabela.add(new NotaTrabalho(8, alunos.get(1), trabalhos.get(0), 6.0));
         this.tabela.add(new NotaTrabalho(9, alunos.get(1), trabalhos.get(0), 6.0));

         this.tabela.add(new NotaTrabalho(10, alunos.get(1), trabalhos.get(1), 7.0));
         this.tabela.add(new NotaTrabalho(11, alunos.get(1), trabalhos.get(1), 7.0));

         this.tabela.add(new NotaTrabalho(12, alunos.get(1), trabalhos.get(2), 8.0));
         this.tabela.add(new NotaTrabalho(13, alunos.get(1), trabalhos.get(2), 8.0));

        this.tabela.add(new NotaTrabalho(14, alunos.get(1), trabalhos.get(3), 9.0));
        this.tabela.add(new NotaTrabalho(15, alunos.get(1), trabalhos.get(3), 9.0));




         this.tabela.add(new NotaTrabalho(16, alunos.get(2), trabalhos.get(0), 6.0));
         this.tabela.add(new NotaTrabalho(17, alunos.get(2), trabalhos.get(0), 6.0));

         this.tabela.add(new NotaTrabalho(18, alunos.get(2), trabalhos.get(1), 7.0));
         this.tabela.add(new NotaTrabalho(19, alunos.get(2), trabalhos.get(1), 7.0));

         this.tabela.add(new NotaTrabalho(20, alunos.get(2), trabalhos.get(2), 8.0));
         this.tabela.add(new NotaTrabalho(21, alunos.get(2), trabalhos.get(2), 8.0));

        this.tabela.add(new NotaTrabalho(22, alunos.get(2), trabalhos.get(3), 9.0));
        this.tabela.add(new NotaTrabalho(23, alunos.get(2), trabalhos.get(3), 9.0));




         this.tabela.add(new NotaTrabalho(24, alunos.get(3), trabalhos.get(0), 6.0));
         this.tabela.add(new NotaTrabalho(25, alunos.get(3), trabalhos.get(0), 6.0));

         this.tabela.add(new NotaTrabalho(26, alunos.get(3), trabalhos.get(1), 7.0));
         this.tabela.add(new NotaTrabalho(27, alunos.get(3), trabalhos.get(1), 7.0));

         this.tabela.add(new NotaTrabalho(28, alunos.get(3), trabalhos.get(2), 8.0));
         this.tabela.add(new NotaTrabalho(29, alunos.get(3), trabalhos.get(2), 8.0));

        this.tabela.add(new NotaTrabalho(30, alunos.get(3), trabalhos.get(3), 9.0));
        this.tabela.add(new NotaTrabalho(31, alunos.get(3), trabalhos.get(3), 9.0));




         this.tabela.add(new NotaTrabalho(32, alunos.get(4), trabalhos.get(0), 6.0));
         this.tabela.add(new NotaTrabalho(33, alunos.get(4), trabalhos.get(0), 6.0));

         this.tabela.add(new NotaTrabalho(34, alunos.get(4), trabalhos.get(1), 7.0));
         this.tabela.add(new NotaTrabalho(35, alunos.get(4), trabalhos.get(1), 7.0));

         this.tabela.add(new NotaTrabalho(36, alunos.get(4), trabalhos.get(2), 8.0));
         this.tabela.add(new NotaTrabalho(37, alunos.get(4), trabalhos.get(2), 8.0));

        this.tabela.add(new NotaTrabalho(38, alunos.get(4), trabalhos.get(3), 9.0));
        this.tabela.add(new NotaTrabalho(39, alunos.get(4), trabalhos.get(3), 9.0));



         this.tabela.add(new NotaTrabalho(40, alunos.get(5), trabalhos.get(0), 6.0));
         this.tabela.add(new NotaTrabalho(41, alunos.get(5), trabalhos.get(0), 6.0));

         this.tabela.add(new NotaTrabalho(42, alunos.get(5), trabalhos.get(1), 7.0));
         this.tabela.add(new NotaTrabalho(43, alunos.get(5), trabalhos.get(1), 7.0));

         this.tabela.add(new NotaTrabalho(44, alunos.get(5), trabalhos.get(2), 8.0));
         this.tabela.add(new NotaTrabalho(45, alunos.get(5), trabalhos.get(2), 8.0));

        this.tabela.add(new NotaTrabalho(46, alunos.get(5), trabalhos.get(3), 9.0));
        this.tabela.add(new NotaTrabalho(47, alunos.get(5), trabalhos.get(3), 9.0));



         this.tabela.add(new NotaTrabalho(48, alunos.get(6), trabalhos.get(0), 6.0));
         this.tabela.add(new NotaTrabalho(49, alunos.get(6), trabalhos.get(0), 6.0));

         this.tabela.add(new NotaTrabalho(50, alunos.get(6), trabalhos.get(1), 7.0));
         this.tabela.add(new NotaTrabalho(51, alunos.get(6), trabalhos.get(1), 7.0));

         this.tabela.add(new NotaTrabalho(52, alunos.get(6), trabalhos.get(2), 8.0));
         this.tabela.add(new NotaTrabalho(53, alunos.get(6), trabalhos.get(2), 8.0));

        this.tabela.add(new NotaTrabalho(54, alunos.get(6), trabalhos.get(3), 9.0));
        this.tabela.add(new NotaTrabalho(55, alunos.get(6), trabalhos.get(3), 9.0));



         this.tabela.add(new NotaTrabalho(56, alunos.get(7), trabalhos.get(0), 6.0));
         this.tabela.add(new NotaTrabalho(57, alunos.get(7), trabalhos.get(0), 6.0));

         this.tabela.add(new NotaTrabalho(58, alunos.get(7), trabalhos.get(1), 7.0));
         this.tabela.add(new NotaTrabalho(259, alunos.get(7), trabalhos.get(1), 7.0));

         this.tabela.add(new NotaTrabalho(60, alunos.get(7), trabalhos.get(2), 8.0));
         this.tabela.add(new NotaTrabalho(61, alunos.get(7), trabalhos.get(2), 8.0));

        this.tabela.add(new NotaTrabalho(62, alunos.get(7), trabalhos.get(3), 9.0));
        this.tabela.add(new NotaTrabalho(63, alunos.get(7), trabalhos.get(3), 9.0));




         this.tabela.add(new NotaTrabalho(64, alunos.get(8), trabalhos.get(0), 6.0));
         this.tabela.add(new NotaTrabalho(65, alunos.get(8), trabalhos.get(0), 6.0));

         this.tabela.add(new NotaTrabalho(66, alunos.get(8), trabalhos.get(1), 7.0));
         this.tabela.add(new NotaTrabalho(67, alunos.get(8), trabalhos.get(1), 7.0));

         this.tabela.add(new NotaTrabalho(68, alunos.get(8), trabalhos.get(2), 8.0));
         this.tabela.add(new NotaTrabalho(69, alunos.get(8), trabalhos.get(2), 8.0));

        this.tabela.add(new NotaTrabalho(70, alunos.get(8), trabalhos.get(3), 9.0));
        this.tabela.add(new NotaTrabalho(71, alunos.get(8), trabalhos.get(3), 9.0));



         this.tabela.add(new NotaTrabalho(72, alunos.get(9), trabalhos.get(0), 6.0));
         this.tabela.add(new NotaTrabalho(73, alunos.get(9), trabalhos.get(0), 6.0));

         this.tabela.add(new NotaTrabalho(74, alunos.get(9), trabalhos.get(1), 7.0));
         this.tabela.add(new NotaTrabalho(75, alunos.get(9), trabalhos.get(1), 7.0));

         this.tabela.add(new NotaTrabalho(76, alunos.get(9), trabalhos.get(2), 8.0));
         this.tabela.add(new NotaTrabalho(77, alunos.get(9), trabalhos.get(2), 8.0));

        this.tabela.add(new NotaTrabalho(78, alunos.get(9), trabalhos.get(3), 9.0));
        this.tabela.add(new NotaTrabalho(79, alunos.get(9), trabalhos.get(3), 9.0));




        this.tabela.add(new NotaTrabalho(80, alunos.get(10), trabalhos.get(0), 6.0));
         this.tabela.add(new NotaTrabalho(81, alunos.get(10), trabalhos.get(0), 6.0));

         this.tabela.add(new NotaTrabalho(82, alunos.get(10), trabalhos.get(1), 7.0));
         this.tabela.add(new NotaTrabalho(83, alunos.get(10), trabalhos.get(1), 7.0));

         this.tabela.add(new NotaTrabalho(84, alunos.get(10), trabalhos.get(2), 8.0));
         this.tabela.add(new NotaTrabalho(85, alunos.get(10), trabalhos.get(2), 8.0));

        this.tabela.add(new NotaTrabalho(86, alunos.get(10), trabalhos.get(3), 9.0));
        this.tabela.add(new NotaTrabalho(87, alunos.get(10), trabalhos.get(3), 9.0));



         this.tabela.add(new NotaTrabalho(88, alunos.get(11), trabalhos.get(0), 6.0));
         this.tabela.add(new NotaTrabalho(89, alunos.get(11), trabalhos.get(0), 6.0));

         this.tabela.add(new NotaTrabalho(90, alunos.get(11), trabalhos.get(1), 7.0));
         this.tabela.add(new NotaTrabalho(91, alunos.get(11), trabalhos.get(1), 7.0));

         this.tabela.add(new NotaTrabalho(92, alunos.get(11), trabalhos.get(2), 8.0));
         this.tabela.add(new NotaTrabalho(93, alunos.get(11), trabalhos.get(2), 8.0));

        this.tabela.add(new NotaTrabalho(94, alunos.get(11), trabalhos.get(3), 9.0));
        this.tabela.add(new NotaTrabalho(95, alunos.get(11), trabalhos.get(3), 9.0));

     }

    public NotaTrabalhoFakeDB(){

        super();
    }
}

