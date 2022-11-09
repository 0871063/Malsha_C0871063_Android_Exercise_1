import java.time.Year;
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {

        int age;
        int birthYear;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Provide your age:");
        age = keyboard.nextInt();
        int year = Year.now().getValue();
        birthYear = year - age;
        System.out.println("Your year of birth is $" + birthYear);
    }
}
