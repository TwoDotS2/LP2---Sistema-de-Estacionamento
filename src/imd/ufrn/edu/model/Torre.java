package imd.ufrn.edu.model;

import java.util.List;

public class Torre {
    private String nome;
    private List<Apartamento> listaDeApartamentos;
    private int andares;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAndares() {
        return andares;
    }

    public void setAndares(int andares) {
        this.andares = andares;
    }
}
