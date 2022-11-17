package imd.ufrn.edu.controller;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import imd.ufrn.edu.model.Pessoa;

public class Condominio {
	private Hashtable<String, Torre>  torres;
	private List<Pessoa> moradores;

	private Patio patioCarros;

	private Patio patioMotos;

	public void cadastrarMorador(Pessoa morador) {
		if(moradores == null) {
			moradores = new ArrayList<Pessoa>();
		}
		moradores.add(morador);
	}
	
	public List<Pessoa> listarMoradores() {
		return moradores;
	}

	/**
	 * Função para gerar a estrutura base do projeto do condominio
	 *
	 * @param quantidadeDeTorres quantas torres tem o condomínio
	 * @param andaresPorTorre quantos andares tem cada torre
	 * @param apartamentosPorAndar quantos apartamentos cada torre tem por andar
	 * @param vagasParaCarro quantas vagas de carro há por apartamento
	 * @param vagasParaMoto quantas vagas de moto há por apartamento
	 */
	public void gerarCondominio(int quantidadeDeTorres, int andaresPorTorre, int apartamentosPorAndar, int vagasParaCarro, int vagasParaMoto){
		//Gerar torres do projeto
		torres = new Hashtable<String, Torre>(quantidadeDeTorres);
		Torre placeHolderTorre;

		for (int i = 0; i < quantidadeDeTorres; i++) {
			placeHolderTorre = new Torre();
			//Gera uma nova torre
			placeHolderTorre.gerarTorre( andaresPorTorre, apartamentosPorAndar );

			//Adiciona nas torres do projeto
			torres.put(("A" + i), placeHolderTorre);
		}

		int numeroTotaldeVagas =  quantidadeDeTorres * andaresPorTorre * apartamentosPorAndar;

		//Gerar patio de carros
		patioCarros = new Patio();
		patioCarros.gerarPatio(numeroTotaldeVagas * vagasParaCarro);

		//Gerar patio de motos
		if(vagasParaMoto != 0){
			patioMotos = new Patio();
			patioMotos.gerarPatio(numeroTotaldeVagas * vagasParaMoto);
		}

	}

	public Patio getPatioCarros() {
		return patioCarros;
	}

	public Patio getPatioMotos() {
		return patioMotos;
	}

	public Hashtable<String, Torre> getTorres() {
		return torres;
	}
	public Torre getTorrePorNome(String nomeDaTorre) {
		return torres.get(nomeDaTorre);
	}
}
