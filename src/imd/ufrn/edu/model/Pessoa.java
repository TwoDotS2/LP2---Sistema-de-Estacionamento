package imd.ufrn.edu.model;

public class Pessoa {
    private String nome;
    private String cpf;
    private boolean ehProprietario;

    public Pessoa() {}

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

    public boolean isEhProprietario() {
        return ehProprietario;
    }

    public void setEhProprietario(boolean ehProprietario) {
        this.ehProprietario = ehProprietario;
    }
}
