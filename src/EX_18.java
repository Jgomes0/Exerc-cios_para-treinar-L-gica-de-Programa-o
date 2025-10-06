// Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano. Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que Francisco seja maior que Sara.
public class EX_18 {
    public static void main(String[] args){
        int francisco = 150; // altura em cm
        int sara = 110;      // altura em cm
        int anos = 0;

        while (francisco <= sara) {
            francisco += 2; // cresce 2 cm por ano
            sara += 3;      // cresce 3 cm por ano
            anos++;

            // segurança para não entrar em loop infinito
            if (anos > 1000) {
                System.out.println("Francisco nunca será mais alto que Sara.");
                return;
            }
        }

        System.out.println("Francisco será mais alto que Sara em " + anos + " anos.");
    }
}
