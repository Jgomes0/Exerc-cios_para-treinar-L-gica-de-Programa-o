import java.util.Scanner;
// Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.
public class EX_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a - 1 );
        System.out.println( a + 1);
        sc.close();

    }
}
