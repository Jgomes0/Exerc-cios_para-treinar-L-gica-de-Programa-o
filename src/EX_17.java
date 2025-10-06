import java.util.Scanner;
// Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius. Imprima na tela as duas temperaturas.
public class EX_17 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite a temperatura em Fahrenheit: ");
            double F = sc.nextDouble();

            double C = (5.0 * (F - 32)) / 9.0;

            System.out.println("Temperatura em Fahrenheit: " + F);
            System.out.println("Temperatura em Celsius: " + C);

            sc.close();
        }
    }

