package uniderp.poo.escola.Dominio;

import java.time.LocalDate;

public class Professor extends BasePessoa {

    protected String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Professor(int codigo, String nome, LocalDate dataNascimento, String nomeUsuario,String senha, String cargo){

        super(codigo, nome, dataNascimento, nomeUsuario, senha);
        this.cargo = cargo;
    }
}
