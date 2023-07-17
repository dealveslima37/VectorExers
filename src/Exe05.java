import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Exe05 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        var scanner = new Scanner(System.in);

        System.out.print("Quantos números voce vai digitar? ");
        var n = Integer.parseInt(scanner.nextLine());

        var vector = new double[n];

        for (var i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vector[i] = Double.parseDouble(scanner.nextLine());
        }

        var sum = Arrays.stream(vector).sum();
        var avg = Arrays.stream(vector).average().orElse(0.0);

        System.out.print("Valores = ");
        Arrays.stream(vector).forEach(x -> System.out.print(x + " "));

        System.out.printf("\nSoma = %.2f%n", sum);
        System.out.printf("Média = %.2f%n", avg);


        scanner.close();
    }
}
