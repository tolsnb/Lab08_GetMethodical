import java.util.Scanner;
public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double total = 0;
        double input = 0;
        boolean done = false;

        do {
            input = SafeInput.getRangedDouble(in, "Enter the price of the next item", 0.5, 10);
            total += input;
            System.out.println("Your total is: $" + total);
            done = SafeInput.getYNConfirm(in, "Do you have more items to scan?");
        }while(!done);
        System.out.println("Your final total is $" + total);
        System.out.println("Thank you for shopping with us.");
    }
}
