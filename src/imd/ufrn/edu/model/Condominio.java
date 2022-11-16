package imd.ufrn.edu.model;

import java.util.ArrayList;
import java.util.List;

import imd.ufrn.edu.domain.Apartamento;
import imd.ufrn.edu.domain.Morador;

public class Condominio {
private List<Apartamento> apartamentos;
private List<Morador> moradores;
	
	public void cadastrarApartamento(Apartamento apto) {
		if(apartamentos == null) {
			apartamentos = new ArrayList<Apartamento>();
		}
		apartamentos.add(apto);
	}
	
	public List<Apartamento> listarApartamentos() {
		return apartamentos;
	}
	
	public void cadastrarMorador(Morador morador) {
		if(moradores == null) {
			moradores = new ArrayList<Morador>();
		}
		moradores.add(morador);
	}
	
	public List<Morador> listarMoradores() {
		return moradores;
	}
}
