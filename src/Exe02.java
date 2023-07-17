import entities.Product;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        var scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de produtos: ");
        var n = Integer.parseInt(scanner.nextLine());

        var vectorProducts = new Product[n];

        for (var i = 0; i < n; i++) {
            System.out.print("Nome: ");
            var name = scanner.nextLine();
            System.out.print("Preço R$: ");
            var email = Double.parseDouble(scanner.nextLine());

            vectorProducts[i] = new Product(name, email);

        }

        var avgPrice = Arrays.stream(vectorProducts).mapToDouble(Product::price).average().orElse(0.0);

        System.out.printf("Média dos preços R$: %.2f%n", avgPrice);

        scanner.close();
    }
}
