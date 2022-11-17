package imd.ufrn.edu.model;

import java.time.LocalDateTime;

public class Veiculo {
    private String placa;
    private String cor;
    private String modelo;
    private String marca;

    private LocalDateTime dataDeRegistro;

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public LocalDateTime getDataDeRegistro() {
        return dataDeRegistro;
    }

    public void setDataDeRegistro(LocalDateTime dataDeRegistro) {
        this.dataDeRegistro = dataDeRegistro;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", dataDeRegistro=" + dataDeRegistro +
                '}';
    }
}
