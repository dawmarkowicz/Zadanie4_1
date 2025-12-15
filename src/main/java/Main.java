import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Service service = new Service();

    System.out.println("Dodaj nowego studenta:");
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj imie studenta: ");
    String imie = scanner.nextLine();
    System.out.println("Podaj wiek studenta: ");
    int wiek = scanner.nextInt();
    Student student = new Student(imie, wiek);
    service.zapiszStudenta(student);

    System.out.println("Lista studentow:");
    service.wypiszStudentow();
    scanner.close();
  }
}