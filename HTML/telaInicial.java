package CRM;

import java.util.Scanner;

public class telaInicial {
    public static void main (String[] args){

        Cliente cli = new Cliente();
        Consulta cliConsulta = new Consulta();
        Relatorio cliRelatorio = new Relatorio();
        Auditoria cliAuditoria = new Auditoria();

        Scanner txt = new Scanner(System.in);
        Scanner num = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema!");
        System.out.println("O que você quer fazer - ");
        System.out.println("Cadastro - [1]");
        System.out.println("Alteração - [2]");
        System.out.println("Exclusão - [3]");
        System.out.println("Relatório - [4]");
        System.out.println("Consulta - [5]");
        System.out.println("Auditoria - [6]");
        Integer resposta = num.nextInt();
        switch (resposta){
            case 1:
                cli.addClientes();
                break;
            case 2:
                cli.alterarCliente();
                break;
            case 3:
                cli.exclusao();
                break;
            case 4:
                cliRelatorio.relatorio();
                break;
            case 5:
                cliConsulta.consulta();
                break;
            case 6:
                cliAuditoria.listarAuditoria();
                break;
        }
    }
}
