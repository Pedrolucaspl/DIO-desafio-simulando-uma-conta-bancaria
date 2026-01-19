import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numeroConta = s.nextInt();

        System.out.print("Digite a agência: ");
        String agencia = s.next();
        s.nextLine();

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = s.nextLine();

        System.out.print("Digite o saldo inicial: ");
        double saldoInicial = s.nextDouble();
        s.close();

        System.out.println("\n\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo inicial é R$ " + saldoInicial + ".");
    }
}
