import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        var scanner = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        var n = Integer.parseInt(scanner.nextLine());

        var vector = new double[n];

        for (var i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vector[i] = Double.parseDouble(scanner.nextLine());
        }

        var avg = Arrays.stream(vector).average().orElse(0.0);
        List<Double> underAvg = Arrays.stream(vector).filter(x -> x < avg).boxed().toList();

        System.out.println();
        System.out.printf("Média do vetor = %.3f%n", avg);
        System.out.println("Elementos abaixo da média");
        underAvg.forEach(System.out::println);

        scanner.close();
    }
}
