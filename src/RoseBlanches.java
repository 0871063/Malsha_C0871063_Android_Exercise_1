import java.util.Scanner;

public class RoseBlanches {
    public static void main(String[] args) {

        int total$Amount;
        int bookAndSupplies;
        int remainBalance;
        int amountForExpenses;
        int noOfCoffees;
        int noOfFlashComputer;
        int noOfSubwayTicket;
        int remainForFlowers;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("How much did you receive money ($)? ");
        total$Amount = keyboard.nextInt();

        bookAndSupplies = (total$Amount / 4) * 3 ;

        remainBalance = total$Amount - bookAndSupplies;
        amountForExpenses =  remainBalance / 3 ;

        noOfCoffees = amountForExpenses / 2;
        noOfFlashComputer = amountForExpenses / 4;
        noOfSubwayTicket = amountForExpenses / 3;

        remainForFlowers = (amountForExpenses % 2) + (amountForExpenses % 4) + (amountForExpenses % 3) + (remainBalance % 3);

        System.out.println("Book and Supplies: $" + bookAndSupplies + " $");
        System.out.println("You can then buy:");
        System.out.println(noOfCoffees + " coffees");
        System.out.println(noOfFlashComputer + " Flash Computer Numbers");
        System.out.println(noOfSubwayTicket + " subway Tickets");
        System.out.println("and you will have " + remainForFlowers + " dollars for the white roses");
    }
}
