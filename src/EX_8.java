import java.util.Arrays;
import java.util.Scanner;
//8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.
public class EX_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[3];
        numeros[0] = scanner.nextInt();
        numeros[1] = scanner.nextInt();
        numeros[2] = scanner.nextInt();

        Arrays.sort(numeros); // coloca em ordem crescente

        // imprime em ordem decrescente
        System.out.println(numeros[2] + " " + numeros[1] + " " + numeros[0]);

        scanner.close();
    }
}