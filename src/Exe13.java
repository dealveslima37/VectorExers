import entities.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exe13 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        var scanner = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados? ");
        var n = scanner.nextInt();
        scanner.nextLine();

        var vectorStudents = new Student[n];

        for (var i = 0; i < n; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "º aluno: ");
            var name = scanner.nextLine();
            var grade1 = Double.parseDouble(scanner.nextLine());
            var grade2 = Double.parseDouble(scanner.nextLine());

            vectorStudents[i] = new Student(name, grade1, grade2);
        }

        List<Student> approved = Arrays.stream(vectorStudents).filter(x -> x.finalGrade() >= 6.0).toList();

        System.out.println("Alunos aprovados");
        approved.forEach(student -> System.out.println(student.name()));

        scanner.close();
    }
}
