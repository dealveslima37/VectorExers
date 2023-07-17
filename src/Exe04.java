import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.print("Quantos números voce vai digitar? ");
        var n = Integer.parseInt(scanner.nextLine());

        var vector = new int[n];

        for (var i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vector[i] = scanner.nextInt();
        }

        System.out.println("Números negativos");
        for(var x : vector){
            if(x < 0){
                System.out.println(x);
            }
        }

        scanner.close();
    }
}
