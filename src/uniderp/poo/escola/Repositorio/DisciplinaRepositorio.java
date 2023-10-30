package uniderp.poo.escola.Repositorio;

import java.util.ArrayList;

import uniderp.poo.escola.Dominio.Disciplina;
import uniderp.poo.escola.FakeDB.DisciplinaFakeDB;

public class DisciplinaRepositorio extends BaseGenericaRepositorio<Disciplina, DisciplinaFakeDB> {
    @Override
    public Disciplina Create(Disciplina instancia) {
        int tam = this.dataset.size() - 1;
        int proxCodigo = this.dataset.get(tam).getCodigo();
        proxCodigo++;
        instancia.setCodigo(proxCodigo);
        this.dataset.add(instancia);
        return instancia;
    }

    @Override
    public Disciplina Read(int codigo) {
          for(Disciplina disciplina : this.dataset){
            if(disciplina.getCodigo() == codigo){
                return disciplina;
            }
        }
        return null;
    }

        @Override
        public ArrayList<Disciplina> ReadAll() {
        return this.dataset;
    }

    @Override
    public Disciplina Update(Disciplina instancia) {
        Disciplina alvo = this.Read(instancia.getCodigo());
        alvo.setCodigo(instancia.getCodigo());
        alvo.setEmenta(instancia.getEmenta());
        alvo.setNome(instancia.getNome());
        return alvo;
    }

    @Override
    public Disciplina Delete(int codigo) {
        int selecionar = acharcodigo(codigo);
        if(selecionar != -1){
            Disciplina disciplinaRemovido = this.dataset.remove(selecionar);
            return disciplinaRemovido;
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
