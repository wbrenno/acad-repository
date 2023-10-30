package uniderp.poo.escola.Repositorio;

import java.util.ArrayList;

import uniderp.poo.escola.Dominio.Professor;
import uniderp.poo.escola.FakeDB.ProfessorFakeDB;

public class ProfessorRepositorio extends BaseGenericaRepositorio<Professor, ProfessorFakeDB>{

    @Override
    public Professor Create(Professor instancia) {
        int tam = this.dataset.size() - 1;
        int proxCodigo = this.dataset.get(tam).getCodigo();
        proxCodigo++;
        instancia.setCodigo(proxCodigo);
        this.dataset.add(instancia);
        return instancia;
    }

    @Override
    public Professor Read(int codigo) {
        for(Professor professor : this.dataset){
            if(professor.getCodigo() == codigo){
                return professor;
            }
        }
        return null;
    }

        @Override
        public ArrayList<Professor> ReadAll() {
        return this.dataset;
    }

    @Override
    public Professor Update(Professor instancia) {
        Professor alvo = this.Read(instancia.getCodigo());
        alvo.setDataNascimento(instancia.getDataNascimento());
        alvo.setNome(instancia.getNome());
        alvo.setCargo(instancia.getCargo());
        return alvo;
    }

    @Override
    public Professor Delete(int codigo) {
        int selecionar = acharcodigo(codigo);
        if(selecionar != -1){
            Professor professorRemovido = this.dataset.remove(selecionar);
            return professorRemovido;
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
