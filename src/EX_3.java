import java.util.Scanner;
// Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,

public class EX_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0;

        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();

        if (a == b) {
            c = a + b;
            System.out.println("A soma é: " + (c));
        } else {
            c = a * b;
            System.out.println("A multiplicação é: " + (c));
            sc.close();
        }
    }
}