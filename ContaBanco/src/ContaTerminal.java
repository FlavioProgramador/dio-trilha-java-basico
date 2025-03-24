import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numero;
        String agencia,nomeCliente;
        double saldo;

        
        System.out.println("Por favor! Digite o nome da agência: ");
        agencia = scanner.nextLine();
        

        System.out.println("Por favor, digite o número da Conta!");
        numero = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Por favor, digite o Nome do Cliente!");
        nomeCliente = scanner.nextLine();



        System.out.println("Por favor! Digite o saldo");
        saldo = scanner.nextDouble();



        System.out.println("Olá " + nomeCliente + ". Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta numero " + numero + " e seu saldo " + saldo + " R$ já está disponível para saque.");

        scanner.close();
}
}
    