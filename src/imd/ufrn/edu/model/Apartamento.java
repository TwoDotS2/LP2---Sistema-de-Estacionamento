package imd.ufrn.edu.model;

import imd.ufrn.edu.model.Vaga;

import java.util.List;

public class Apartamento {
	private int numero;
    private int andar;

    private boolean estaOcupado;
    private List<Pessoa> moradores; //Moradores do apartamento
    private List<Vaga> vagas;

    private Double taxaCondominio;
    private Vaga vagaEstacionamento;
    

    public Apartamento() {}
    
	public Apartamento(int numApartamento, String bloco, Double taxaCondominio, Vaga vagaEstacionamento) {
		this.numero = numApartamento;
		this.taxaCondominio = taxaCondominio;
		this.vagaEstacionamento = vagaEstacionamento;
	}
	
	public Apartamento(int numApartamento) {
		this.numero = numApartamento;
	}

    //Getters e Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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

	public Double getTaxaCondominio() {
		return taxaCondominio;
	}
    public void setMoradores(List<Pessoa> moradores) {
        this.moradores = moradores;
    }

	public void setTaxaCondominio(Double taxaCondominio) {
		this.taxaCondominio = taxaCondominio;
	}
    public List<Vaga> getVagas() {
        return vagas;
    }

	public Vaga getVagaEstacionamento() {
		return vagaEstacionamento;
	}

	public void setVagaEstacionamento(Vaga vagaEstacionamento) {
		this.vagaEstacionamento = vagaEstacionamento;
	}

    public void setVagas(List<Vaga> vagas) {
        this.vagas = vagas;
    }

	@Override
	public String toString() {
		return "Apartamento{" +
				"numero=" + numero +
				", andar=" + andar +
				'}';
	}
}
