package uniderp.poo.escola.FakeDB;

import java.util.ArrayList;

import uniderp.poo.escola.Dominio.Disciplina;
import uniderp.poo.escola.Dominio.Trabalho;

public class TrabalhoFakeDB extends BaseGenericaFakeDB<Trabalho> {

    private DisciplinaFakeDB disciplinaDB;

    public TrabalhoFakeDB(DisciplinaFakeDB disciplinaDB) {
        this.disciplinaDB = disciplinaDB;
    }

     @Override
    protected void CarregarDados() {

        ArrayList<Disciplina> disciplinas = disciplinaDB.getTabela();

        this.tabela = new ArrayList<Trabalho>();

        Trabalho trabLP    = new Trabalho(1, disciplinas.get(0), "Trabalho de Lingua Portuguesa");
        Trabalho trabMat   = new Trabalho(2, disciplinas.get(1), "Trabalho de Matematica");
        Trabalho trabHist  = new Trabalho(3, disciplinas.get(2), "Trabalho de Historia");
        Trabalho trabGeo   = new Trabalho(4, disciplinas.get(3), "Trabalho de Geografia");

        tabela.add(trabLP);
        tabela.add(trabMat);
        tabela.add(trabHist);
        tabela.add(trabGeo);
    
    }
}

