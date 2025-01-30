import java.time.LocalDate;
import java.time.Period;
public class AgeCalculator {
    public static void main(String[] args) {
        int birthYear = 1995;
        int birthMonth = 05;
        int birthDay = 15;
       LocalDate currentDate = LocalDate.now();
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        Period age = Period.between(birthDate, currentDate);
        System.out.println("Age: " + age.getYears() + " years, " + age.getMonths() + " months, " + age.getDays() + " days.");
    }
}
