package CRM;

import java.util.Scanner;
import java.util.ArrayList;

public class Consulta {

    Cliente cli = new Cliente();

    void consulta() {
        String pesquisa;
        Integer formadepesquisa;
        Scanner numero = new Scanner(System.in);
        Scanner texto = new Scanner(System.in);

        System.out.println("Quer pesquisar por nome [1], CPF [2] ou cidade[3]?");
        formadepesquisa = numero.nextInt();

        switch (formadepesquisa) {
            case 1:
                System.out.println("Qual é o nome do cliente?");
                pesquisa = texto.nextLine();


                for (int i = 0; i < cli.nomeCliente.size(); i++) {
                    if (cli.nomeCliente.get(i) != null && cli.nomeCliente.get(i).equalsIgnoreCase(pesquisa)) {
                        System.out.println("Nome:" + cli.nomeCliente.get(i));
                        System.out.println("CPF:" + cli.cpfCliente.get(i));
                        System.out.println("Cidade:" + cli.cidadeCliente.get(i));
                        System.out.println("Status:" + cli.statusCliente.get(i));
                        System.out.println("Estado:" + cli.estadoCliente.get(i));
                        System.out.println("E-mail:" + cli.emailCliente.get(i));
                        System.out.println("Data:" + cli.dataCadastro.get(i));
                    } else if (cli.nomeCliente.get(i) == null) {
                        System.out.println("Cliente não encontrado!");
                    }
                }
                break;
            case 2:
                System.out.println("Qual é o CPF do cliente?");
                pesquisa = texto.nextLine();

                for (int i = 0; i < cli.cpfCliente.size(); i++) {
                    if (cli.cpfCliente.get(i) != null && cli.cpfCliente.get(i).equalsIgnoreCase(pesquisa)) {
                        System.out.println("Nome:" + cli.nomeCliente.get(i));
                        System.out.println("CPF:" + cli.cpfCliente.get(i));
                        System.out.println("Telefone:" + cli.telCliente.get(i));
                        System.out.println("Cidade:" + cli.cidadeCliente.get(i));
                        System.out.println("Status:" + cli.statusCliente.get(i));
                        System.out.println("Estado:" + cli.estadoCliente.get(i));
                        System.out.println("E-mail:" + cli.emailCliente.get(i));
                        System.out.println("Data:" + cli.dataCadastro.get(i));
                    } else if (cli.nomeCliente.get(i) == null) {
                        System.out.println("Cliente não encontrado!");
                    }
                }
                break;
            case 3:
                System.out.println("Qual é a cidade do cliente?");
                pesquisa = texto.nextLine();

                for (int i = 0; i < cli.cidadeCliente.size(); i++) {
                    if (cli.cidadeCliente.get(i) != null && cli.cidadeCliente.get(i).equalsIgnoreCase(pesquisa)) {
                        System.out.println("Nome:" + cli.nomeCliente.get(i));
                        System.out.println("CPF:" + cli.cpfCliente.get(i));
                        System.out.println("Telefone:" + cli.telCliente.get(i));
                        System.out.println("Cidade:" + cli.cidadeCliente.get(i));
                        System.out.println("Status:" + cli.statusCliente.get(i));
                        System.out.println("Estado:" + cli.estadoCliente.get(i));
                        System.out.println("E-mail:" + cli.emailCliente.get(i));
                        System.out.println("Data:" + cli.dataCadastro.get(i));
                    } else if (cli.nomeCliente.get(i) == null) {
                        System.out.println("Cliente não encontrado!");
                    }
                }
        }

    }


}
