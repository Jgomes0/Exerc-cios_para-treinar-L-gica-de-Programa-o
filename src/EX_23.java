import java.util.Scanner;
// Faça um algoritmo que efetue o cálculo do salário líquido de um professor. As informações fornecidas serão: valor da hora aula, número de aulas lecionadas no mês e percentual de desconto do INSS. Imprima na tela o salário líquido final.
public class EX_23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Leitura dos dados
        System.out.print("Digite o valor da hora aula: ");
        double valorHora = entrada.nextDouble();

        System.out.print("Digite o número de aulas lecionadas no mês: ");
        int aulas = entrada.nextInt();

        System.out.print("Digite o percentual de desconto do INSS: ");
        double descontoINSS = entrada.nextDouble();

        // Cálculo do salário bruto
        double salarioBruto = valorHora * aulas;

        // Cálculo do valor descontado
        double valorDesconto = (salarioBruto * descontoINSS) / 100;

        // Cálculo do salário líquido
        double salarioLiquido = salarioBruto - valorDesconto;

        // Exibição do resultado
        System.out.println("\nSalário Bruto: R$ " + salarioBruto);
        System.out.println("Desconto INSS: R$ " + valorDesconto);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);

        entrada.close();
    }
}
