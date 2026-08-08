package CRM;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class Cliente {

    ArrayList<String> nomeCliente = new ArrayList<String>();
    ArrayList<Integer> idadeCliente = new ArrayList<Integer>();
    ArrayList<String> cpfCliente = new ArrayList<String>();
    ArrayList<Integer> telCliente = new ArrayList<Integer>();
    ArrayList<String> emailCliente = new ArrayList<String>();
    ArrayList<String> estadoCliente = new ArrayList<String>();
    ArrayList<String> cidadeCliente = new ArrayList<String>();
    ArrayList<String> statusCliente = new ArrayList<String>();
    ArrayList<Date> dataCadastro = new ArrayList<Date>();
    Scanner txt = new Scanner(System.in);
    Scanner num = new Scanner(System.in);

    void addClientes() {
        System.out.println("Nome:");
        nomeCliente.add(txt.nextLine());
        System.out.println("Idade:");
        idadeCliente.add(num.nextInt());
        System.out.println("Cpf:");
        cpfCliente.add(txt.nextLine());
        System.out.println("E-mail:");
        emailCliente.add(txt.nextLine());
        System.out.println("Telefone:");
        telCliente.add(num.nextInt());
        System.out.println("Estado:");
        estadoCliente.add(txt.nextLine());
        System.out.println("Cidade:");
        cidadeCliente.add(txt.nextLine());
        System.out.println("Data:");
        dataCadastro.add(new Date());
        System.out.println("Status:");
        statusCliente.add(txt.nextLine());
    }
    void alterarCliente () {
        Integer id;
        System.out.println("Nome do Cliente a alterar:");
        id = num.nextInt();
        System.out.println("Nome:");
        nomeCliente.set(id, txt.nextLine());
        System.out.println("E-mail:");
        emailCliente.set(id, txt.nextLine());
        System.out.println("Telefone:");
        telCliente.set(id, num.nextInt());
        System.out.println("Estado:");
        estadoCliente.set(id, txt.nextLine());
        System.out.println("Cidade:");
        cidadeCliente.set(id, txt.nextLine());
    }
    void exclusao () {
        Integer idExclusao;
        Integer opcaoExclusao;

        System.out.println("Digite o ID do cliente para excluir:");
        idExclusao = num.nextInt();
        System.out.println("Nome: " + nomeCliente.get(idExclusao));
        System.out.println("CPF: " + cpfCliente.get(idExclusao));
        System.out.println("TEL: " + telCliente.get(idExclusao));
        System.out.println("Email: " + emailCliente.get(idExclusao));
        System.out.println("Endereço: " + estadoCliente.get(idExclusao) + " - " + cidadeCliente.get(idExclusao));
        System.out.println("Status: " + statusCliente.get(idExclusao));
        System.out.println("");
        System.out.println("Deseja EXCLUIR este cliente?");
        System.out.println("[1] SIM - [2] NÃO");
        opcaoExclusao = num.nextInt();
        switch (opcaoExclusao) {
            case 1:
                System.out.println("Feito!");
                nomeCliente.remove(idExclusao);
                cpfCliente.remove(idExclusao);
                telCliente.remove(idExclusao);
                emailCliente.remove(idExclusao);
                estadoCliente.remove(idExclusao);
                cidadeCliente.remove(idExclusao);
                statusCliente.remove(idExclusao);
                dataCadastro.remove(idExclusao);
                break;
            case 2:
                System.out.println("Cancelado!");
                break;
        }
    }
 }

