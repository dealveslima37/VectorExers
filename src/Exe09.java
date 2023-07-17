import java.util.Scanner;

public class Exe09 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        var n = Integer.parseInt(scanner.nextLine());

        var vectorA = new int[n];
        var vectorB = new int[n];
        var vectorC = new int[n];

        System.out.println("Digite os valores do vetor A:");
        for (var i = 0; i < n; i++) {
            vectorA[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Digite os valores do vetor B:");
        for (var i = 0; i < n; i++) {
            vectorB[i] = Integer.parseInt(scanner.nextLine());
        }

        for (var x = 0; x < n; x++) {
            vectorC[x] = vectorA[x] + vectorB[x];
        }

        System.out.println("Vetor Resultante");
        for (var x : vectorC) {
            System.out.println(x);
        }

        scanner.close();
    }
}
