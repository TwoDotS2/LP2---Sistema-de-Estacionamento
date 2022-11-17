package imd.ufrn.edu.view;

import imd.ufrn.edu.controller.Condominio;

import java.util.Scanner;

public class MenusCadastrais {
    private Scanner scanner = new Scanner();

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
    public void menuCriarProjetoDeCondominio(Condominio condominio){
        short torres = 1;
        short andaresPorTorre;
        short apartamentosPorAndar;
        short vagasParaCarro = 1;
        short vagasParaMoto = 1;
        short aux;
        boolean vagaMotoCarro = false; //Variavel para saber se há vagas separadas para moto e carro

        System.out.println("Quantas torres tem o condomínio?");
            aux = scanner.nextShort();
            if (aux < 1){
                System.out.println("Valor inválido.");
                System.out.println("Valor padrão configurado: 1 torre.");
            }

        System.out.println("Quantos andares de apartamento tem cada torre?");
            aux = scanner.nextShort();
            if (aux < 1){
                andaresPorTorre = 10;
                System.out.println("Valor inválido.");
                System.out.println("Valor padrão configurado: 10 andares.");
            }

        System.out.println("Quantos apartamentos tem por andar?");
            aux = scanner.nextShort();
            if (aux < 1){
                apartamentosPorAndar = 4;
                System.out.println("Valor inválido.");
                System.out.println("Valor padrão configurado: 4 apartamentos");
            }

        System.out.println("Há pátio separado para carros e motos? (S/N)”);
            aux = scanner.next();
            if (aux == "S") vagaMotoCarro = true;
            else if (aux == "N") vagaMotoCarro = false;
            else {
                System.out.println("Exceção...s");
            }

        if(vagaMotoCarro) {
            System.out.println("Quantas vagas há para moto por apt.?");
                aux = scanner.nextShort();
                if (aux < 1){
                    vagasParaMoto = 1;
                    System.out.println("Valor inválido.");
                    System.out.println("Valor padrão configurado: 1 vaga de moto por apt.");
                }

            System.out.println("Quantas vagas há para carro por apt.?");
                aux = scanner.nextShort();
                if (aux < 1){
                    vagasParaCarro = 1;
                    System.out.println("Valor inválido.");
                    System.out.println("Valor padrão configurado: 1 vaga de carro por apt.");
                }
        } else{
            System.out.println("Quantas vagas há para carro (De 1 a quanto)?");
            aux = scanner.nextShort();
            if (aux < 1){
                vagasParaCarro = 1;
                System.out.println("Valor inválido.");
                System.out.println("Valor padrão configurado: 1 vaga de carro por apt.");
            }
        }

    }

}
