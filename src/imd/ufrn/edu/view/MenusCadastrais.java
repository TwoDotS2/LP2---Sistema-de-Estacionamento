package imd.ufrn.edu.view;

import imd.ufrn.edu.controller.Condominio;

public class Menu {
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

    public void menuCriarProjetoDeCondominio(Condominio condominio){

        System.out.println("Quantas torres tem o condomínio?");
        System.out.println("Quantos andares de apartamento tem cada torre?");
        System.out.println("Quantos apartamentos tem por andar?");
        System.out.println("Há pátio separado para carros e motos?”);

    }


}
