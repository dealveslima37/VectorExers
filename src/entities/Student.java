package entities;

public record Student(String name, double grade1, double grade2) {

    public double finalGrade() {
        return (grade1 + grade2) / 2.0;
    }

}
