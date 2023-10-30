package uniderp.poo.escola.Repositorio;

import java.util.ArrayList;

import uniderp.poo.escola.Dominio.Turma;
import uniderp.poo.escola.FakeDB.TurmaFakeDB;

public class TurmaRepositorio extends BaseGenericaRepositorio<Turma, TurmaFakeDB>{

    @Override
    public Turma Create(Turma instancia) {
        int tam = this.dataset.size() - 1;
        int proxCodigo = this.dataset.get(tam).getCodigo();
        proxCodigo++;
        instancia.setCodigo(proxCodigo);
        this.dataset.add(instancia);
        return instancia;
    }

    @Override
    public Turma Read(int codigo) {
        for(Turma turma : this.dataset){
            if(turma.getCodigo() == codigo){
                return turma;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Turma> ReadAll() {
        return this.dataset;
    }

    @Override
    public Turma Update(Turma instancia) {
        Turma alvo = this.Read(instancia.getCodigo());
        alvo.setCapTurma(instancia.getCapTurma());
        alvo.setDisciplina(instancia.getDisciplina());
        alvo.setProfessor(instancia.getProfessor());
        return alvo;
    
    }
    @Override
    public Turma Delete(int codigo) {
        int selecionar = acharcodigo(codigo);
        if(selecionar != -1){
            Turma turmaRemovido = this.dataset.remove(selecionar);
            return turmaRemovido;
        }
        return null;  
}

private int acharcodigo(int codigo) {
    for (int i = 0; i < this.dataset.size(); i++) {
        if (this.dataset.get(i).getCodigo() == codigo) {
            return i;
        }
    }
    return -1;
}
    
}
