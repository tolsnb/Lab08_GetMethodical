import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class SafeInput
{
    public static String getNonZeroLength(Scanner pipe, String prompt)
    {
        String retString = "";
        do {
            System.out.println("\n" + prompt + ": ");
            retString = pipe.nextLine();
        }while(retString.length() == 0);

        return retString;
    }

    public static int getInt(Scanner pipe, String prompt)
    {
        int retInt = 0;
        String invalid = "";
        boolean done = false;
        do {
            System.out.println("\n" + prompt + ": ");
            if(pipe.hasNextInt()){
                retInt = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else
            {
                invalid = pipe.nextLine();
                System.out.println("Enter an integer.");
            }
        }while(!done);

        return retInt;
    }

    public static double getDouble(Scanner pipe,  String prompt)
    {
        double retDouble = 0;
        String invalid = "";
        boolean done = false;
        do {
            System.out.println("\n" + prompt + ":");
            if(pipe.hasNextDouble())
            {
                retDouble = pipe.nextDouble();
                pipe.nextLine();
            }
            else
            {
                invalid = pipe.nextLine();
                System.out.println("Enter a double.");
            }

            return retDouble;
        }while(!done);
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retInt = 0;
        String invalid = "";
        boolean done = false;
        do {
            System.out.println("\n" + prompt + ":");
            if(pipe.hasNextInt())
            {
                retInt = pipe.nextInt();
                pipe.nextLine();
                if(low <= retInt && retInt <= high){
                    done = true;
                }
                else
                {
                    System.out.println("Integer is not within the given range! Try again.");
                }
            }
            else
            {
                invalid = pipe.nextLine();
                System.out.println();
            }
        }while(!done);

        return retInt;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double retDouble = 0;
        String invalid = "";
        boolean done = false;

        do {
            System.out.println("\n" + prompt + ":");
            if (pipe.hasNextDouble())
            {
                retDouble = pipe.nextDouble();
                pipe.nextLine();
                if(low <= retDouble && retDouble <= high){
                    done = true;
                }
                else
                {
                    System.out.println("Integer is not within the given range! Try again.");
                }
            }
        }while(!done);

        return retDouble;
    }

    public static String getYNConfirm(Scanner pipe, String prompt)
    {
        String confirm = "";
        boolean done = false;
        do {
            System.out.println("\n" + prompt + ":");
            if(pipe.hasNext())
            {
                confirm = pipe.nextLine();
            }
            if(confirm.equalsIgnoreCase("Y"))
            {
                confirm = "Y";
                done = true;
            }
            else if(confirm.equalsIgnoreCase("N"))
            {
                confirm = "N";
                done = true;
            }
            else
            {
                System.out.println("Input either a Y for Yes or an N for No.");
            }
        }while(!done);

        return confirm;
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        Pattern pattern = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
        String userInput = "";
        boolean done = false;

        do {
            System.out.println("\n" + prompt + ":");
            if(pipe.hasNext())
            {
                userInput = pipe.nextLine();
                Matcher matcher = pattern.matcher(userInput);
                if(matcher.matches()){
                    done = true;
                }
                else{
                    System.out.println("No pattern matches!");
                }
            }
            else
            {
                System.out.println("Enter a valid string input!");
            }
        }while(!done);
        return userInput
    }
}
