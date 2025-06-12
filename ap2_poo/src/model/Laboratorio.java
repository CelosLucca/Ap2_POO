package model;

public class Laboratorio extends Local {
    private int numeroComputadores;
    private String tipoLaboratorio; // "informatica" or "quimica"

    public Laboratorio(String nomeIdentificador, int capacidadeMaxima, String blocoPredio, int numeroComputadores, String tipoLaboratorio) {
        super(nomeIdentificador, capacidadeMaxima, blocoPredio);
        this.numeroComputadores = numeroComputadores;
        this.tipoLaboratorio = tipoLaboratorio;
    }

    public int getNumeroComputadores() {
        return numeroComputadores;
    }

    public void setNumeroComputadores(int numeroComputadores) {
        this.numeroComputadores = numeroComputadores;
    }

    public String getTipoLaboratorio() {
        return tipoLaboratorio;
    }

    public void setTipoLaboratorio(String tipoLaboratorio) {
        this.tipoLaboratorio = tipoLaboratorio;
    }

}
