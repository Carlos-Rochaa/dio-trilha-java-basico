import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o número da conta");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o número da Agência ");
        String agencia = sc.next();
        sc.nextLine();
        System.out.println("Digite o seu nome ");
        String nome = sc.nextLine();
        System.out.println("Digite o seu saldo");
        double saldo = sc.nextDouble();
        StringBuilder sb = new StringBuilder();
        sb.append("Resumo da Conta Bancária:\n")
                .append("Número da Conta: ").append(num).append("\n")
                .append("Agência: ").append(agencia).append("\n")
                .append("Titular: ").append(nome).append("\n")
                .append("Saldo: R$ ").append(String.format("%.2f", saldo)).append("\n");
        System.out.println(sb.toString());
    }

}