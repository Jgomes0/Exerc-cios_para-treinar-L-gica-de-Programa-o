import java.util.Scanner;
// Faça um algoritmo que leia três valores que representam os três lados de um triângulo e verifique se são válidos, determine se o triângulo é equilátero, isósceles ou escaleno.
public class EX_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o lado A: ");
        int a = sc.nextInt();

        System.out.print("Digite o lado B: ");
        int b = sc.nextInt();

        System.out.print("Digite o lado C: ");
        int c = sc.nextInt();

        // Verifica se forma um triângulo
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Triângulo Equilátero");
            } else if (a == b || a == c || b == c) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Não é um triângulo válido");
        }

        sc.close();
    }
}
