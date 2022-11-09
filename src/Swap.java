import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {

        int x;
        int y;
        int z;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter x : ");
        x = keyboard.nextInt();
        System.out.print("Enter y : ");
        y = keyboard.nextInt();

        System.out.println("Before swapping: x: $" + x + "; y:$" + y);

        z = x;
        x = y;
        y = z;

        System.out.println("After swapping: x: $" + x + "; y:$" + y);
    }
}
