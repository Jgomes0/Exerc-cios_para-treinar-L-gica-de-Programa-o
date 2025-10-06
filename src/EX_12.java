import java.util.Scanner;
/*  12 - Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento
 pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado. */
public class EX_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double valor = scanner.nextDouble();

        System.out.println("Escolha a forma de pagamento:");
        System.out.println("1 - À Vista em Dinheiro ou Pix (15% de desconto)");
        System.out.println("2 - À Vista no Cartão de Crédito (10% de desconto)");
        System.out.println("3 - Parcelado em 2x no Cartão (sem juros)");
        System.out.println("4 - Parcelado em 3x ou mais no Cartão (10% de juros)");

        int opcao = scanner.nextInt();
        double valorFinal;

        switch (opcao) {
            case 1:
                valorFinal = valor * 0.85; // 15% de desconto
                break;
            case 2:
                valorFinal = valor * 0.90; // 10% de desconto
                break;
            case 3:
                valorFinal = valor; // sem alteração
                break;
            case 4:
                valorFinal = valor * 1.10; // 10% de juros
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        System.out.println("Valor final a ser pago: R$ " + valorFinal);
        scanner.close();
    }
}
