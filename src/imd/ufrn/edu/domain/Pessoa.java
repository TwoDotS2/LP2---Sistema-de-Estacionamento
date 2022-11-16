package imd.ufrn.edu.domain;

public class Pessoa {
    private String nome;
    private String cpf;
    private String telefone;

  

	public Pessoa() {}
    
    public Pessoa(String nome, String cpf, String telefone) {
    	this.telefone = telefone;
		this.nome = nome;
		this.cpf = cpf;
	}
    public Pessoa(String nome) {
    	this.nome = nome;
    }

	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getTelefone() {
  		return telefone;
  	}

  	public void setTelefone(String telefone) {
  		this.telefone = telefone;
  	}


}
