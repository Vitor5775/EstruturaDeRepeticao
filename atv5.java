import java.util.Scanner;

public class CrescimentoPopulacionalInterativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int populacaoA, populacaoB, anos;
        double taxaCrescimentoA, taxaCrescimentoB;
        String resposta;

        do {      

            do {
                System.out.print("Informe a população do país A: ");
                populacaoA = scanner.nextInt();
                if (populacaoA <= 0) {
                    System.out.println("A população deve ser maior que zero.");
                }
            } while (populacaoA <= 0);

            do {
                System.out.print("Informe a população do país B: ");
                populacaoB = scanner.nextInt();
                if (populacaoB <= 0) {
                    System.out.println("A população deve ser maior que zero.");
                }
            } while (populacaoB <= 0);

            do {
                System.out.print("Informe a taxa de crescimento anual do país A (em %): ");
                taxaCrescimentoA = scanner.nextDouble();
                if (taxaCrescimentoA <= 0) {
                    System.out.println("A taxa de crescimento deve ser maior que zero.");
                }
            } while (taxaCrescimentoA <= 0);
            
            do {
                System.out.print("Informe a taxa de crescimento anual do país B (em %): ");
                taxaCrescimentoB = scanner.nextDouble();
                if (taxaCrescimentoB <= 0) {
                    System.out.println("A taxa de crescimento deve ser maior que zero.");
                }
            } while (taxaCrescimentoB <= 0);
            
            taxaCrescimentoA /= 100;
            taxaCrescimentoB /= 100;
            
            anos = 0;
            while (populacaoA <= populacaoB) {
                populacaoA += (populacaoA * taxaCrescimentoA);
                populacaoB += (populacaoB * taxaCrescimentoB);
                anos++;
            }

            System.out.println("Serão necessários " + anos + " anos para que a população do país A ultrapasse ou iguale a população do país B.");
            
            System.out.print("Deseja realizar uma nova operação? (s/n): ");
            resposta = scanner.next();
        } while (resposta.equalsIgnoreCase("s"));

        scanner.close();
    }
}
