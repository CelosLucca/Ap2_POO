package model;

public class Organizador extends PessoaResponsavel{
    private String funcaoAdm;

    public Organizador(String nome, String email, String funcaoAdm) {
        super(nome, email);
        this.funcaoAdm = funcaoAdm;
    }

    public String getFuncaoAdm() {
        return funcaoAdm;
    }

    public void setFuncaoAdm(String funcaoAdm) {
        this.funcaoAdm = funcaoAdm;
    }

}
