import java.util.Scanner;
public class GetUserName
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String firstName = "";
        String lastName = "";

        firstName = SafeInput.getNonZeroLength(in, "Enter your first name");
        lastName = SafeInput.getNonZeroLength(in, "Enter your last name");

        System.out.println("Your name is " + firstName + " " + lastName + ".");
    }
}
