package imd.ufrn.edu.model;

import imd.ufrn.edu.model.Veiculo;

import java.util.UUID;

public class Vaga {

    private static UUID uuid;
    private int numero;
    private Veiculo veiculo;
    private String complemento;


    public int getNumero() { return numero; }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return "Vaga{" +
                "numero=" + numero +
                ", veiculo=" + veiculo +
                ", complemento='" + complemento + '\'' +
                '}';
    }
}
