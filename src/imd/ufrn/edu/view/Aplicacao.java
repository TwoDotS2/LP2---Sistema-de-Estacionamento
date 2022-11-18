package imd.ufrn.edu.view;
import imd.ufrn.edu.controller.Condominio;
import imd.ufrn.edu.model.Vaga;
import imd.ufrn.edu.model.*;

public class Aplicacao {
    public static void main(String[] args) {
    	
    	Condominio metropole = new Condominio();
		MenusCadastrais menu = new MenusCadastrais();

		//Dados em mock
		{
			//Placeholder de Veiculo
			Veiculo veiculo = new Veiculo();
			veiculo.setCor("Preto");
			veiculo.setModelo("Gol");
			veiculo.setPlaca("NNR-8595");
			veiculo.setDataDeRegistro(null);

			//Placeholder de Vaga
			Vaga vaga = new Vaga();
			vaga.setNumero(1);
			vaga.setVeiculo(veiculo);

			//Placeholder de apartamento
			Apartamento apto = new Apartamento();
			apto.setNumero(100);
			apto.setTaxaCondominio(250.0);
			apto.setVagaEstacionamento(vaga);
		}

		while (true) {
			menu.gerenciadorDeMenu(metropole);
		}
    }
}



