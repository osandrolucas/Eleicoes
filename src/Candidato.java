
public class Candidato {

    private String nomeCandidato;
    private String partidoPolitico;
    private int idade;

    @Override
    public String toString() {
        return "\nDados do Candidato" +
                "\nCandidato: " + nomeCandidato +
                "\nPartido Politico: " + partidoPolitico +
                "\nIdade: " + idade;
    }

    public Candidato(String nomeCandidato, String partidoPolitico, int idade) {
        this.nomeCandidato = nomeCandidato;
        this.partidoPolitico = partidoPolitico;
        this.idade = idade;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}