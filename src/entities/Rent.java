package entities;

public record Rent(String name, String email) {

    @Override
    public String toString() {
        return name + ", " + email;
    }
}
