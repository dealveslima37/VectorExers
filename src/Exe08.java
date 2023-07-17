import java.util.Arrays;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Exe08 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        var scanner = new Scanner(System.in);

        System.out.print("Quantos números voce vai digitar? ");
        var n = scanner.nextInt();
        scanner.nextLine();

        var vector = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vector[i] = Double.parseDouble(scanner.nextLine());
        }

        double maxValue = Arrays.stream(vector).max().orElse(0);

        int position = IntStream.range(0, vector.length)
                .filter(i -> vector[i] == maxValue)
                .findFirst()
                .orElse(-1);

        System.out.println();
        System.out.println("Maior valor: " + maxValue);
        System.out.println("Posição: " + position);

        scanner.close();
    }
}
