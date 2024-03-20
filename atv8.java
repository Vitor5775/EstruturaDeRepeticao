import java.util.Scanner;

public class SomaEMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        double media;
        int numero;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            numero = scanner.nextInt();
            soma += numero;
        }

        media = soma / 5.0;

        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);

        scanner.close();
    }
}
