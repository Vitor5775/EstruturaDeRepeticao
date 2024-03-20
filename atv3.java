import java.util.Scanner;

public class ValidacaoDeDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        int idade;
        double salario;
        char sexo, estadoCivil;

        do {
            System.out.print("Digite o nome (mais de 3 caracteres): ");
            nome = scanner.nextLine();
        } while (nome.length() <= 3);

        do {
            System.out.print("Digite a idade (entre 0 e 150): ");
            idade = scanner.nextInt();
        } while (idade < 0 || idade > 150);

        do {
            System.out.print("Digite o salário (maior que zero): ");
            salario = scanner.nextDouble();
        } while (salario <= 0);
        
        do {
            System.out.print("Digite o sexo ('f' ou 'm'): ");
            sexo = scanner.next().charAt(0);
        } while (sexo != 'f' && sexo != 'm');
        
        do {
            System.out.print("Digite o estado civil ('s', 'c', 'v', 'd'): ");
            estadoCivil = scanner.next().charAt(0);
        } while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');

        System.out.println("Dados validados com sucesso!");
        scanner.close();
    }
}
