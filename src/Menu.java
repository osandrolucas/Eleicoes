import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Menu {

    public static void main(String[] args) {

        List<Candidato> candidatoList = new ArrayList();
        List<Eleitor> eleitorList = new ArrayList();

        while (true) {
            String retorno = JOptionPane.showInputDialog(null, montaMenu(), "MENU PRINCIPAL", -1);
            switch (retorno) {
                case "1":
                    String nome = JOptionPane.showInputDialog(null, "Informe o nome do Candidato", "Cadastro de Candidato", 3);
                    String partido = JOptionPane.showInputDialog(null, "Informe o Partido do Candidato", "Cadastro de Candidato", 3);
                    int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Idade do Candidato", "Cadastro de Candidato", 3));
                    Candidato candidato = new Candidato(nome, partido.toUpperCase() , idade);
                    candidatoList.add(candidato);
                    JOptionPane.showMessageDialog(null, "Cadastro Realizado!\n" + candidato.toString(), "Cadastro de Candidato", 1);
                    break;

                case "2":
                    for (Candidato candid : candidatoList) {
                        JOptionPane.showMessageDialog(null, candid.toString());
                    }
                    break;

                case "3":
                    String nome_eleitor = JOptionPane.showInputDialog(null, "Informe o nome do Eleitor", "Cadastro de Eleitor", 3);
                    String n_titulo_eleitor = JOptionPane.showInputDialog(null, "Informe o Título do Eleitor", "Cadastro de Eleitor", 3);
                    String nascimento = JOptionPane.showInputDialog(null, "Informe a idade de Nascimento do Eleitor (DD/MM/YYYY)", "Cadastro de Eleitor", 3);
                    Eleitor eleitor  = new Eleitor(nome_eleitor, n_titulo_eleitor , nascimento);
                    eleitorList.add(eleitor);
                    JOptionPane.showMessageDialog(null, "Cadastro Realizado!\n" + eleitor.toString(), "Cadastro de Eleitor", 1);
                    break;

                case "4":
                    for (Eleitor eleit : eleitorList) {
                        JOptionPane.showMessageDialog(null, eleit.toString());
                    }
                    break;

                case "0":
                    System.exit(0);
                    break;

            }

        }

    }

    public static String montaMenu() {
        String mnu = "1 – Cadastrar Candidato\n"
                + "2 - Listar Candidato\n"
                + "3 - Cadastrar Eleitor\n"
                + "4 - Listar Eleitores\n"
                + "0 – Sair";
        return mnu;
    }
}