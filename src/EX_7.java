import java.util.Scanner;
//7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.
public class EX_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean b1 = scanner.nextBoolean();
        Boolean b2 = scanner.nextBoolean();
        System.out.println(b1 == b2);

    }
}
