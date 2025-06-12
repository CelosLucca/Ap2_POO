package model;

public class Minicurso extends Evento {

    private int cargaHoraria;
    private Instrutor instrutor;

    public Minicurso(String titulo, String data, String duracao, int orcamento, Instrutor instrutor) {
        super(titulo, data, duracao, orcamento);
        this.cargaHoraria = cargaHoraria;
        this.instrutor = instrutor;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }
}
