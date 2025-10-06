import java.util.Scanner;
// Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos, meses e dias essa pessoa ja viveu. Leve emconsideração o ano com 365 dias e o mês com 30 dias.
public class EX_15 {
    static int anoatual = 2025;
    static int anoNascer;

    public void TempoDeVida(int anoatual, int anoNascer ){
        int idade = anoatual - anoNascer;
        System.out.println("A sua idade é " + idade);
        int meses = idade * 12;
        int dias = idade * 365;
        System.out.println("dias " + dias);
        System.out.println("meses " + meses);
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Diga em qual ano que você nasceu");
         anoNascer = scanner.nextInt();
         EX_15 obj = new EX_15();
         obj.TempoDeVida(anoatual, anoNascer);


        scanner.close();
    }
}