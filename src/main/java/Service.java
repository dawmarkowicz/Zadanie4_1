import java.io.*;

public class Service {
  public void zapiszStudenta(Student student) {
    try {
      FileWriter writer = new FileWriter("db.txt", true);
      writer.write(student.getImie() + " " + student.getWiek() + "\n");
      writer.close();

    } catch (Exception exeption) {
      System.out.println("Error: " + exeption.getMessage());
    }
  }

  public void wypiszStudentow() {
    try {
      BufferedReader br = new BufferedReader(new FileReader("db.txt"));
      String linia;
      while ((linia = br.readLine()) != null) {
        System.out.println(linia);
      }
      br.close();

    } catch (Exception exeption) {
      System.out.println("Error: " + exeption.getMessage());
    }
  }
}