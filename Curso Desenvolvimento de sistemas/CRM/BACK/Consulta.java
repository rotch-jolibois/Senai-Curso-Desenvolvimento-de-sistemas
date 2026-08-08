package crm;

import java.util.ArrayList;
import java.util.Scanner;

public class Consulta {
    void consultar(){
        Integer resposta;
        Scanner texto = new Scanner(System.in);
        Scanner numeros = new Scanner(System.in);

        System.out.println("Pesquisar cliente por:");
        System.out.println("[1] Nome");
        System.out.println("[2] CPF");
        System.out.println("[3] Cidade");
        resposta = numeros.nextInt();
        String nome = texto.nextLine();
        switch (resposta){
            case 1:
                System.out.println("Qual é o nome do cliente?");

                









        }








    }

}
