package CRM;

import java.util.ArrayList;
import java.util.Date;

public class Auditoria {

    private ArrayList<String> registros = new ArrayList<>();

    public void registrarCadastro(String nome) {
        registros.add(new Date() + "\nCliente: " + nome + "\nAção: CRM.Cadastro\n");
    }
    public void registrarExclusao(String nome) {
        registros.add(new Date() + "\nCliente: " + nome +"\nAção: CRM.Exclusão\n");
    }
    public void registrarStatus(String nome, String statusAntigo, String statusNovo) {
        registros.add(new Date() + "\nCliente: " + nome + "\nStatus alterado" + "\nDe: " + statusAntigo + "\nPara: " + statusNovo + "\n");
    }

    public void registrarTelefone(String nome, int telefoneAntigo, int telefoneNovo) {
        registros.add(new Date() + "\nCliente: " + nome + "\nTelefone alterado" + "\nDe: " + telefoneAntigo + "\nPara: " + telefoneNovo + "\n");
    }
    public void listarAuditoria() {
        System.out.println( "AUDITORIA");

        for (String registro : registros) {
            System.out.println(registro);
            System.out.println("-------------------------");
        }
    }
}
