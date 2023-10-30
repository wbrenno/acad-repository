package uniderp.poo.escola.Repositorio;

import java.util.ArrayList;

import uniderp.poo.escola.Dominio.Trabalho;
import uniderp.poo.escola.FakeDB.TrabalhoFakeDB;

public class TrabalhoRepositorio extends BaseGenericaRepositorio<Trabalho, TrabalhoFakeDB>{

    @Override
    public Trabalho Create(Trabalho instancia) {
        int tam = this.dataset.size() - 1;
        int proxCodigo = this.dataset.get(tam).getCodigo();
        proxCodigo++;
        instancia.setCodigo(proxCodigo);
        this.dataset.add(instancia);
        return instancia;
    }

    @Override
    public Trabalho Read(int codigo) {
        for(Trabalho trabalho : this.dataset){
            if(trabalho.getCodigo() == codigo){
                return trabalho;
            }
        }
        return null;
    }

        @Override
    public ArrayList<Trabalho> ReadAll() {
        return this.dataset;
    }


    @Override
    public Trabalho Update(Trabalho instancia) {
        Trabalho alvo = this.Read(instancia.getCodigo());
        alvo.setDescricao(instancia.getDescricao());
        alvo.setDisciplina(instancia.getDisciplina());
        return alvo;
    }

    @Override
    public Trabalho Delete(int codigo) {
        int selecionar = acharcodigo(codigo);
        if(selecionar != -1){
            Trabalho trabalhoRemovido = this.dataset.remove(selecionar);
            return trabalhoRemovido;
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
