import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Stream;

public class Exe01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        var scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de pessoas: ");
        var n = scanner.nextInt();

        var vectorHeight = new double[n];

        System.out.println("Digite a altura de " + n + " pessoas");
        for (var i = 0; i < n; i++) {
            vectorHeight[i] = scanner.nextDouble();
        }

        var avgHeight = Arrays.stream(vectorHeight).average().orElse(0.0);
        System.out.printf("Altura média %.2f%n", avgHeight);

        scanner.close();
    }
}
