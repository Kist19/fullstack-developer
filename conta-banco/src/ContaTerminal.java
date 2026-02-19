import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------------");
        System.out.println("       CRIANDO CONTA       ");
        System.out.println("---------------------------");

        System.out.println("Digite o Número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // limpa o buffer do ENTER

        System.out.println("Digite a Agência (ex: 067-8):");
        String agencia = scanner.nextLine();

        System.out.println("Digite o nome do titular:");
        String titular = scanner.nextLine();

        System.out.println("Informe o Saldo inicial:");
        double saldo = scanner.nextDouble();

        System.out.println("Conta criada com sucesso!");

        System.out.println("Olá " + titular + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
