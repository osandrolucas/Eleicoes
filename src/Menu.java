import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Menu {

    public static void main(String[] args) {

        List<Candidato> candidatoList = new ArrayList();

        while (true) {
            String retorno = JOptionPane.showInputDialog(null, montaMenu(), "MENU PRINCIPAL", -1);
            switch (retorno) {
                case "1":
                    String nome = JOptionPane.showInputDialog(null, "Informe o nome do Candidato", "Cadastro de Candidato", 3);
                    String partido = JOptionPane.showInputDialog(null, "Informe o Partido do Candidato", "Cadastro de Candidato Candidato", 3);
                    int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Idade do Candidato", "Cadastro de Candidato Candidato", 3));
                    Candidato candidato = new Candidato(nome, partido.toUpperCase() , idade);
                    candidatoList.add(candidato);
                    JOptionPane.showMessageDialog(null, "Cadastro Realizado!\n" + candidato.toString(), "Cadastro de Candidato", 1);
                    break;

                case "2":
                    for (Candidato candid : candidatoList) {
                        JOptionPane.showMessageDialog(null, candid.toString());
                    }
                    break;
                case "0":
                    System.exit(0);
                    break;

            }

        }

    }

    public static String montaMenu() {
        String mnu = "1 – Cadastrar Autor\n"
                + "2 - Listar Candidatos\n"
                + "0 – Sair";
        return mnu;
    }
}