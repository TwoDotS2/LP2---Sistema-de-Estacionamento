package imd.ufrn.edu.domain;


public class Apartamento extends Pessoa {
	private int numApartamento;
    private String bloco;
    
    public Apartamento() {}
    
	public Apartamento(int numApartamento, String bloco, String nome) {
		super(nome);
		this.numApartamento = numApartamento;
		this.bloco = bloco;
	}
	
	public Apartamento(int numApartamento) {
		this.numApartamento = numApartamento;
	}


	public int getNumApartamentoo() {
		return numApartamento;
	}
	public void setApartamento(int numApartamento) {
		this.numApartamento = numApartamento;
	}
	public String getBloco() {
		return bloco;
	}
	public void setBloco(String bloco) {
		this.bloco = bloco;
	}
 
    
    
    
}
