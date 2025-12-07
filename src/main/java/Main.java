import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Liczba nie moze byc ujemna");
        } else {
            long silnia = 1;
            for (int i = 1; i <= n; i++) {
                silnia *= i;
            }
            System.out.println("Silnia liczby " + n + " wynosi: " + silnia);
        }
    }
}
