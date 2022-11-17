package imd.ufrn.edu.model;


public class Apartamento {
	private int numApartamento;
    private String bloco;
<<<<<<< HEAD:src/imd/ufrn/edu/model/Apartamento.java
    private int andar;

    private boolean estaOcupado;
    private List<Pessoa> moradores; //Moradores do apartamento
    private List<Vaga> vagas;

    //Construtor Vazio
=======
    private Proprietario prop;
    private Double taxaCondominio;
    private Vaga vagaEstacionamento;
    
>>>>>>> 178132f501dcf1a1a7eb4f4bd574790435bcabf9:src/imd/ufrn/edu/domain/Apartamento.java
    public Apartamento() {}
    
	public Apartamento(int numApartamento, String bloco, Proprietario prop, Double taxaCondominio, Vaga vagaEstacionamento) {
		this.numApartamento = numApartamento;
		this.bloco = bloco;
		this.prop = prop;
		this.taxaCondominio = taxaCondominio;
		this.vagaEstacionamento = vagaEstacionamento;
	}
	
	public Apartamento(int numApartamento) {
		this.numApartamento = numApartamento;
	}

	public String getBloco() {
		return bloco;
	}
	public void setBloco(String bloco) {
		this.bloco = bloco;
	}

	public int getNumApartamento() {
		return numApartamento;
	}

	public void setNumApartamento(int numApartamento) {
		this.numApartamento = numApartamento;
	}

	public Proprietario getProp() {
		return prop;
	}

	public void setProp(Proprietario prop) {
		this.prop = prop;
	}

	public Double getTaxaCondominio() {
		return taxaCondominio;
	}

	public void setTaxaCondominio(Double taxaCondominio) {
		this.taxaCondominio = taxaCondominio;
	}

	public Vaga getVagaEstacionamento() {
		return vagaEstacionamento;
	}

	public void setVagaEstacionamento(Vaga vagaEstacionamento) {
		this.vagaEstacionamento = vagaEstacionamento;
	}

	
 
    
    
    
}
