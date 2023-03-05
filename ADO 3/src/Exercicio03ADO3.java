//https://replit.com/@CARONAPRAEX/Exercicio-02-ADO-03#Main.java
import java.util.Scanner;

class Exercicio03ADO3 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite um ano para saber se ele é bissexto: ");
    int ano = entrada.nextInt();

    if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
      System.out.println("O ano é bissexto!");
    } else {
      System.out.println("O ano não é bissexto!");
    }
  }
}