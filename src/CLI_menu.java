import java.io.Console;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by geoffreykuhn on 3/10/15.
 */
public class CLI_menu {

   public static int menu(){

        InputStreamReader user_input = new InputStreamReader(System.in);

        //System.out.println("Which subset would you like to run? subset 0 is preselected for now \n\n");
       System.out.println("How many times do you want to run this group of tests? \n\n");
       Scanner reader = new Scanner(System.in);
       Integer num_runs =reader.nextInt();

       // throw new RuntimeException("Menu exception");

       return num_runs;
    }

    public static void exit(){

        throw new RuntimeException("Menu exit exception");

    }


}
