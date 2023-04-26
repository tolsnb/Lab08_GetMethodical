import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        double dubble = 0;
        int Integer = 0;
        String YorN = "";

        YorN = SafeInput.getYNConfirm(in, "Yes or No");
        System.out.println(YorN);
    }

}