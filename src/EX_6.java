import java.util.Scanner;
//6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
public class EX_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        System.out.println(n + ( n  * 0.05));
        scanner.close();
    }
}
