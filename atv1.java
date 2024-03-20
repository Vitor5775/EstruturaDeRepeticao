import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner nt = new Scanner(System.in);
    int nota = 0;
    System.out.println("Digite uma nota");
    nota = nt.nextInt();
    while (nota >= 10 || nota <= 0) {
      System.out.println("Nota inválida, digite novamente");
      nota = nt.nextInt();
      if (nota >=0 && nota <= 10){
        break;
      }
    }

    if (nota >= 0 && nota <= 10) {
      System.out.println("Nota válida");

      
    }
    
  }
}