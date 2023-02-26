// https://replit.com/@CARONAPRAEX/Exercicio-03#Main.java
import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // System.out.print("Digite um número: ");
        // int n = entrada.nextInt();

        // for (int i = 1; i <= 10; i++) {
        //     int resultado = n * i;
        //     System.out.println(n + " x " + i + " = " + resultado);
        // }

         System.out.print("Digite um número: ");
         int n = entrada.nextInt();

         System.out.println(n + " x " + " 1 " + " = " + n);
         System.out.println(n + " x " + " 2 " + " = " + n * 2);
         System.out.println(n + " x " + " 3 " + " = " + n * 3);
         System.out.println(n + " x " + " 4 " + " = " + n * 4);
         System.out.println(n + " x " + " 5 " + " = " + n * 5);
         System.out.println(n + " x " + " 6 " + " = " + n * 6);
         System.out.println(n + " x " + " 7 " + " = " + n * 7);
         System.out.println(n + " x " + " 8 " + " = " + n * 8);
         System.out.println(n + " x " + " 9 " + " = " + n * 9);
         System.out.println(n + " x " + " 10 " + " = " + n * 10);

        entrada.close();
    }

}