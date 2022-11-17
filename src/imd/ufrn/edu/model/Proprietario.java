package imd.ufrn.edu.model;

import imd.ufrn.edu.model.Apartamento;
import imd.ufrn.edu.model.Pessoa;

public class Proprietario extends Pessoa {
	
	private Apartamento apto;

	public Apartamento getApto() {
		return apto;
	}
	
	public void setApto(Apartamento apto) {
		this.apto = apto;
	}
	
	
}
