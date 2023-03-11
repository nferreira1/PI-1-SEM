//https:replit.com/@CARONAPRAEX/Exercicio-02-ADO-04#Main.java
 import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String opcao;

        do {
            System.out.println("Analise o código a seguir em linguagem de programação Java: \n");
            System.out.println("""
                    public static void main(String[] args) {

                         int a = 10;
                         int b = 5;

                         int soma = a + b;

                         System.out.printf("%d + %d = %d", a, b, soma )
                    }
                    
                    """
            );
            System.out.print("""
                    Ao executar esse programa em um terminal, será escrito na saída padrão:
                    
                    a) 10 + 5 = 15
                    b) 5 + 10 = 15
                    c) 10 - 5 = 10
                    d) 5 - 10 = -5
                    e) 10 + 10 = 20
                    
                    Sua resposta:\s"""
            );
            opcao = scanner.next();

            switch (opcao) {
                case "a", "A" -> System.out.println("Certa resposta!");
                case "b", "B", "c", "C", "d", "D", "e", "E" -> System.out.println("Resposta incorreta!\n");
                default -> System.out.println("\nVocê digitou uma resposta inválida! Digite novamente!\n\n");
            }
        } while (!opcao.equalsIgnoreCase("a"));

        scanner.close();
    }
}