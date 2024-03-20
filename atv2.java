import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    String nome, senha;
    System.out.println("Digite seu nome: ");
    nome = ler.nextLine();
    System.out.println("Digite sua senha: ");
    senha = ler.nextLine();
    while(nome.equals(senha)){
      System.out.println("Senha inválida. Digite novamente: ");
      senha = ler.nextLine();
    }
    System.out.println("Senha válida. Bem vindo!");
  }
}
