
import java.util.Scanner;
public class greeterMain
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String input = sc.nextLine();
        Greeter worldGreeter = new Greeter(input);
        worldGreeter.greet();
    }
}
