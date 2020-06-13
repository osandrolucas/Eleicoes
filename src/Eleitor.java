import java.text.SimpleDateFormat;
import java.util.Date;

public class Eleitor {

    private String nomeEleitor;
    private String numeroTitulo;
    private Date dataNascimento;


    public Eleitor(String nomeEleitor, String numeroTitulo, Date dataNascimento) {
        this.nomeEleitor = nomeEleitor;
        this.numeroTitulo = numeroTitulo;
        this.dataNascimento = dataNascimento;
    }
    public String getNomeEleitor() {
        return nomeEleitor;
    }
    public void setNomeEleitor(String nomeEleitor) {
        this.nomeEleitor = nomeEleitor;
    }
    public String getNumeroTitulo() {
        return numeroTitulo;
    }
    public void setNumeroTitulo(String numeroTitulo) {
        this.numeroTitulo = numeroTitulo;
    }
    public Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "\nDados do Eleitor" +
                "\nEleitor: " + nomeEleitor +
                "\nTítulo de Eleitor: " + numeroTitulo +
                "\nData de Nascimento: " + new SimpleDateFormat("dd/MM/yyyy").format(dataNascimento);
    }

    //public void votar()

}