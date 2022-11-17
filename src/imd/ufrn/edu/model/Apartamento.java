package imd.ufrn.edu.model;


import imd.ufrn.edu.domain.Proprietario;

import java.util.List;

public class Apartamento {
	private int numero;
    private String bloco;
    private int andar;

    private boolean estaOcupado;
    private List<Pessoa> moradores; //Moradores do apartamento
    private List<Vaga> vagas;

    //Construtor Vazio

    private Proprietario prop;
    private Double taxaCondominio;
    private Vaga vagaEstacionamento;
    

    public Apartamento() {}
    
	public Apartamento(int numApartamento, String bloco, Proprietario prop, Double taxaCondominio, Vaga vagaEstacionamento) {
		this.numero = numApartamento;
		this.bloco = bloco;
		this.prop = prop;
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

	public String getBloco() {
		return bloco;
	}
	public void setBloco(String bloco) {
		this.bloco = bloco;
	}

    public int getAndar() {
        return andar;
    }

	public Proprietario getProp() {
		return prop;
	}
    public void setAndar(int andar) {
        this.andar = andar;
    }

	public void setProp(Proprietario prop) {
		this.prop = prop;
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
}
