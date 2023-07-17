package entities;

public record Person(String name, int age, double height, String genre) {

    public Person(String name, int age, double height) {
        this(name, age, height, "");
    }

    public Person(String name, int age) {
        this(name, age, 0, "");
    }

    public Person(double height, String genre) {
        this("", 0, height, genre);
    }

}
