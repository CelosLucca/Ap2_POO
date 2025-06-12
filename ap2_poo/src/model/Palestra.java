package model;

public class Palestra extends Evento {
    private Palestrante palestranteConvidado;

    public Palestra(String titulo, String data, String duracao, int orcamento) {
        super(titulo, data, duracao, orcamento);
        this.palestranteConvidado = palestranteConvidado;
    }

    public Palestrante getPalestranteConvidado() {
        return palestranteConvidado;
    }

    public void setPalestranteConvidado(Palestrante palestranteConvidado) {
        this.palestranteConvidado = palestranteConvidado;
    }
}
