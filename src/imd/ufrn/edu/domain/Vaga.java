package imd.ufrn.edu.domain;

public class Vaga{
	
    private double largura;
    private double comprimento;
    private Veiculo veiculo;
    private boolean estaVazia;
    private String local;
	
    public Vaga() {
	
	}
	public Vaga(double largura, double comprimento, Veiculo veiculo, boolean estaVazia, String local) {
		this.largura = largura;
		this.comprimento = comprimento;
		this.veiculo = veiculo;
		this.estaVazia = estaVazia;
		this.local = local;
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
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	
	
    
	
    

}
