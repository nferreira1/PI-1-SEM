import java.util.Scanner;

public class Exercicio04 {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite um nome: ");
    String nome = entrada.next();
    int caracteres = nome.length();

    System.out.println("A quantidade de caracteres desta string é de: " + caracteres);

    entrada.close();
  }
}
