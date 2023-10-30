package uniderp.poo.escola.Repositorio;

import java.util.ArrayList;

import uniderp.poo.escola.Dominio.NotaTrabalho;
import uniderp.poo.escola.FakeDB.NotaTrabalhoFakeDB;

public class NotaTrabalhoRepositorio extends BaseGenericaRepositorio<NotaTrabalho, NotaTrabalhoFakeDB>{

    @Override
    public NotaTrabalho Create(NotaTrabalho instancia) {
        int tam = this.dataset.size() - 1;
        int proxCodigo = this.dataset.get(tam).getCodigo();
        proxCodigo++;
        instancia.setCodigo(proxCodigo);
        this.dataset.add(instancia);
        return instancia;
    }

    @Override
    public NotaTrabalho Read(int codigo) {
        for(NotaTrabalho NotaTrabalho : this.dataset){
            if(NotaTrabalho.getCodigo() == codigo){
                return NotaTrabalho;
            }
        }
        return null;
    }
    @Override
    public ArrayList<NotaTrabalho> ReadAll() {
        return this.dataset;
    }

    @Override
    public NotaTrabalho Update(NotaTrabalho instancia) {
        NotaTrabalho alvo = this.Read(instancia.getCodigo());
        alvo.setCodigo(instancia.getCodigo());
        alvo.setNota(instancia.getNota());
        alvo.setTrabalho(instancia.getTrabalho());
        return alvo;
    }

  public NotaTrabalho Delete(int codigo) {
        int selecionar = acharcodigo(codigo);
        if(selecionar != -1){
            NotaTrabalho notaTrabalhoRemovido = this.dataset.remove(selecionar);
            return notaTrabalhoRemovido;
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