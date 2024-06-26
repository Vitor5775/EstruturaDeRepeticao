import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;
        int numero;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            numero = scanner.nextInt();

            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("O maior número digitado foi: " + maior);
        scanner.close();
    }
}
