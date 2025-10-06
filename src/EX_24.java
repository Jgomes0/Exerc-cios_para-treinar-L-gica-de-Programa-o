import java.util.Scanner;

// Faça um algoritmo que calcule a quantidade de litros de combustível gastos em uma viagem, sabendo que o carro faz 12km com um litro. Deve-se fornecer ao usuário o tempo que será gasto na viagem a sua velocidade média, distância percorrida e a quantidade de litros utilizados para fazer a viagem.
public class EX_24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o tempo gasto na viagem (em horas): ");
        double tempo = entrada.nextDouble();

        System.out.print("Digite a velocidade média (em km/h): ");
        double velocidade = entrada.nextDouble();

        // Cálculos
        double distancia = tempo * velocidade;
        double litrosUsados = distancia / 12;

        // Saída de resultados
        System.out.println("\n==== RESULTADOS ====");
        System.out.println("Tempo gasto: " + tempo + " horas");
        System.out.println("Velocidade média: " + velocidade + " km/h");
        System.out.println("Distância percorrida: " + distancia + " km");
        System.out.println("Litros de combustível usados: " + litrosUsados + " L");

        entrada.close();
    }
}
