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
        System.out.println("-------------------------iEstac-------------------------------");
        System.out.println("---------Sistema de Gestão de Vagas Condominiais--------------");
    }

    public void rodape(){
        System.out.println("---------****************************************---------------");
        System.out.println("----------------------------------------------------------------");
    }

//    public void menuCriarCondominio(/*Privilégio do usuário*/){
////        if(/*Gestor*/){
////            System.out.println(" 1 - Criar novo condomínio");
////            System.out.println(" 2 - Selecionar condomínio");
////        }
////        if(/*Cliente*/)
//        System.out.println(" 1 - Selecionar condomínio já existente");
//    }

    //2- Tela inicial de criação de projeto de condomínio
    public void menuCriarProjetoDeCondominio(Condominio condominio) {
        int torres = 1;
        int andaresPorTorre = 5;
        int apartamentosPorAndar = 4;
        int vagasParaCarro = 1;
        int vagasParaMoto = 1;
        boolean vagaMotoCarro = false; //Variavel para saber se há vagas separadas para moto e carro

        //Variáveis para auxilicar para no tratamento de exceção
        short aux;
        String str;

        //Exibir cabeçalho
        cabecalho();

        System.out.println("Quantas torres tem o condomínio?");
            aux = scanner.nextShort();
            torres = setValorPadrao(aux, torres, 1, " torre(s).");


        System.out.println("Quantos andares tem cada torre?");
            aux = scanner.nextShort();
            andaresPorTorre = setValorPadrao(aux, andaresPorTorre, 1, " andar(es).");


        System.out.println("Quantos apartamentos tem por andar?");
            aux = scanner.nextShort();
            apartamentosPorAndar = setValorPadrao(aux, apartamentosPorAndar, 1, " apartamento(s).");


        System.out.println("Há pátio separado para carros e motos? (S/N)");
            scanner.nextLine();
            str = scanner.next();

            if (str.equals("S")) vagaMotoCarro = true;
            else if (str.equals("N")) vagaMotoCarro = false;
            else {
                System.out.println("Exceção... " + str);
            }

        if (vagaMotoCarro) {
            System.out.println("Quantas vagas há para moto por apt.?");
                aux = scanner.nextShort();
                vagasParaMoto = setValorPadrao(aux, vagasParaMoto, 0, " vaga(s) de moto por apt.");
        }

        System.out.println("Quantas vagas há para carro por apt.?");
            aux = scanner.nextShort();
            vagasParaCarro = setValorPadrao(aux, vagasParaCarro, 1, " vaga(s) de carro(s) por apt.");


        // Gerar condominio
        condominio.gerarCondominio(
            torres,
            andaresPorTorre,
            apartamentosPorAndar,
            vagasParaCarro,
            vagasParaMoto
        );

        rodape();
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

    public void exibirPatioCarros(Condominio condominio){
        Hashtable<Integer, Vaga> vagasDoPatio = condominio.getPatioCarros().getVagas();

        cabecalho();
        System.out.println("\nVagas do patio:");

        for (Vaga vaga: vagasDoPatio.values()) {
            System.out.println(vaga.toString());
        }

        rodape();
    }
    public void exibirTorres(Condominio condominio){
        Hashtable<String, Torre> torres = condominio.getTorres();

        cabecalho();
        System.out.println("\nTodos os apartamentos:");

        for (Torre torre: torres.values()) {
            System.out.println(torre.toString());
        }

        rodape();

    }


    public void cadastrarMorador(Condominio condominio) {

    }

    public void cadastrarVeiculo(Condominio condominio) {

    }
    public void cadastrarVaga(Condominio condominio) {

    }

}
