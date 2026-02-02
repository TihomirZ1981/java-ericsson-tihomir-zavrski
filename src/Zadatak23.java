import java.util.Scanner;

public class Zadatak23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Unos iznosa, npr. 12.37
        double unos = sc.nextDouble();

        // sve u cente
        int iznos = (int) Math.round(unos * 100);

        int[] values = {
                50000, 20000, 10000, 5000, 2000, 1000,
                500, 200, 100, 50, 20, 10, 5, 2, 1
        };

        System.out.println("Morate uzvratiti:");

        for (int i = 0; i < values.length; i++) {
            int broj = iznos / values[i];

            if (broj > 0) {
                System.out.println(broj + " x " + (values[i] / 100.0));
                iznos = iznos % values[i];
            }
        }

        sc.close();
    }
}

