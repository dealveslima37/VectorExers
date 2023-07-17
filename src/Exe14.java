import entities.Person;

import java.util.*;

public class Exe14 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        var scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        var n = Integer.parseInt(scanner.nextLine());

        var vectorPersons = new Person[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Altura da " + (i + 1) + "º pessoa: ");
            var height = Double.parseDouble(scanner.nextLine());
            System.out.print("Gênero da " + (i + 1) + "º pessoa: ");
            var genre = scanner.nextLine().toLowerCase();

            vectorPersons[i] = new Person(height, genre);
        }

        double minHeight = Arrays.stream(vectorPersons).mapToDouble(Person::height).min().orElse(0.0);
        double maxHeight = Arrays.stream(vectorPersons).mapToDouble(Person::height).max().orElse(0.0);
        long numberOfMen = Arrays.stream(vectorPersons).filter(x -> x.genre().startsWith("m")).count();
        double avgWomenHeight = Arrays.stream(vectorPersons)
                .filter(x -> x.genre().startsWith("f"))
                .mapToDouble(Person::height)
                .average()
                .orElse(0.0);

        System.out.println();
        System.out.printf("Menor altura = %.2f%n", minHeight);
        System.out.printf("Maior altura = %.2f%n", maxHeight);
        System.out.printf("Média das alturas das mulheres = %.2f%n", avgWomenHeight);
        System.out.println("Número de homens = " + numberOfMen);

        scanner.close();
    }
}
