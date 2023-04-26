import java.util.Scanner;
public class Reggie
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String pattern = "^[OoSsVvQq]$";
        String input;

        input = SafeInput.getRegExString(in, "Enter your M number", pattern);
        System.out.println(input);
    }
}
