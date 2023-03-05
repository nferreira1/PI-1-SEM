//https://replit.com/@CARONAPRAEX/Exercicio-01-ADO-03#Main.java
import java.util.Scanner;

class Exercicio01ADO3 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite o valor da sua compra: ");
    double valor = entrada.nextDouble();

    double desconto;

    if (valor >= 300) {
      desconto = valor * 0.20;
      valor -= desconto;
    } else {
      desconto = valor * 0.15;
      valor -= desconto;
    }

    System.out.println("O valor da sua compra com o desconto é de " + valor);

    entrada.close();
  }
}