import entities.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.Scanner;

public class Exe12 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        var n = Integer.parseInt(scanner.nextLine());

        var vectorPerson = new Person[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "º pessoa");
            System.out.print("Nome: ");
            var name = scanner.nextLine();
            System.out.print("Idade: ");
            var age = Integer.parseInt(scanner.nextLine());

            vectorPerson[i] = new Person(name, age);
        }

        Optional<Person> oldestPerson = Arrays.stream(vectorPerson)
                .max(Comparator.comparingInt(Person::age));

        oldestPerson.ifPresent(person -> {
            String oldestName = person.name();
            System.out.println("A pessoa mais velha é: " + oldestName);
        });

        scanner.close();
    }
}
