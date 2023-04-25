import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o Nome do Cliente: ");
        nomeCliente = scan.nextLine();
        System.out.println("Por favor, digite o Número da sua Agência: ");
        agencia = scan.next();
        System.out.println("Por favor, digite o Número da sua Conta: ");
        numero = scan.nextInt();
        System.out.println("Seu Saldo Atual é: ");
        saldo = scan.nextDouble();

        System.out.println("Olá " + nomeCliente + ",obrigado por criar uma conta no nosso banco, sua agência é " + agencia + ",conta " + numero + "e seu saldo R$" + saldo + " já está disponível para saque");
    }
}
