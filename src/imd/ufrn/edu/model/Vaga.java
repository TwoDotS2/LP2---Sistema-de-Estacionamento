package imd.ufrn.edu.model;

import java.util.UUID;

<<<<<<< HEAD:src/imd/ufrn/edu/model/Vaga.java
public class Vaga {

    private UUID uuid;
    private double largura;
    private double comprimento;
    private int numeroDaVaga;

=======
public class Vaga{
	
    private double largura;
    private double comprimento;
>>>>>>> 178132f501dcf1a1a7eb4f4bd574790435bcabf9:src/imd/ufrn/edu/domain/Vaga.java
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
	
	
    
	
    

<<<<<<< HEAD:src/imd/ufrn/edu/model/Vaga.java
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

    public int getNumeroDaVaga() { return numeroDaVaga; }

    public void setNumero(int numero) {
        this.numeroDaVaga = numero;
    }
=======
>>>>>>> 178132f501dcf1a1a7eb4f4bd574790435bcabf9:src/imd/ufrn/edu/domain/Vaga.java
}
