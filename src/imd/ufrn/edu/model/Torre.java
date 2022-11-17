package imd.ufrn.edu.model;

import java.util.Hashtable;
import java.util.Map;

public class Torre {
    private String nome;
    private Map<Integer, Hashtable<Integer, Apartamento>> torre;
    private int andares;
    public Torre() {}

    public void gerarTorre(int andares, int apartamentosPorAndar){
        torre = new Hashtable<Integer, Hashtable<Integer, Apartamento>>(andares);

        for (Integer i = 1; i <= andares; i++){
            torre.put(i,  gerarAndar( andares, apartamentosPorAndar ) );
        }
    }
    private  Hashtable<Integer, Apartamento> gerarAndar(int andarAtual, int apartamentosPorAndar){
        Hashtable<Integer, Apartamento> andar = new Hashtable<Integer, Apartamento>();

        for(Integer i = 1; i <= apartamentosPorAndar; i++)
            andar.put(
                    i, gerarApartamento(andarAtual, i, apartamentosPorAndar)
            );

        return andar;
    }
    private Apartamento gerarApartamento(int andarAtual, Integer index, int apartamentosPorAndar){
        Apartamento apt = new Apartamento();
            apt.setAndar(andarAtual);
            apt.setNumero(index);

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

    public Map<Integer, Hashtable<Integer, Apartamento>> getTorre() {
        return torre;
    }
}
