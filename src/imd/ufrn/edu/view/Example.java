package imd.ufrn.edu.view;

import imd.ufrn.edu.domain.Apartamento;
import imd.ufrn.edu.domain.Pessoa;
import imd.ufrn.edu.domain.Proprietario;
import imd.ufrn.edu.domain.Vaga;
import imd.ufrn.edu.domain.Veiculo;
import imd.ufrn.edu.model.Condominio;

public class Example {
    public static void main(String[] args) {
    	
    	Condominio metropole = new Condominio();
    	
    	Apartamento apto = new Apartamento();
    	Vaga vaga = new Vaga();
    	Veiculo veiculo = new Veiculo();
    	
    	
    	Pessoa prop = new Proprietario();
    	prop.setNome("Arthur Silva");
    	prop.setCpf("081.917.954-00");
    	prop.setDatanascimento(1990,9,23);
    	prop.setTelefone("(84)99174-6246");
    	
    	veiculo.setCorCarro("Preto");
    	veiculo.setModeloCarro("Gol");
    	veiculo.setPlacaDoCarro("NNR-8595");
    	veiculo.setRegistroData(null);
    	
    	vaga.setComprimento(500);
    	vaga.setLargura(250);
    	vaga.setLocal("100A");
    	vaga.setVeiculo(veiculo);
    	
    	apto.setNumApartamento(100);
    	apto.setBloco("A");
    	((Proprietario)prop).setApto(apto);
    	apto.setTaxaCondominio(250.0);
    	apto.setVagaEstacionamento(vaga);
    	
    	metropole.cadastrarApartamento(apto);
    	
    }
}
