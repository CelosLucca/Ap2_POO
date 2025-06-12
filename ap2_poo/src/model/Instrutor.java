package model;

public class Instrutor extends PessoaResponsavel{
    private String formacao;
    private String areaEspecializacao;

    public Instrutor(String nome, String email, String areaEspecializacao, String formacao) {
        super(nome, email);
        this.formacao = formacao;
        this.areaEspecializacao = areaEspecializacao;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getAreaEspecializacao() {
        return areaEspecializacao;
    }

    public void setAreaEspecializacao(String areaEspecializacao) {
        this.areaEspecializacao = areaEspecializacao;
    }

}
