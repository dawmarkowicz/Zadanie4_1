import java.util.Scanner;
// import static org.junit.jupiter.api.Assertions.assertEquals;
// import org.junit.jupiter.api.Test;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        int liczba = scanner.nextInt();
        boolean czyPierwsza = true;

        for (int i = 2; i < liczba; i++)
            if (liczba % i == 0) {
                czyPierwsza = false;
            }
        if (czyPierwsza)
            System.out.println("Liczba jest pierwsza");
        else
            System.out.println("Liczba nie jest pierwsza");
        scanner.close();
    }
}
// @Test
// void addition() {
// assertEquals(2, 1 + 1);
// }