import java.text.SimpleDateFormat;
import java.util.Date;

public class Candidato {

    private String nomeCandidato;
    private String partidoPolitico;
    private Date dataNascimento;
    private int Votos = 0;

    @Override
    public String toString() {
        return "\nDados do Candidato" +
                "\nCandidato: " + nomeCandidato +
                "\nPartido Politico: " + partidoPolitico +
                "\nData de Nascimento: " + new SimpleDateFormat("dd/MM/yyyy").format(dataNascimento);
    }

    public Candidato(String nomeCandidato, String partidoPolitico, Date dataNascimento) {
        this.nomeCandidato = nomeCandidato;
        this.partidoPolitico = partidoPolitico;
        this.dataNascimento = dataNascimento;
        System.out.println("Candidato " + this.nomeCandidato + ", nascido em " + new SimpleDateFormat("dd/MM/yyyy").format(this.dataNascimento) + ", do partido " + this.partidoPolitico + " cadastrado com sucesso!");
    }

    public String getNomeCandidato() {
        return nomeCandidato;
    }

    public void setNomeCandidato(String nomeCandidato) {
        this.nomeCandidato = nomeCandidato;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}