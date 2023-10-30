package uniderp.poo.escola.FakeDB;

import java.util.ArrayList;
import java.time.LocalDate;

import uniderp.poo.escola.Dominio.Aluno;

    public class AlunoFakeDB extends BaseGenericaFakeDB<Aluno> {

    @Override
    protected void CarregarDados() {

         this.tabela = new ArrayList<Aluno>();

        Aluno allan   = new Aluno(1, "Allan", LocalDate.of(2001, 2, 2) , "Allanzin", "01010101", "Noturno");
        Aluno breno   = new Aluno(2, "Breno", LocalDate.of(2002, 3, 3) , "Brenim", "02020202", "Noturno");
        Aluno jose    = new Aluno(3, "Jose", LocalDate.of(2003, 4, 4) , "Zezin", "03030303", "Noturno");
        Aluno chaves  = new Aluno(4, "Chaves", LocalDate.of(2004, 5, 5), "Chavin", "04040404", "Noturno");

        tabela.add(allan);
        tabela.add(breno);
        tabela.add(jose);
        tabela.add(chaves);

    }

    public AlunoFakeDB(){
        super();
    }
}