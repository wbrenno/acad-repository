package uniderp.poo.escola.Servico;

import java.util.ArrayList;

import uniderp.poo.escola.Dominio.Aluno;
import uniderp.poo.escola.Repositorio.AlunoRepositorio;

public class AlunoServico extends BaseGenericaServico<AlunoRepositorio ,Aluno>{

    public AlunoServico(){
        this.repo = new AlunoRepositorio();
    }


    @Override
    public Aluno Inserir(Aluno tupla) {
        return this.repo.Create(tupla);
    }

    @Override
    public Aluno Obter(int codigo) {
        return this.repo.Read(codigo);
    }

    @Override
    public ArrayList<Aluno> Listar() {
        return this.repo.ReadAll();
    }

    @Override
    public Aluno Atualizar(Aluno tupla) {
        return this.repo.Update(tupla);
    }

    @Override
    public Aluno Excluir(int codigo) {
        return this.repo.Delete(codigo);
    }    
}
