import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digita o filme ai parceiro");
        String filme = leitura.nextLine();
        System.out.println("Ano do filme irmão");
        int ano = leitura.nextInt();
        System.out.println("Que nota tu dá pra essa bomba?");
        double nota = leitura.nextDouble();
        System.out.println(filme);
        System.out.println(ano);
        System.out.println(nota);
    }
}
