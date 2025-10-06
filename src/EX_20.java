import java.util.Scanner;

// 20 - Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.
public class EX_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero que você quer ver a tabuada");
        int x = scanner.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(x * i);

        }
    }
}
