import java.util.Random;
import java.util.Scanner;

public class jogoDaAdivinhacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100) + 1; // Gera um número entre 1 e 100
        int tentativas = 0;
        int numeroDigitado = 0;

        while (tentativas < 5) {
            System.out.println("Digite um número entre 1 e 100");
            numeroDigitado = leitor.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabéns, você adivinhou o número secreto em " + tentativas + " tentativas!");
                break; 
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("O número digitado é maior que o número gerado.");
            } else {
                System.out.println("O número digitado é menor que o número gerado.");
            }
        }

        if (tentativas == 5 && numeroDigitado != numeroGerado) {
            System.out.println("Você não conseguiu adivinhar o número secreto em 5 tentativas, o número era " + numeroGerado);
        }
    }
}


