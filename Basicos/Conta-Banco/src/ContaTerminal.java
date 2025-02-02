import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Por favor, digite o número da sua Conta: ");
        int conta = leia.nextInt();

        System.out.println("Por favor, digite a sua Agência : ");
        String agencia = leia.next();

        System.out.println("Por favor, digite o seu nome: ");
        String nome = leia.next();

        System.out.println("Por favor, digite o seu saldo: ");
        double saldo = leia.nextDouble();


        System.out.println(
                """
                Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo é %.2f
                """.formatted(nome, agencia, conta, saldo));
    }
}