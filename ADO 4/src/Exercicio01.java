// https://replit.com/@CARONAPRAEX/Exercicio-01-ADO-04#Main.java
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte num;

        do {
            System.out.print("Digite um número para saber o dia da semana: ");
            num = scanner.nextByte();

            switch (num) {
                case 1 -> System.out.println("O número corresponde a Domingo!");
                case 2 -> System.out.println("O número corresponde a Segunda!");
                case 3 -> System.out.println("O número corresponde a Terça!");
                case 4 -> System.out.println("O número corresponde a Quarta!");
                case 5 -> System.out.println("O número corresponde a Quinta!");
                case 6 -> System.out.println("O número corresponde a Sexta!");
                case 7 -> System.out.println("O número corresponde a Sábado!");
                default -> System.out.println("O número é inválido, digite novamente!");
            }

        } while (num < 1 || num > 7);

        scanner.close();
    }
}