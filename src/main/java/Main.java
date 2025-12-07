import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst:");
        String tekst = scanner.nextLine();
        String wynik = "";

        for (int i = 0; i < tekst.length(); i++) {
            char c = tekst.charAt(i);
            if (Character.isUpperCase(c))
                wynik += Character.toLowerCase(c);
            else
                wynik += Character.toUpperCase(c);
        }

        System.out.println("Wynik: " + wynik);
        scanner.close();
    }
}