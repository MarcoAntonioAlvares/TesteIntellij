import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero da sua conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o numero de sua Agencia: ");
        String agencia = scanner.next();

        System.out.println("Qual o seu nome? ");
        String nomeCliente = scanner.next();

        System.out.println("O seu saldo é: ");
        double saldo = scanner.nextDouble();

        System.out.println("Numero da conta: "+ numero);
        System.out.println("Agencia: "+ agencia);
        System.out.println("Nome: " + nomeCliente);
        System.out.println("Saldo disponivel: " + saldo);
    }
}