import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();

        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Dodaj nowego studenta: ");
        System.out.println("2 - Wypisz wszystkich studentow:");
        int wybor = scanner.nextInt();
        scanner.nextLine();

        if (wybor == 1) {
            System.out.println("Podaj imie studenta: ");
            String imie = scanner.nextLine();
            System.out.println("Podaj wiek studenta: ");
            int wiek = scanner.nextInt();
            Student student = new Student(imie, wiek);
            service.zapiszStudenta(student);

            System.out.println("Dodano studenta");
        } else if (wybor == 2) {
            service.wypiszStudentow();
        } else {
            System.out.println("Niepoprawny wybor");
        }
        scanner.close();
    }
}