public class Amstrongbroj {

    public static void main(String[] args) {
        Amstrong(args);
    }

    public static void Amstrong(String[] args) {

        for (int i = 1; i <= 9999; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    // Zadani Armstrong (suma kubova znamenki)
    public static boolean isArmstrong(int number) {
        int original = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit * digit;   // KUB — jer zadatak tako traži
            number /= 10;
        }
        return sum == original;
    }
}
