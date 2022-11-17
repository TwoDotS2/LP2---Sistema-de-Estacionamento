package imd.ufrn.edu.controller;

import java.util.ArrayList;
import java.util.List;

import imd.ufrn.edu.model.Apartamento;
import imd.ufrn.edu.model.Pessoa;
import imd.ufrn.edu.model.Vaga;

public class Condominio {
private List<Apartamento> apartamentos;
private List<Pessoa> moradores;
	
	public void cadastrarApartamento(Apartamento apto) {
		if(apartamentos == null) {
			apartamentos = new ArrayList<Apartamento>();
		}
		apartamentos.add(apto);
	}
	
	public List<Apartamento> listarApartamentos() {
		return apartamentos;
	}
	
	public void cadastrarMorador(Pessoa morador) {
		if(moradores == null) {
			moradores = new ArrayList<Pessoa>();
		}
		moradores.add(morador);
	}
	
	public List<Pessoa> listarMoradores() {
		return moradores;
	}
}
