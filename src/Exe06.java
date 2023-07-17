import entities.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exe06 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        var scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        var n = Integer.parseInt(scanner.nextLine());

        var vectorPerson = new Person[n];

        for (var i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "º pessoa");
            System.out.print("Nome: ");
            var name = scanner.nextLine();
            System.out.print("Idade: ");
            var age = Integer.parseInt(scanner.nextLine());
            System.out.print("Altura: ");
            var height = Double.parseDouble(scanner.nextLine());

            vectorPerson[i] = new Person(name, age, height);
        }

        double avgHeight = Arrays.stream(vectorPerson).mapToDouble(Person::height).average().orElse(0.0);
        List<Person> under16 = Arrays.stream(vectorPerson).filter(x -> x.age() < 16).toList();
        int percentage = under16.size() * 100 / n;

        System.out.println();
        System.out.printf("Altura média: %.2f%n", avgHeight);
        System.out.printf("Pessoas com menos de 16 anos: %d%%", percentage);
        System.out.println();
        under16.forEach(x -> System.out.println(x.name()));

        scanner.close();
    }
}
