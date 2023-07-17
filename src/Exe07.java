import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exe07 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.print("Quantos números voce vai digitar? ");
        var n = Integer.parseInt(scanner.nextLine());

        var vector = new int[n];

        for (var i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vector[i] = Integer.parseInt(scanner.nextLine());
        }

        List<Integer> evenNumbers = Arrays.stream(vector).filter(x -> x % 2 == 0).boxed().toList();

        System.out.println("Números pares");
        evenNumbers.forEach(x -> System.out.print(x + " "));
        System.out.println();
        System.out.println("Quantidade de pares " + evenNumbers.size());

        scanner.close();
    }
}
