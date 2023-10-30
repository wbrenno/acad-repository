package uniderp.poo.escola.Dominio;

public class Disciplina extends BaseIdentificador {
    
    protected String nome;
    protected String ementa;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmenta() {
        return ementa;
    }
    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public Disciplina(int codigo, String nome, String ementa){

        super(codigo);
        this.nome = nome;
        this.ementa = ementa;
    }
}
