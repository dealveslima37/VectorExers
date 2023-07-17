import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exe15 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        var scanner = new Scanner(System.in);

        System.out.print("Quantos funcionários serão registrados? ");
        var n = scanner.nextInt();
        scanner.nextLine();

        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.println("Funcionário #" + (i + 1));
                System.out.print("Id: ");
                var id = Integer.parseInt(scanner.nextLine());
                var empId = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
                if (empId == null) {
                    System.out.print("Nome: ");
                    var name = scanner.nextLine();
                    System.out.print("Salário R$: ");
                    var salary = Double.parseDouble(scanner.nextLine());

                    employees.add(new Employee(id, name, salary));
                    break;
                } else {
                    System.out.println("Já existe um funcionário cadastrado com o id " + id);
                }
            }
        }

        System.out.print("Entre com o id do funcionário que terá aumento: ");
        var idEmp = Integer.parseInt(scanner.nextLine());
        var emp = employees.stream().filter(x -> x.getId() == idEmp).findFirst().orElse(null);

        if (emp != null) {
            System.out.print("Entre com a porcentagem: ");
            var percentage = Double.parseDouble(scanner.nextLine());
            emp.increaseSalary(percentage);
        } else {
            System.out.println("Não existe funcionário cadastrado com o id " + idEmp);
        }

        System.out.println();
        System.out.println("Lista de funcionários");
        employees.forEach(System.out::println);

        scanner.close();
    }
}
