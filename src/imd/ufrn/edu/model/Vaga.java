package imd.ufrn.edu.model;

import java.util.UUID;

public class Vaga {

    private UUID uuid;
    private double largura;
    private double comprimento;
    private int numeroDaVaga;

    private Veiculo veiculo;

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public int getNumeroDaVaga() { return numeroDaVaga; }

    public void setNumero(int numero) {
        this.numeroDaVaga = numero;
    }
}
