package imd.ufrn.edu.view;
import imd.ufrn.edu.controller.Condominio;

public class Example {
    public static void main(String[] args) {
    	
    	Condominio metropole = new Condominio();

		//Placeholder de Proprietário
		Pessoa prop = new Proprietario();
    	prop.setNome("Arthur Silva");
    	prop.setCpf("081.917.954-00");
    	prop.setDatanascimento(1990,9,23);
    	prop.setTelefone("(84)99174-6246");

		//Placeholder de Veiculo
		Veiculo veiculo = new Veiculo();
    	veiculo.setCorCarro("Preto");
    	veiculo.setModeloCarro("Gol");
    	veiculo.setPlacaDoCarro("NNR-8595");
    	veiculo.setRegistroData(null);

		//Placeholder de Vaga
		Vaga vaga = new Vaga();
    	vaga.setComprimento(500);
    	vaga.setLargura(250);
    	vaga.setLocal("100A");
    	vaga.setVeiculo(veiculo);

		//Placeholder de apartamento
		Apartamento apto = new Apartamento();
    	apto.setNumApartamento(100);
    	apto.setBloco("A");
    	((Proprietario)prop).setApto(apto);
    	apto.setTaxaCondominio(250.0);
    	apto.setVagaEstacionamento(vaga);
    	
    	metropole.cadastrarApartamento(apto);
    	
    }
}



