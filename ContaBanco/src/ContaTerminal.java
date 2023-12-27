import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da agência: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite a Agencia: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o primeiro nome: ");
        String primeiroNome = scanner.next();

        System.out.println("Por favor, digite o sobrenome: ");
        String sobrenome = scanner.next();
        
        System.out.println(("Por favor, digite o saldo: "));
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + primeiroNome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$" + saldo + " já está disponivel para saque.");
    }
}
