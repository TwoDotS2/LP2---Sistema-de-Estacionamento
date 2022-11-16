package imd.ufrn.edu.domain;

public class Vaga extends Apartamento {
	
    private double largura;
    private double comprimento;
    private Veiculo veiculo;
    private boolean estaVazia;
	
    public Vaga() {
	
	}
	public Vaga(double largura, double comprimento, Veiculo veiculo, boolean estaVazia, int apartamanto) {
		super(apartamanto);
		this.largura = largura;
		this.comprimento = comprimento;
		this.veiculo = veiculo;
		this.estaVazia = estaVazia;
	}
	
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	public boolean isEstaVazia() {
		return estaVazia;
	}
	public void setEstaVazia(boolean estaVazia) {
		this.estaVazia = estaVazia;
	}
    
	
    

}
