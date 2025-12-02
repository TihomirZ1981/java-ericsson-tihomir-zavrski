//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 9999; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isArmstrong(int number) {
        int original = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }

        return sum == original;
    }
}
