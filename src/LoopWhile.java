import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double nota = 0;
        double media = 0;
        int i = 0;

        while (nota != -1) {
            System.out.println("Que nota tu dá pra essa bomba?");
            nota = leitura.nextDouble();

            if (nota != -1) {
                media += nota;
                i++;
            }
        }
        if (media > 0) {
            System.out.println("Média total do filme: " + media / i);
        }
    }
}
