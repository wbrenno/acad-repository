package uniderp.poo.escola.Dominio;

import java.time.LocalDate;

public abstract class BasePessoa extends BaseIdentificador {

    protected String nome;
    protected LocalDate dataNascimento;
    protected String nomeUsuario;
    protected String senha;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getNomeUsuario() {
        return nomeUsuario;
    }
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public BasePessoa(int codigo, String nome, LocalDate dataNascimento, String nomeUsuario, String senha){

        super(codigo);
        this.nome = nome;
        this. dataNascimento = dataNascimento;
        this. nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

}