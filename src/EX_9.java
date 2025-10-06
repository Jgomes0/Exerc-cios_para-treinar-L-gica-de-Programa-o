import java.util.Scanner;

//9  Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura e imprima na tela sua condição
public class EX_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("DIGITE SUA ALTURA");
        double altura = scanner.nextDouble();
        System.out.println("DIGITE SEU PESO");
        double peso = scanner.nextDouble();
        double imc = peso/(altura*altura);
        if ( imc < 18.5){
            System.out.println("abaixo do peso ideal");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Peso ideal parabens");
        } else if ( imc >= 25.0 && imc <= 29.9){
            System.out.println("levemente acima do peso");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("obesidade grau 1");
        } else if (imc >= 35.9 && imc <= 39.9) {
            System.out.println("obesidade grau 2");
        } else {
            System.out.println("obesidade grau 3");
        }
        scanner.close();
    }

}
