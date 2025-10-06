import java.util.Scanner;
//  10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.
public class EX_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite a nota do 1 periodo");
        double a = scanner.nextDouble();
        System.out.println("digite a nota do 2 periodo");
        double b = scanner.nextDouble();
        System.out.println("digite a nota do 3 periodo");
        double c = scanner.nextDouble();
        System.out.println("Sua média foi " + (a + b + c) /3 );
        scanner.close();

    }
}
