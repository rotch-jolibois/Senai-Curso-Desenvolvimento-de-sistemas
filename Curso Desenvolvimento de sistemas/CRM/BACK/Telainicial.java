package outracoisa;

import java.util.Scanner;

public class Telainicial {
    public static void main(String[] args){
        Integer fazer;
        Scanner numero = new Scanner(System.in);
        System.out.println("BEM VINDO AO SISTEMA AMIGUINHO!!!!!!");
        System.out.println("Dignai-vos informar qual providência deseja tomar");
        System.out.println("[1] Clientes , [2] Relatíros, [3] Auditoria, [0] Sair");
        fazer = numero.nextInt();
        Cliente cli = new Cliente();

        switch (fazer){
            case 1:
                cli.cadastro();
                break;





        }












    }










}
