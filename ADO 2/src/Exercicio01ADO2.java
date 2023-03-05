// https://replit.com/@CARONAPRAEX/Exercicio-01-ADO-2#Main.java
import java.util.Scanner;

public class Exercicio01ADO2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // double produto = 1;

        // for(int i = 1; i <= 3; i++){

        //   System.out.print("Digite o " + i + "º " + "número: ");
        //   double numeros = entrada.nextDouble();

        //   produto *= numeros;
        // }

        // System.out.print("O produto dos três números é " + produto);


        System.out.print("Digite o primeiro número: ");
        double n1 = entrada.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = entrada.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double n3 = entrada.nextDouble();

        System.out.println("O produto dos três números é: " + n1 * n2 * n3);

        entrada.close();
    }
}