package imd.ufrn.edu.controller;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import imd.ufrn.edu.model.Pessoa;
import imd.ufrn.edu.model.Vaga;

public class Condominio {
	private Hashtable<String, Torre>  torres;
	private List<Pessoa> moradores;
	private Hashtable<Integer, Vaga> patio;

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
	 * @param vagasPorApt vagas por apartamento
	 */
	public void gerarCondominio(int quantidadeDeTorres, int andaresPorTorre, int apartamentosPorAndar, int vagasPorApt){
		int totalDeVagas = quantidadeDeTorres * andaresPorTorre * apartamentosPorAndar * vagasPorApt;
		Torre auxTorre; //Torre auxiliar para geração do condomino
		Patio auxPatio = new Patio();	//Patio auxiliar para geração do condomino
		String str;

		torres = new Hashtable<String, Torre>(quantidadeDeTorres);

		//Faz um laço para a quantidade de torres
		for (int i = 0; i < quantidadeDeTorres; i++) {
			//Torres enumeradas por letras
			str = Character.toString('A' + i);

			auxTorre = new Torre();

			//Gera uma nova torre
			auxTorre.gerarTorre( andaresPorTorre, apartamentosPorAndar );

			//Atribuir valores à torre
			auxTorre.setNome(str);
			auxTorre.setAndares(andaresPorTorre);
			auxTorre.setApartamentosPorAndar(apartamentosPorAndar);

			//Adiciona nas torres do projeto
			torres.put(str, auxTorre);
		}

		//Gerar patio
		auxPatio.gerarPatio(totalDeVagas);

		patio = auxPatio.getPatio();

	}

	public Hashtable<String, Torre> getTorres() {
		return torres;
	}
	public Torre getTorrePorNome(String nomeDaTorre) {
		return torres.get(nomeDaTorre);
	}

	public Hashtable<Integer, Vaga> getPatio() {
		return patio;
	}
}
