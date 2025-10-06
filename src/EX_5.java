import java.util.Scanner;
// Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
public class EX_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salarioMinimo = 1293.20;
        System.out.print("Digite o valor do seu salário: ");
        double salarioUsuario = sc.nextDouble();

        double qtd = salarioUsuario / salarioMinimo;

        System.out.printf("O usuário recebe %.2f salários mínimos.%n", qtd);

        sc.close();
    }
}

