import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        // Criando o objeto scanner
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário para digitar seu nome
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();  // Lê o nome completo

        // Exibindo a mensagem de boas-vindas
        System.out.println("Olá, " + nome + "! Seja bem-vindo(a).");

        // Fechar o scanner
        scanner.close();
    }
}
