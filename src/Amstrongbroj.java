public class Amstrongbroj {

    public static void main(String[] args) {

        int limit = 20000;  // 1) definirana gornja granica

        // 2) validacija
        if (limit < 1) {
            System.out.println("Limit mora biti veći od nule.");
            return;
        }

        System.out.println("Armstrongovi brojevi između 1 i " + limit + " su:");

        // 4) pozivanje Armstrong metode u petlji
        for (int i = 1; i <= limit; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    // 3) logika u metodi
    public static boolean isArmstrong(int number) {
        int original = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit * digit;  // i dalje kubovi (³)
            number /= 10;
        }

        return sum == original;
    }
}
