package imd.ufrn.edu.model;

import java.util.Hashtable;


public class Patio {
    private Hashtable<Integer, Vaga> vagas;

    public Patio(){}

    public void gerarPatio(int numeroTotalDeVagas){
        vagas = new Hashtable<Integer, Vaga>(numeroTotalDeVagas);

        for (int i = 1; i < numeroTotalDeVagas; i++) {
            vagas.put(i, gerarVaga(i));
        }
    }

    private Vaga gerarVaga(int numero){
        Vaga vaga = new Vaga();
        vaga.setNumero(numero);

        return vaga;
    }

}
