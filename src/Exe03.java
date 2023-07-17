import entities.Rent;

import java.util.Scanner;

public class Exe03 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.print("Quantos quartos serão reservados? ");
        var n = Integer.parseInt(scanner.nextLine());

        var vectorRent = new Rent[10];

        for (var i = 0; i < n; i++) {
            System.out.println("Reserva #" + (i + 1));
            System.out.print("Nome: ");
            var name = scanner.nextLine();
            System.out.print("Email: ");
            var email = scanner.nextLine();
            System.out.print("Quarto: ");
            var room = Integer.parseInt(scanner.nextLine());

            vectorRent[room] = new Rent(name, email);
        }

        System.out.println();
        for (int i = 0; i < vectorRent.length; i++) {
            if (vectorRent[i] != null) {
                System.out.println(i + ": " + vectorRent[i]);
            }
        }


    }
}
