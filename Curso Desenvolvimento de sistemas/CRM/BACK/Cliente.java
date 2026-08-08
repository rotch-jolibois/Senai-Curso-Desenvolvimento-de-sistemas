package outracoisa;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Cliente {
    ArrayList<String> nomeCliente = new ArrayList<String>();
    ArrayList<String> cpfCliente = new ArrayList<String>();
    ArrayList<String> telCliente = new ArrayList<String>();
    ArrayList<String> emailCliente = new ArrayList<String>();
    ArrayList<String> estadoCliente = new ArrayList<String>();
    ArrayList<String> cidadeCliente = new ArrayList<String>();
    ArrayList<Date> data = new ArrayList<Date>();
    ArrayList<String> status = new ArrayList<String>();

    ArrayList<Date> dataAlteracao = new ArrayList<Date>();

    Scanner txt = new Scanner(System.in);
    Scanner num = new Scanner(System.in);

    Integer idGeral = 0;
    Integer opcaoStatus;

    void cadastro(){

        data.add(new Date());

        System.out.println("ID do Cliente:");
        System.out.println(idGeral);
        System.out.println("Nome completo:");
        nomeCliente.add(txt.nextLine());
        System.out.println("CPF:");
        cpfCliente.add(txt.nextLine());
        System.out.println("Telefone:");
        telCliente.add(txt.nextLine());
        System.out.println("Email:");
        emailCliente.add(txt.nextLine());
        System.out.println("Cidade:");
        cidadeCliente.add(txt.nextLine());
        System.out.println("Estado:");
        estadoCliente.add(txt.nextLine());
        do {
            System.out.println("Status --  [1] ATIVO || [2] INATIVO");
            opcaoStatus = num.nextInt();
            idGeral++;

            switch (opcaoStatus) {
                case 1:
                    status.add("ATIVO");
                    break;
                case 2:
                    status.add("INATIVO");
                    break;
                default:
                    System.err.println("Digite [1] ou [2]");
                    break;
            }
        } while (opcaoStatus != 1 && opcaoStatus != 2);
        System.out.println("Cadastro concluído!");
    }
    void alteracao(){

        Integer idAlteracao;
        Integer opcaoAlteracao;
        System.out.println("Digite o ID do cliente para alterar:");
        idAlteracao = num.nextInt();
        System.out.println("Nome: " + nomeCliente.get(idAlteracao));
        System.out.println("CPF: " + cpfCliente.get(idAlteracao));
        System.out.println("TEL: " + telCliente.get(idAlteracao));
        System.out.println("Email: " + emailCliente.get(idAlteracao));
        System.out.println("Endereço: " + estadoCliente.get(idAlteracao)+ " - " + cidadeCliente.get(idAlteracao));
        System.out.println("Status: " + status.get(idAlteracao));

        System.out.println("O que deseja alterar?");
        System.out.println("[1] NOME - ");
        System.out.println("[2] CPF - ");
        System.out.println("[3] TEL - ");
        System.out.println("[4] EMAIL - ");
        System.out.println("[5] ENDEREÇO -");
        System.out.println("[6] STATUS - ");

        opcaoAlteracao = txt.nextInt();

        switch (opcaoAlteracao){

            case 1:
                System.out.println("Novo Nome:");
                nomeCliente.set(idAlteracao, txt.nextLine());
                txt.nextLine();
                break;
            case 2:
                System.out.println("Novo CPF:");
                cpfCliente.set(idAlteracao, txt.nextLine());
                txt.nextLine();
                break;
            case 3:
                System.out.println("Novo TEL:");
                telCliente.set(idAlteracao, txt.nextLine());
                txt.nextLine();
                break;
            case 4:
                System.out.println("Novo Email:");
                emailCliente.set(idAlteracao,txt.nextLine());
                txt.nextLine();
                break;
            case 5:
                System.out.println("Novo Endereço:");
                System.out.println("");
                System.out.println("Cidade - ");
                cidadeCliente.set(idAlteracao, txt.nextLine());
                txt.nextLine();
                System.out.println("Estado - ");
                estadoCliente.set(idAlteracao, txt.nextLine());
                txt.nextLine();
                break;
            case 6:
                int nvStatus;

                System.out.println("Novo Status:");
                System.out.println("[1] ATIVO - [2] INATIVO");
                nvStatus = num.nextInt();
                switch (nvStatus){
                    case 1:
                        System.out.println("Novo Status - ATIVO");
                        status.set(idAlteracao, "ATIVO");
                        break;
                    case 2:
                        System.out.println("Novo Status - INATIVO");
                        status.set(idAlteracao, "INATIVO");
                        break;
                }
                break;
        }
        System.out.println("Alterações salvas!");
        dataAlteracao.add(new Date());
    }
    void exclusao(){

        Integer idExclusao;
        Integer opcaoExclusao;

        System.out.println("Digite o ID do cliente para excluir:");
        idExclusao = num.nextInt();
        System.out.println("Nome: " + nomeCliente.get(idExclusao));
        System.out.println("CPF: " + cpfCliente.get(idExclusao));
        System.out.println("TEL: " + telCliente.get(idExclusao));
        System.out.println("Email: " + emailCliente.get(idExclusao));
        System.out.println("Endereço: " + estadoCliente.get(idExclusao)+ " - " + cidadeCliente.get(idExclusao));
        System.out.println("Status: " + status.get(idExclusao));
        System.out.println("");
        System.out.println("Deseja EXCLUIR este cliente?");
        System.out.println("[1] SIM - [2] NÃO");
        opcaoExclusao = num.nextInt();
        switch (opcaoExclusao){
            case 1:
                System.out.println("Feito!");
                nomeCliente.set(idExclusao, null);
                cpfCliente.set(idExclusao, null);
                telCliente.set(idExclusao, null);
                emailCliente.set(idExclusao, null);
                estadoCliente.set(idExclusao, null);
                cidadeCliente.set(idExclusao, null);
                status.set(idExclusao, null);
                data.set(idExclusao, null);
                break;
            case 2:
                System.out.println("Cancelado!");
                break;











            }












        }
        void consulta(){
        String pesquisa;
        Integer formadepesquisa;
        Scanner numero = new Scanner(System.in);
        Scanner texto = new Scanner(System.in);

            System.out.println("Quer pesquisar por nome [1], CPF [2] ou cidade[3]?");
            formadepesquisa = numero.nextInt();


            switch (formadepesquisa){
                case 1:
                    System.out.println("Qual é o nome do cliente?");
                    pesquisa = texto.nextLine();




                    for (int i = 0; i<nomeCliente.size(); i++){
                        if (nomeCliente.get(i) != null && nomeCliente.get(i).equalsIgnoreCase(pesquisa) ){
                            System.out.println("Nome:" +nomeCliente.get(i));
                            System.out.println("CPF:" + cpfCliente.get(i));
                            System.out.println("Telefone:" + telCliente.get(i));
                            System.out.println("Cidade:" + cidadeCliente.get(i));
                            System.out.println("Status:" + status.get(i));
                            System.out.println("Estado:" + estadoCliente.get(i));
                            System.out.println("E-mail:" + emailCliente.get(i));
                            System.out.println("Data:" + data.get(i));



                        }








                    }
                case 2:
                    System.out.println("Qual é o CPF do cliente?");
                    pesquisa = texto.nextLine();

                    for (int i = 0; i < cpfCliente.size(); i++){
                        if (cpfCliente.get(i) != null && cpfCliente.get(i).equalsIgnoreCase(pesquisa)){
                            System.out.println("Nome:" +nomeCliente.get(i));
                            System.out.println("CPF:" + cpfCliente.get(i));
                            System.out.println("Telefone:" + telCliente.get(i));
                            System.out.println("Cidade:" + cidadeCliente.get(i));
                            System.out.println("Status:" + status.get(i));
                            System.out.println("Estado:" + estadoCliente.get(i));
                            System.out.println("E-mail:" + emailCliente.get(i));
                            System.out.println("Data:" + data.get(i));





                        }





                    } case 3:
                    System.out.println("Qual é a cidade do cliente?");
                    pesquisa = texto.nextLine();

                    for (int i = 0; i< cidadeCliente.size(); i++){
                        if (cidadeCliente.get(i) != null && cidadeCliente.get(i).equalsIgnoreCase(pesquisa)){
                            System.out.println("Nome:" +nomeCliente.get(i));
                            System.out.println("CPF:" + cpfCliente.get(i));
                            System.out.println("Telefone:" + telCliente.get(i));
                            System.out.println("Cidade:" + cidadeCliente.get(i));
                            System.out.println("Status:" + status.get(i));
                            System.out.println("Estado:" + estadoCliente.get(i));
                            System.out.println("E-mail:" + emailCliente.get(i));
                            System.out.println("Data:" + data.get(i));




                        }







                    }









            }








        }
        void exibirCliente(){
        



        }
    }
























