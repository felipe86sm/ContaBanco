import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        boolean isValidAccountNumber = false;
        boolean isValidBalance = false;

        int accountNumber = 0;
        double balance = 0;

        while (!isValidAccountNumber) {
            System.out.print("\nDigite o número da conta:\n");

            try {
                accountNumber = Integer.parseInt(scanner.nextLine());
                isValidAccountNumber = true;
            } catch (Exception e) {
                System.out.print("\nNúmero da conta inválido!\n");
            }
        }

        System.out.print("\nDigite a agência:\n");
        String agencyNumber = scanner.nextLine();

        System.out.print("\nDigite o nome do cliente:\n");
        String clientName = scanner.nextLine();

        while (!isValidBalance) {
            System.out.print("\nDigite o saldo da conta:\n");

            try {
                balance = Double.parseDouble(scanner.nextLine());
                isValidBalance = true;
            } catch (Exception e) {
                System.out.print("\nSaldo inválido!\n");
            }
        }

        System.out.printf(
                "\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque\n",
                clientName, agencyNumber, accountNumber, balance);

        scanner.close();
    }
}
