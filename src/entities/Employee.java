package entities;

public class Employee {

    private final int id;
    private final String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double percentage) {
        salary += (salary * percentage / 100.0);
    }

    @Override
    public String toString() {
        return id + ", " + name + ", R$ " + String.format("%.2f", salary);
    }
}
