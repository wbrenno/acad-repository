package uniderp.poo.escola.FakeDB;

import java.util.ArrayList;

import uniderp.poo.escola.Dominio.Disciplina;

public class DisciplinaFakeDB extends BaseGenericaFakeDB<Disciplina>{

     @Override
    protected void CarregarDados() {
        this.tabela = new ArrayList<Disciplina>();

        Disciplina linguap     = new Disciplina(1, "Lingua Protuguesa", "Nesta materia ira se aprender sobre a Lingua Portuguesa");
        Disciplina matematica  = new Disciplina(2, "Matematica", "Nesta materia ira se aprender sobre a Matematica");
        Disciplina historia    = new Disciplina(3, "Historia", "Nesta materia ira se aprender sobre a Historia");
        Disciplina geografia   = new Disciplina(4, "Geografia", "Nesta materia ira se aprender sobre a Geografia");
        
        tabela.add(linguap);
        tabela.add(matematica);
        tabela.add(historia);
        tabela.add(geografia);
    }
    
    public DisciplinaFakeDB(){
        super();
    }
}
