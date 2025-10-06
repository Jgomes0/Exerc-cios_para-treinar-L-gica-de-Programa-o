import java.util.Random;
//21 - Faça um algoritmo que mostre um valor aleatório entre 0 e 100.

public class EX_21 {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroint = random.nextInt(100);
        System.out.println(numeroint);

    }
}
