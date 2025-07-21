import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        System.out.println("Filme: Superman");

        int anoDeLancamento = 2025;
        System.out.println("Ano de lançamento: " + anoDeLancamento );

        boolean incluidoNoPlano = true;
        if (incluidoNoPlano) {
            System.out.println("Ta no plano!");
        } else {
            System.out.println("Não está no plano!");
        }

        /*double notaDoFilme = 10;*/
        double mediaFilme = (10 + 6.3 + 8.0) / 3;
        System.out.println("Nota: " + mediaFilme);

        String sinopse = "FILME DO SUPERMAN MUITO IRADO COM CACHORRO E TEM MUITA LUTA MUITO ABSOLUTE CINEMA SLK !!!!!";
        System.out.println("Sinopse: " + sinopse);

        int estrelas = (int) mediaFilme;
        System.out.println(estrelas);


    }
}