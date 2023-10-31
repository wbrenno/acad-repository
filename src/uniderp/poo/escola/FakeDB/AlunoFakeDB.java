package uniderp.poo.escola.FakeDB;

import java.util.ArrayList;
import java.time.LocalDate;

import uniderp.poo.escola.Dominio.Aluno;

    public class AlunoFakeDB extends BaseGenericaFakeDB<Aluno> {

    @Override
    protected void CarregarDados() {

         this.tabela = new ArrayList<Aluno>();

        Aluno allan   = new Aluno(1, "Allan", LocalDate.of(2001, 2, 2) , "Allanzin", "01010101", "Noturno");
        Aluno ana   = new Aluno(2, "Ana", LocalDate.of(2001, 2, 2) , "Aninha", "01010101", "Noturno");
        Aluno mala   = new Aluno(3, "Mala", LocalDate.of(2001, 2, 2) , "Malinha", "01010101", "Noturno");

        Aluno breno   = new Aluno(4, "Breno", LocalDate.of(2002, 3, 3) , "Brenim", "02020202", "Noturno");
        Aluno rafael   = new Aluno(5, "Rafael", LocalDate.of(2001, 2, 2) , "Rafinha", "01010101", "Noturno");
        Aluno eber  = new Aluno(6, "Eber", LocalDate.of(2001, 2, 2) , "Berzin", "01010101", "Noturno");

        Aluno jose    = new Aluno(7, "Jose", LocalDate.of(2003, 4, 4) , "Zezin", "03030303", "Noturno");
        Aluno diogo   = new Aluno(8, "Diogo", LocalDate.of(2001, 2, 2) , "Dioguin", "01010101", "Noturno");
        Aluno dioga   = new Aluno(9, "Dioga", LocalDate.of(2001, 2, 2) , "Dioguinha", "01010101", "Noturno");

        Aluno chaves  = new Aluno(10, "Chaves", LocalDate.of(2004, 5, 5), "Chavin", "04040404", "Noturno");
        Aluno guilherme   = new Aluno(11, "Guilherme", LocalDate.of(2001, 2, 2) , "Guilhermin", "01010101", "Noturno");
        Aluno guilherma   = new Aluno(12, "Guilherma", LocalDate.of(2001, 2, 2) , "Guilherminha", "01010101", "Noturno");

        tabela.add(allan);
        tabela.add(ana);
        tabela.add(mala);

        tabela.add(breno);
        tabela.add(rafael);
        tabela.add(eber);

        tabela.add(jose);
        tabela.add(diogo);
        tabela.add(dioga);

        tabela.add(chaves);
        tabela.add(guilherme);
        tabela.add(guilherma);

    }

    public AlunoFakeDB(){
        super();
    }
}
