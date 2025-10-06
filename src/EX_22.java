import java.util.Scanner;
// Faça um algoritmo que leia dois valores inteiros A e B, imprima na tela o quociente e o resto da divisão inteira entre eles.
public class EX_22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Leitura dos valores
        System.out.print("Digite o valor de A: ");
        int A = entrada.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = entrada.nextInt();
        if (B == 0) {
            System.out.println("Erro: divisão por zero não é permitida.");
        } else {
            int quociente = A / B;
            int resto = A % B;

            System.out.println("Quociente: " + quociente);
            System.out.println("Resto: " + resto);
        }
        entrada.close();
    }
}