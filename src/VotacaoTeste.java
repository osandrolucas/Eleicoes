
public class VotacaoTeste {

    public static void main(String[] args) {

        Eleitor e1  = new Eleitor ("Felipe" , "1555" , "02.10.1994");
        Eleitor e2  = new Eleitor ("Gustavo", "2222", "05.15.2000");
        Eleitor e3  = new Eleitor ("Jadison", "2333", "01.02.1980");
        Eleitor e4  = new Eleitor ("Fabio", "1000", "04.05.1985");
        Eleitor e5  = new Eleitor ("Laura", "1111", "03.08.2002");
        Eleitor e6  = new Eleitor ("Patricia", "0001", "15.12.1998");



        Candidato c1 = new Candidato("Vanderlei" ,"PKL" , 35);
        Candidato c2 = new Candidato("Joel", "KKK" , 51);
        Candidato c3 = new Candidato("Vandison", "LNM", 42);

        Dados dados = new Dados();
        dados.addCandidatos(c1);
        dados.addCandidatos(c2);
        dados.addCandidatos(c3);

        dados.addEleitor(e1);
        dados.addEleitor(e2);
        dados.addEleitor(e3);
        dados.addEleitor(e4);
        dados.addEleitor(e5);
        dados.addEleitor(e6);




    }

}
