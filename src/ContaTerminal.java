import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite seu nome completo");
            String nomeCompleto = scanner.nextLine();
            System.out.println("Digite o numero da Agência bancária: ");
            String agencia = scanner.nextLine();
            System.out.println("Digite o numero da conta: ");
            int numConta = scanner.nextInt();
            System.out.println("Insira o saldo da conta: $");
            double saldoConta = scanner.nextDouble();

            System.err.println(
                    "Olá " + nomeCompleto + ", obrigado por criar uma nova conta conosco\nVamos revisar sua conta:");
            System.out.println("O número da sua agência é: " + agencia + "\nO numero da sua conta é: " + numConta
                    + "\nO seu saldo disponível para saque é de: R$ " + saldoConta);
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}