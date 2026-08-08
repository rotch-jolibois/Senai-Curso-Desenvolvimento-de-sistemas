package crm;

import java.util.ArrayList;
import java.util.Scanner;

public class menu {
    public static void main(String[] args){
        /*
        ArrayList <> status = new ArrayList<>();
         */
        Scanner texto = new Scanner(System.in);
        Scanner numeros = new Scanner(System.in);
        Integer resposta;

        System.out.println("HOME - ");
        System.out.println("/n");
        System.out.println("/n");
        System.out.println("Clientes [1] - ");
        System.out.println("Relatórios [2] - ");
        System.out.println("Auditoria [3] - ");
        System.out.println("Sair [0] -");
        resposta = numeros.nextInt();

        switch (resposta){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 0:
                break;
        }











    }
}
