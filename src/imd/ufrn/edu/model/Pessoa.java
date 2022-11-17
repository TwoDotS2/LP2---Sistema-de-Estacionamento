package imd.ufrn.edu.model;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private String cpf;
    private String telefone;
    private LocalDate datanascimento;

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

	public LocalDate getDatanascimento() {
		return datanascimento;
	}

	public void setDatanascimento(int ano, int mes, int dia) {
		this.datanascimento = LocalDate.of(ano, mes, dia);
	}

  	
  	

}
