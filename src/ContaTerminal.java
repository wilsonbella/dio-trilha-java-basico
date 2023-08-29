import java.util.Scanner;
import static java.util.Locale.US;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(US);

        System.out.println("Por gentileza digite o número da agencia !");
        String agencia = scanner.next();

        System.out.println("Digite o número da sua conta :");
        int numero = scanner.nextInt();

        System.out.println("Digite o seu nome :");
        String  nomeCliente = scanner.next();

        System.out.println("Digite o seu sobrenome :");
        String sobrenome = scanner.next();

        System.out.println("Digite o seu saldo :");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + " " +  sobrenome + ", obrigado por criar uma conta em nosso banco," +
                " sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque ");


    }
}