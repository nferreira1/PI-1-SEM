// https://replit.com/@CARONAPRAEX/Exercicio-02-ADO-2#Main.java
import java.util.Scanner;

public class Exercicio02ADO2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // System.out.print("Digite um número: ");
        // int n1 = entrada.nextInt();

        // for (int i = 1; i <= 3; i++) {
        //     int multiplo = n1 * i;
        //     System.out.println("O " + i + "º " + "multíplo é " + multiplo);
        // }

        System.out.print("Digite um número: ");
        int n = entrada.nextInt();

        System.out.println("O primeiro multíplo é " + n);
        System.out.println("O segundo multíplo é " + n * 2);
        System.out.println("O terceiro multíplo é " + n * 3);

        entrada.close();
    }

}