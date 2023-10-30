package uniderp.poo.escola.Repositorio;

import java.util.ArrayList;

import uniderp.poo.escola.Dominio.Aluno;
import uniderp.poo.escola.FakeDB.AlunoFakeDB;

public class AlunoRepositorio extends BaseGenericaRepositorio<Aluno, AlunoFakeDB> {

    public AlunoRepositorio(){
        this.db = new AlunoFakeDB();
        this.dataset = new ArrayList<>(db.getTabela());
    }

    @Override
    public Aluno Create(Aluno instancia) {
        int tam = this.dataset.size() - 1;
        int proxCodigo = this.dataset.get(tam).getCodigo();
        proxCodigo++;
        instancia.setCodigo(proxCodigo);
        this.dataset.add(instancia);
        return instancia;
    }

    @Override
    public Aluno Read(int codigo) {
        for(Aluno aluno : this.dataset){
            if(aluno.getCodigo() == codigo){
                return aluno;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Aluno> ReadAll() {
        return this.dataset;
    }

    @Override
    public Aluno Update(Aluno instancia) {
        Aluno alvo = this.Read(instancia.getCodigo());
        alvo.setDataNascimento(instancia.getDataNascimento());
        alvo.setNome(instancia.getNome());
        alvo.setPeríodo(instancia.getPeríodo());
        return alvo;
    }

    @Override
    public Aluno Delete(int codigo) {
        int selecionar = acharcodigo(codigo);
        if(selecionar != -1){
            Aluno alunoRemovido = this.dataset.remove(selecionar);
            return alunoRemovido;
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