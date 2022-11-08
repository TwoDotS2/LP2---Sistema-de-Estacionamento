package imd.ufrn.edu.domain;

import java.util.List;

public class Apartamento {
    private int numero;
    private String bloco;
    private int andar;
    private List<Pessoa> moradores;
    private List<Vaga> vagas;

    //Construtor Vazio
    public Apartamento() {}

    //Getters e Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public List<Pessoa> getMoradores() {
        return moradores;
    }

    public void setMoradores(List<Pessoa> moradores) {
        this.moradores = moradores;
    }

    public List<Vaga> getVagas() {
        return vagas;
    }

    public void setVagas(List<Vaga> vagas) {
        this.vagas = vagas;
    }
}
