package crm;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class Cadastro {

    ArrayList<String> nomeCliente = new ArrayList<String>();
    ArrayList<Integer> idadeCliente = new ArrayList<Integer>();
    ArrayList<String> cpfCliente = new ArrayList<String>();
    ArrayList<Integer> telCliente = new ArrayList<Integer>();
    ArrayList<String> emailCliente = new ArrayList<String>();
    ArrayList<String> estadoCliente = new ArrayList<String>();
    ArrayList<String> cidadeCliente = new ArrayList<String>();
    ArrayList<String> statusCliente = new ArrayList<String>();
    ArrayList<Date> dataCadastro = new ArrayList<Date>();
    ArrayList<String> auditoria = new ArrayList<>();
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

    }
}
