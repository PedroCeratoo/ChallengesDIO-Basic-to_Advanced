import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        try {
            System.out.println("Escolha o primeiro parâmetro: ");
            int parametroUm = leia.nextInt();
            System.out.println("Escolha o segundo parâmetro: ");
            int parametroDois = leia.nextInt();

            contar(parametroUm, parametroDois);
        }
        catch (ParametrosInvalidosException e) {
            System.out.println("O Primeiro parâmetro não pode ser menor que o segundo !!! ");
        }
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm < parametroDois ) {
            throw new ParametrosInvalidosException();
        }
        else {
            int contagem = (parametroUm - parametroDois);

            for (int i = 0; i < contagem; i++) {
                System.out.println("Número: " + (i+1));
            }
        }
    }
}