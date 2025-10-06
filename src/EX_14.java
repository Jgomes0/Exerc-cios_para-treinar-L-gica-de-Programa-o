import java.util.Scanner;
// 14 Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores.
public class EX_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Após a troca:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        scanner.close();
    }
}
