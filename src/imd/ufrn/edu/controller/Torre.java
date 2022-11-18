package imd.ufrn.edu.controller;

import imd.ufrn.edu.model.Apartamento;

import java.util.Hashtable;

public class Torre {
    private String nome;
    private Hashtable<Integer, Apartamento> torre;
    private int andares;

    private int apartamentosPorAndar;
    public Torre() {}

    public void gerarTorre(int andares, int apartamentosPorAndar){
        torre = new Hashtable<Integer, Apartamento>(andares);

        for (Integer i = 1; i <= andares; i++){
            torre.put(i,  gerarApartamentos(i,  apartamentosPorAndar) );
        }
    }

    private Apartamento gerarApartamentos(int andarAtual, int apartamentosPorAndar){
        Apartamento apt = new Apartamento();

        for (int i = 0; i < apartamentosPorAndar; i++) {
            apt.setAndar(andarAtual);
            apt.setNumero(i);
        }

        return apt;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAndares() {
        return andares;
    }

    public void setAndares(short andares) {
        this.andares = andares;
    }

    public Hashtable<Integer, Apartamento> getTorre() {
        return torre;
    }
    public Apartamento getAndar(Integer andar) {
        return torre.get(andar);
    }

    public void setAndares(int andares) {
        this.andares = andares;
    }

    public int getApartamentosPorAndar() {
        return apartamentosPorAndar;
    }

    public void setApartamentosPorAndar(int apartamentosPorAndar) {
        this.apartamentosPorAndar = apartamentosPorAndar;
    }

    @Override
    public String toString() {
        return "Torre{" +
                "\nnome='" + nome + '\'' +
                ",\n torre=" + torre.values().toString() +
                ",\n andares=" + andares +
                "}\n";
    }
}
