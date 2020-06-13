import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dados {


    private List<Candidato> candidatos = new ArrayList <Candidato>();

    public void addCandidatos (Candidato candidatoASerAdicionado) {
        candidatos.add(candidatoASerAdicionado);
        System.out.println("Candidato " + candidatoASerAdicionado.getNomeCandidato() + " foi cadastrado com sucesso" );
    }

    public Candidato obterCandidato(String nomeCandidato) {
        for (Candidato candidato: candidatos) {
            if (candidato.getNomeCandidato().equals(nomeCandidato)) {
                return candidato;
            }
        }
        return null;
    }

    private List <Eleitor> eleitores = new ArrayList<Eleitor>();

    public void addEleitor(Eleitor eleitorASerAdicionado) {
        eleitores.add(eleitorASerAdicionado);

        System.out.println("Eleitor " + eleitorASerAdicionado.getNomeEleitor() + " cadastrado com sucesso.");

    }



    Scanner sc = new Scanner (System.in);
    Integer valor[] = new Integer[3];
    Integer velho = 0 , jovem = Integer.MAX_VALUE ; {

        for(Integer i = 0; i < valor.length; i++){
            System.out.print("Digite a idade do " + (i+1) +"ยบ Candidato: ");
            valor[i] = sc.nextInt();
            if(valor[i] > velho){
                velho = valor[i];
            }
        }
        for (int j = 0; j < valor.length; j++) {
            if(valor[j] < jovem){
                jovem = valor[j];
            }
        }
        System.out.println("O candidato mais velho tem a idade de  "+ velho + " anos");
        System.out.println("O Candidato mais novo tema a idade de  "+ jovem + " anos ");
    }

}
