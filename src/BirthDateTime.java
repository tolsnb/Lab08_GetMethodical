import java.util.Scanner;
public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 0;
        int hour = 0;
        int minute = 0;
        int group = 0;

        month = SafeInput.getRangedInt(in, "Enter your birth month as an integer", 1, 12);
        switch(month)
        {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                day = SafeInput.getRangedInt(in, "Enter the day you were born as an integer", 1, 31);
                break;
            case 4: case 6: case 9: case 11:
                day = SafeInput.getRangedInt(in, "Enter the day you were born as an integer", 1, 30);
                break;
            case 2:
                day = SafeInput.getRangedInt(in, "Enter the day you wer born as an integer", 1, 29);
                break;
        }
        year = SafeInput.getRangedInt(in, "Enter the year you were born as an integer [1950-2015]", 1950, 2015);
        hour = SafeInput.getRangedInt(in, "Enter the hour you were born as an integer [0-23]", 1, 24);
        minute = SafeInput.getRangedInt(in, "Enter the minute you were born as an integer", 1, 59);

        System.out.println("You were born " + month + "/" + day + "/" + year + " at " + hour + ":" + minute + ".");
    }
}
