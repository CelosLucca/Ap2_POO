package model;

public class Auditorio extends Local {
    private boolean temSistemaSom;
    private boolean temEstruturaTraducaoSimultanea;

    public Auditorio(String nomeIdentificador, int capacidadeMaxima, String blocoPredio, boolean temSistemaSom, boolean temEstruturaTraducaoSimultanea) {
        super(nomeIdentificador, capacidadeMaxima, blocoPredio);
        this.temSistemaSom = temSistemaSom;
        this.temEstruturaTraducaoSimultanea = temEstruturaTraducaoSimultanea;
    }

    public boolean isTemSistemaSom() {
        return temSistemaSom;
    }

    public void setTemSistemaSom(boolean temSistemaSom) {
        this.temSistemaSom = temSistemaSom;
    }

    public boolean isTemEstruturaTraducaoSimultanea() {
        return temEstruturaTraducaoSimultanea;
    }

    public void setTemEstruturaTraducaoSimultanea(boolean temEstruturaTraducaoSimultanea) {
        this.temEstruturaTraducaoSimultanea = temEstruturaTraducaoSimultanea;
        }
    }
