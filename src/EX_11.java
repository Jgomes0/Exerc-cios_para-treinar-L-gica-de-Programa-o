import java.util.Scanner;

/*  11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e
se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7. */
public class EX_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("qual o seu nome? ");
        String nome = scanner.nextLine();
        System.out.println("qual foi sua nota 1 ");
        int n1 = scanner.nextInt();
        System.out.println("qual foi sua nota 2 ");
        int n2 = scanner.nextInt();
        System.out.println("qual foi sua nota 3 ");
        int n3 = scanner.nextInt();
        System.out.println("qual foi sua nota 4 ");
        int n4 = scanner.nextInt();
        double media = (n1 + n2 + n3 + n4) / 4;
        if( media >= 7.0 ){
            System.out.println("voce foi aprovado");
        } else {
            System.out.println("voce foi reprovado");
        }
        scanner.close();
    }
}
