package imd.ufrn.edu.view;

import imd.ufrn.edu.controller.Condominio;
import imd.ufrn.edu.controller.Patio;
import imd.ufrn.edu.controller.Torre;
import imd.ufrn.edu.model.Apartamento;
import imd.ufrn.edu.model.Vaga;

import java.util.Hashtable;
import java.util.Scanner;

public class MenusCadastrais {
    private Scanner scanner = new Scanner(System.in);

    public MenusCadastrais() {}

    public void cabecalho(){
        System.out.println("+------------------------iEstac-----------------------------+");
        System.out.println("|-------Sistema de Gestão de Vagas Condominiais-------------|");
    }

    public void rodape(){
        System.out.println("|------********************************************---------|");
        System.out.println("+-----------------------------------------------------------+");
        System.out.println("\n\n");
    }

    public void gerenciadorDeMenu(Condominio condominio){
        int op;
        System.out.println("1- Visulizar condominio");
        System.out.println("2- Criar projeto de condominio");
        op = scanner.nextInt();

        switch (op){
            case 1:
                break;
            case 2:
                System.out.println("---------------Criar projeto de condominio-----------------");
                System.out.println("1- Inserir valores");
                System.out.println("2- Criar projeto com valor padrão");
                op = scanner.nextInt();

                switch (op){


                    case 1:
                        System.out.println("--------Criar projeto de condominio >> Inserir valores------------");
                        criarProjetoCondominio(condominio);

                        //Exibir o que foi criado
                        exibirPatio(condominio);
                        exibirApartamentos(condominio);

                        break;
                    case 2:
                        System.out.println("-----Criar projeto de condominio >> Criar projeto com valor padrão----");
                        criarProjetoValorPadrao(condominio);

                        //Exibir o que foi criado
                        exibirPatio(condominio);
                        exibirApartamentos(condominio);

                        break;
                }

                break;
            default:
                System.out.println("Opção inválida!");
        }


    }

    //2- Tela inicial de criação de projeto de condomínio
    public void criarProjetoCondominio(Condominio condominio) {
        int torres = 1;
        int andaresPorTorre = 5;
        int apartamentosPorAndar = 4;
        int vagasPorApt = 1;

        //Variáveis para auxilicar para no tratamento de exceção
        int aux;
        String str;

        System.out.println("Quantas torres tem o condomínio?");
            aux = scanner.nextInt();
            torres = setValorPadrao(aux, torres, 1, " torre(s).");

        System.out.println("Quantos andares tem cada torre?");
            aux = scanner.nextInt();
            andaresPorTorre = setValorPadrao(aux, andaresPorTorre, 1, " andar(es).");

        System.out.println("Quantos apartamentos tem por andar?");
            aux = scanner.nextInt();
            apartamentosPorAndar = setValorPadrao(aux, apartamentosPorAndar, 1, " apartamento(s).");

        System.out.println("Quantas vagas há por apt.?");
            aux = scanner.nextInt();
        vagasPorApt = setValorPadrao(aux, vagasPorApt, 1, " vaga(s) de carro(s) por apt.");


        // Gerar condominio
        condominio.gerarCondominio(
            torres,
            andaresPorTorre,
            apartamentosPorAndar,
            vagasPorApt
        );

    }

    public void criarProjetoValorPadrao(Condominio condominio){
        int torres = 1;
        int andaresPorTorre = 5;
        int apartamentosPorAndar = 4;
        int vagasPorApt = 1;

        // Gerar condominio
        condominio.gerarCondominio(
                torres,
                andaresPorTorre,
                apartamentosPorAndar,
                vagasPorApt
        );
    }
    //Funcão auxiliar para deixar a leitura do código mais limpa
    private int setValorPadrao(int valorInserido, int valorPadrao, int condicao, String desc){
            if(valorInserido < condicao) {
                System.out.println("Valor inválido.");
                System.out.println("Valor padrão configurado: " + valorPadrao + desc);

                return valorPadrao;
            }

        return valorInserido;
    }

    public void exibirPatio(Condominio condominio){
        Hashtable<Integer, Vaga> vagasDoPatio = condominio.getPatio();

        System.out.println("\n Vagas do patio:");

        for (Vaga vaga: vagasDoPatio.values()) {
            System.out.println("\t" + vaga.toString());
        }

    }

    public void exibirApartamentos(Condominio condominio){
        Hashtable<String, Torre> torres = condominio.getTorres();
        int qtdTorres = torres.size() + 'A';
        int aptPorAndar;

        System.out.println("\t Todos os apartamentos:\n");

        //Printar todos os apartamentos por andar
        for (int i = 'A'; i < qtdTorres; i++) {
            aptPorAndar = torres
                    .get(Character.toString(i))
                    .getApartamentosPorAndar();

            System.out.println("Torre " + Character.toString(i) + ":\n");
            for (int j = 0; j < aptPorAndar; j++) {
                System.out.println(
                torres
                    .get(Character.toString(i))
                    .getTorre()
                    .get(j)
                    .toString()
                );
            }
        }
    }


    public void cadastrarMorador(Condominio condominio) {

    }

    public void cadastrarVeiculo(Condominio condominio) {

    }
    public void cadastrarVaga(Condominio condominio) {

    }

    public void menuInicial(Condominio condominio){

    }
}
