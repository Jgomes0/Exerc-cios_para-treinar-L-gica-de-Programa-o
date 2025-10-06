import java.util.Scanner;
// 1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.

public class EX_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite A, B e C separados por espaço: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("A soma de " + a + " + " + b + " é " + (a + b) +
                " e " + ((a + b < c) ? "é menor que C" : "não é menor que C"));

        sc.close();
    }
}
