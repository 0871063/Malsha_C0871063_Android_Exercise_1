import java.util.Scanner;

public class Degree3 {
    public static void main(String[] args) {

        int a;
        int b;
        int c;
        double x;
        double polynomialValue;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a (int) : ");
        a = keyboard.nextInt();
        System.out.print("Enter b (int) : ");
        b = keyboard.nextInt();
        System.out.print("Enter c (int) : ");
        c = keyboard.nextInt();
        System.out.print("Enter x (double) : ");
        x = keyboard.nextDouble();

        double s1 = (a + b) / 2;
        double s2 = x * x * x;
        double s3 =  (a + b ) * ( a + b );
        double s4 = (x * x);
        polynomialValue = (( (a + b) / 2 ) * ( x * x * x )) + ((( a + b ) * ( a + b )) * (x * x)) + a + b + c ;
        System.out.println("The value of polynomial is $" + polynomialValue);
    }
}