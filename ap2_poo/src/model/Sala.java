package model;

public class Sala extends Local {
    private String numero;
    private boolean temequipamento;

    public Sala(String nome, int capacidade, String bloco, String numero, boolean temequipamento) {
        super(nome, capacidade, bloco);
        this.numero = numero;
        this.temequipamento = temequipamento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public boolean isTemequipamento() {
        return temequipamento;
    }

    public void setTemequipamento(boolean temequipamento) {
        this.temequipamento = temequipamento;
    }

}
