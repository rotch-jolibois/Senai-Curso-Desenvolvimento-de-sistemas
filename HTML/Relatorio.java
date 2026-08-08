package CRM;
import java.util.ArrayList;
public class Relatorio {
    Cliente cli = new Cliente();
    void relatorio() {
        for (int i = 0; i < cli.dataCadastro.size(); i++) {
            boolean repetido = false;
            for (int j = 0; j < i; j++) {
                if (cli.dataCadastro.get(i).equals(cli.dataCadastro.get(j))) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                int contador = 0;
                for (int j = 0; j < cli.dataCadastro.size(); j++) {
                    if (cli.dataCadastro.get(i).equals(cli.dataCadastro.get(j))) {
                        contador++;
                    }
                }
                System.out.println(cli.dataCadastro.get(i) + " - " + contador + " clientes");
            }
        }
    }
}
