public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        Student student1 = new Student("Jan", 20);
        Student student2 = new Student("Kowalski", 22);
        service.zapiszStudenta(student1);
        service.zapiszStudenta(student2);

        System.out.println("Lista studentow:");
        service.wypiszStudentow();
    }
}