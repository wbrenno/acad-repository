package uniderp.poo.escola.Dominio;

import java.time.LocalDate;

public class Aluno extends BasePessoa {

    protected String período;

    public String getPeríodo() {
        return período;
    }

    public void setPeríodo(String período) {
        this.período = período;
    }
    
    public Aluno(int codigo, String nome, LocalDate dataNascimento, String nomeUsuario, String senha, String período){

    super(codigo, nome, dataNascimento, nomeUsuario, senha);
    this.período = período;
  }
}
