import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    
    /*
     *  Atributo	    Tipo	    Exemplo
        Numero	        Inteiro	    1021
        Agencia	        Texto	    067-8
        Nome Cliente	Texto	    MARIO ANDRADE
        Saldo	        Decimal	    237.48

        Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:

        "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".
     */

    public static void main(String[] args) throws Exception {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    int conta = 0;
    String agencia;
    String primeiroNome;
    String segundoNome;
    double saldo = 0;

    System.out.println("Olá, para iniciar uma operação me informe seu nome e sobrenome: (Sem acentos) ");
    primeiroNome = scanner.next();
    segundoNome = scanner.next();

    String nomeCliente = primeiroNome.concat(" ").concat(segundoNome);

    System.out.println("Olá " + nomeCliente + ", agora insira o número da sua agência: ");
    agencia = scanner.next();

    System.out.println("Ótimo, sua agência é: " + agencia + ", agora por favor me informe a sua conta: ");
    conta = scanner.nextInt();

    System.out.println("Informe o valor que deseja depositar: (Em valor americano. Ex: R$ 1,000 coloque 1.000) ");
    saldo = scanner.nextDouble();

    System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");



    





}
}
