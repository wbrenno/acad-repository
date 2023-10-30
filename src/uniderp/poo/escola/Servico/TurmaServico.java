package uniderp.poo.escola.Servico;

import java.util.ArrayList;

import uniderp.poo.escola.Dominio.Turma;
import uniderp.poo.escola.Repositorio.TurmaRepositorio;

public class TurmaServico extends BaseGenericaServico<TurmaRepositorio, Turma>{
            public TurmaServico(){
        this.repo = new TurmaRepositorio();
    }
    @Override
    public Turma Inserir(Turma tupla) {
        return this.repo.Create(tupla);
    }

    @Override
    public Turma Obter(int codigo) {
        return this.repo.Read(codigo);
    }

    @Override
    public ArrayList<Turma> Listar() {
        return this.repo.ReadAll();
    }

    @Override
    public Turma Atualizar(Turma tupla) {
        return this.repo.Update(tupla);
    }

    @Override
    public Turma Excluir(int codigo) {
        return this.repo.Delete(codigo);
    }    
}
