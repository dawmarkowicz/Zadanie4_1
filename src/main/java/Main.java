import java.util.Scanner;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import org.junit.jupiter.api.Test;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar: ");
        int rozmiar = scanner.nextInt();

        for (int i = 0; i <= rozmiar; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}

// @Test
// void addition() {
// assertEquals(2, 1 + 1);
// }