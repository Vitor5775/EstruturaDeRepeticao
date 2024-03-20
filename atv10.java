import java.util.Scanner;

public class IntervaloNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inicio, fim;

        System.out.print("Digite o primeiro número inteiro: ");
        inicio = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        fim = scanner.nextInt();

        if (inicio > fim) {
            int temp = inicio;
            inicio = fim;
            fim = temp;
        }

        System.out.println("Números no intervalo:");
        for (int i = inicio + 1; i < fim; i++) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
