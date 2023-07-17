import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exe11 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        var n = Integer.parseInt(scanner.nextLine());

        var vector = new int[n];

        for (var i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vector[i] = Integer.parseInt(scanner.nextLine());
        }

        List<Integer> evenNumbers = Arrays.stream(vector).filter(x -> x % 2 == 0).boxed().toList();

        if (evenNumbers.isEmpty()) {
            System.out.println("Nenhum número par");
        } else {
            var avg = evenNumbers.stream().reduce(Integer::sum).orElse(0) / evenNumbers.size();
            System.out.printf("Média dos pares = %d%n", avg);
        }

        scanner.close();
    }
}
