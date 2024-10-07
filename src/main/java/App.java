import java.time.LocalDate;

import hb.fr.com.business.Expense;

/**
 * 
 */
public class App {

  /**
  * @param args
  */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.out.println("Bienvenue dans le Gestionnaire de Budget");
    Expense depense1 = new Expense("Courses", 50, LocalDate.of(2024, 10, 01));
    Expense depense2 = new Expense("Transport", 15, LocalDate.of(2024, 10, 02));
    System.out.println(depense1.toString());
    System.out.println(depense2.toString());
  }

}
