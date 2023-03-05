//https://replit.com/@CARONAPRAEX/Exercicio-02-ADO-03#Main.java
import java.util.Scanner;

class Exercicio02ADO3 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite um lado de um triângulo: ");
    double lado1 = entrada.nextDouble();

    System.out.print("Digite um lado de um triângulo: ");
    double lado2 = entrada.nextDouble();

    System.out.print("Digite um lado de um triângulo: ");
    double lado3 = entrada.nextDouble();

    if ((lado1 + lado2) > lado3 && (lado2 + lado3) > lado1 && lado1 + lado3 > lado2) {
      if (lado1 == lado2 && lado2 == lado3) {
        System.out.print("O triângulo é equilátero!");
      } else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
        System.out.print("O triângulo é isósceles!");
      } else {
        System.out.print("O triângulo é escaleno!");
      }
    } else {
      System.out.println("Não é um triângulo!");
    }
    entrada.close();
  }
}