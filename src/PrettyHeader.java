import java.util.Scanner;
public class PrettyHeader
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String msg = "";
        boolean done = false;
        do {
            System.out.println("Enter a message to be put in the header: ");
            if(in.hasNext()){
                msg = in.nextLine();
                done = true;
            }
        }while(!done);

        String header = SafeInput.prettyHeader(msg);

        System.out.println(header);
    }
}
