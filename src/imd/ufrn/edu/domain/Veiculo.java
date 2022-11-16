package imd.ufrn.edu.domain;

import java.time.LocalDateTime;

public class Veiculo {
	
	private String placaDoCarro;
	private String modeloCarro;
	private String corCarro;
	private LocalDateTime registroData;
	
	
	public Veiculo() {}
	public Veiculo(String placaDoCarro, String modeloCarro, String corCarro, LocalDateTime registroData) {
		this.placaDoCarro = placaDoCarro;
		this.modeloCarro = modeloCarro;
		this.corCarro = corCarro;
		this.registroData = registroData;
	}
	
	public String getPlacaDoCarro() {
		return placaDoCarro;
	}
	public void setPlacaDoCarro(String placaDoCarro) {
		this.placaDoCarro = placaDoCarro;
	}
	public String getModeloCarro() {
		return modeloCarro;
	}
	public void setModeloCarro(String modeloCarro) {
		this.modeloCarro = modeloCarro;
	}
	public String getCorCarro() {
		return corCarro;
	}
	public void setCorCarro(String corCarro) {
		this.corCarro = corCarro;
	}
	public LocalDateTime getRegistroData() {
		return registroData;
	}
	public void setRegistroData(LocalDateTime registroData) {
		this.registroData = registroData;
	}
	
	
}
