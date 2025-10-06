import java.util.Scanner;
// 2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.

public class EX_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // positivo ou negativo
        System.out.println("Digite um numero: ");
        int a = sc.nextInt();
        String posNeg = (a > 0) ? "positivo" : (a < 0) ? "negativo" : "zero";
        System.out.println("O número é " + posNeg + ".");

        // Par ou ímpar
        String parImpar = (a % 2 == 0) ? "par" : "ímpar";
        System.out.println("O número é " + parImpar + ".");
        sc.close();
    }
}
