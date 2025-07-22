import java.time.LocalDate;

public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2025;
        LocalDate hoje = LocalDate.now();
        boolean incluidoNoPlano = true;
        /*double notaDoFilme = 10;*/
        double mediaFilme = (10 + 6.3 + 8.0) / 3;

        if (incluidoNoPlano) {
            System.out.println("Ta no plano!");
        } else {
            System.out.println("Não está no plano!");
        }

        if (anoDeLancamento == hoje.getYear()) {
            System.out.println("Lançamento!!!");
        } else {
            System.out.println("Filme que vale a pena assistir!");
        }
    }
}
