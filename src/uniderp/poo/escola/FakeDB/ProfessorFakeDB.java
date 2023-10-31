package uniderp.poo.escola.FakeDB;

import java.time.LocalDate;
import java.util.ArrayList;
import uniderp.poo.escola.Dominio.Professor;

public class ProfessorFakeDB extends BaseGenericaFakeDB<Professor>{

     @Override
    protected void CarregarDados() {
        this.tabela = new ArrayList<Professor>();

        Professor luiz = new Professor(1, "Luizao", LocalDate.of(1993, 9, 9) , "Luizao", "08080808", "Professor");
        Professor noiza = new Professor(2, "Noiza", LocalDate.of(1992, 8, 8) , "Noizao", "07070707", "Professor");
        Professor oswaldo = new Professor(3, "Oswaldo", LocalDate.of(1991, 7, 7) , "Oswaldao", "06060606", "Professor");
        Professor paulo = new Professor(4, "Paulo", LocalDate.of(1990, 6, 6), "Paulao", "05050505", "Professor");

        tabela.add(luiz);
        tabela.add(noiza);
        tabela.add(oswaldo);
        tabela.add(paulo);
        
    }
     public ProfessorFakeDB(){
            super();
        }
}
