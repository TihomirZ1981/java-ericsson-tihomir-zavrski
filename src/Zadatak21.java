import java.util.Scanner;

public class Zadatak21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        int slova = 0;
        int brojevi = 0;
        int ostali = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isLetter(c)) {
                slova++;
            } else if (Character.isDigit(c)) {
                brojevi++;
            } else {
                ostali++;
            }
        }

        System.out.println("Slova: " + slova);
        System.out.println("Brojevi: " + brojevi);
        System.out.println("Ostali znakovi: " + ostali);

        sc.close();
    }
}
