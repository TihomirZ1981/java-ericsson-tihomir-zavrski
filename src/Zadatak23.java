import java.util.Scanner;

public class Zadatak23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Učitavanje iznosa
        double iznos = sc.nextDouble();

        // Vrijednosti novčanica i kovanica
        double[] values = {
                500, 200, 100, 50, 20, 10, 5,
                2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01
        };

        System.out.println("Morate uzvratiti:");

        for (int i = 0; i < values.length; i++) {
            int broj = (int) (iznos / values[i]);

            if (broj > 0) {
                System.out.println(broj + "*" + values[i]);
                iznos = iznos - broj * values[i];

                // korekcija zbog double preciznosti
                iznos = Math.round(iznos * 100) / 100.0;
            }
        }

        sc.close();
    }
}
