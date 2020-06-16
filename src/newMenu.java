import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class newMenu {

    public static void main(String[] args) throws ParseException {

        List<Candidato> candidatoList = new ArrayList();
        Candidato joao = new Candidato("João da Silva", "PSDB", FormattingDate.StringToDate("01/01/1990"));
        Candidato jose = new Candidato("João da Silva", "PPS", FormattingDate.StringToDate("01/01/1980"));

        //Identificando o mais novo
        if(joao.getDataNascimento().compareTo(jose.getDataNascimento())>0){
            System.out.println("Candidato mais novo: João");
        }else if(joao.getDataNascimento().compareTo(jose.getDataNascimento())<0){
            System.out.println("Candidato mais novo: José");
        }else{
            System.out.println("Candidato mais novo: Os dois candidados tem a mesma idade.");
        }


        //Identificando o mais velho
        if(joao.getDataNascimento().compareTo(jose.getDataNascimento())<0){
            System.out.println("Candidato mais velho: João");
        }else if(joao.getDataNascimento().compareTo(jose.getDataNascimento())>0){
            System.out.println("Candidato mais velho: José");
        }else{
            System.out.println("Candidato mais novo: Os dois candidados tem a mesma idade.");
        }

        //Adicionando candiatos na Lista de Candidatos
        candidatoList.add(joao);
        candidatoList.add(jose);

    }
}


