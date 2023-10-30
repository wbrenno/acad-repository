package uniderp.poo.escola.Repositorio;

import java.util.ArrayList;

import uniderp.poo.escola.Dominio.RendimentoEscolar;
import uniderp.poo.escola.FakeDB.RendimentoEscolarFakeDB;

public class RendimentoEscolarRepositorio extends BaseGenericaRepositorio<RendimentoEscolar, RendimentoEscolarFakeDB>{

    @Override
    public RendimentoEscolar Create(RendimentoEscolar instancia) {
        int tam = this.dataset.size() - 1;
        int proxCodigo = this.dataset.get(tam).getCodigo();
        proxCodigo++;
        instancia.setCodigo(proxCodigo);
        this.dataset.add(instancia);
        return instancia;
    }

    @Override
    public RendimentoEscolar Read(int codigo) {
        for(RendimentoEscolar rendimentoEscolar : this.dataset){
            if(rendimentoEscolar.getCodigo() == codigo){
                return rendimentoEscolar;
            }
        }
        return null;
    }

    @Override
    public ArrayList<RendimentoEscolar> ReadAll() {
        return this.dataset;
    }

    @Override
    public RendimentoEscolar Update(RendimentoEscolar instancia) {

         RendimentoEscolar alvo = this.Read(instancia.getCodigo());

         alvo.setMediaGeral(instancia.getMediaGeral());
         alvo.setMediaTrab(instancia.getMediaTrab());
         alvo.setPrimeiraP(instancia.getPrimeiraP());
         alvo.setSegundaP(instancia.getSegundaP());
         alvo.setTrabalhos(instancia.getTrabalhos());
         alvo.setTurma(instancia.getTurma());
         return alvo;
    }

    @Override
    public RendimentoEscolar Delete(int codigo) {
        int selecionar = acharcodigo(codigo);
        if(selecionar != -1){
            RendimentoEscolar rendimentoEscolarRemovido = this.dataset.remove(selecionar);
            return rendimentoEscolarRemovido;
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