import java.util.Scanner;
//13 Faça algoritmo que leia o nome e a idade de uma peso e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.
public class EX_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        String resultado = (idade >= 18) ? "maior" : "menor";
        System.out.println(nome + " tem " + idade + " anos e é " + resultado + " de idade.");
        scanner.close();
    }
}


