public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        var scanner = new java.util.Scanner(System.in);

        System.out.println("Por favor, digite o número da agência:");
        var agency = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta:");
        var accountNumber = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente:");
        var clientName = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta:");
        var balance = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá " + clientName + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", conta " + accountNumber + " e seu saldo " + balance + " já está disponível para saque.");
    }
}
